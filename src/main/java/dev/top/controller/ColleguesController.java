package dev.top.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import dev.top.entities.Collegues;
import dev.top.entities.PapaColleguesJson;
import dev.top.exception.TopColleguesException;
import dev.top.repos.ColleguesRepo;

@CrossOrigin
@RestController()
@RequestMapping("/collegues")
public class ColleguesController {

	@Autowired
	private ColleguesRepo colleguesRepo;

	@GetMapping
	public List<Collegues> findAll() {
		return this.colleguesRepo.findAll();
	}

	public Collegues voter(String pseudo, Vote action) {

		if (pseudo == null || action == null) {
			throw new TopColleguesException("Une des valeurs n'est pas bonne");
		}
		Collegues collegueTrouve = this.colleguesRepo.findByPseudo(pseudo)
				.orElseThrow(() -> new TopColleguesException("Collegue pas trouvé"));

		Integer score = collegueTrouve.getScore();
		if (action.equals(Vote.AIMER)) {
			collegueTrouve.setScore(score + 100);
		} else if (action.equals(Vote.DETESTER)) {
			collegueTrouve.setScore(score - 100);
		}
		return collegueTrouve;
	}

	public Collegues verifExist(ColleguesTempo cf) {
		if (cf.getMatricule() == null) {
			throw new TopColleguesException("Le matricule est vide");
		}
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl = "https://tommy-sjava.cleverapps.io/collegues?matricule=";
		PapaColleguesJson[] response = restTemplate.getForObject(fooResourceUrl + cf.getMatricule(),
				PapaColleguesJson[].class);
		if (response.length == 0) {
			throw new TopColleguesException("le matricule correspond à aucun matricule existant");
		} else {
			Collegues col = new Collegues();
			col.setPseudo(cf.getPseudo());
			if (cf.getPhotoUrl().equals(null)) {
				col.setPhotoUrl(response[0].getPhoto());
			} else {
				col.setPhotoUrl(cf.getPhotoUrl());
			}
			col.setScore(0);
			return col;
		}

	}

	// patch/collegues/PSEUDO
	@PatchMapping("/{pseudo}")
	@Transactional
	public Collegues voter(@PathVariable String pseudo, @RequestBody VoteWeb vote) {
		return this.voter(pseudo, vote.getAction());
	}

	// Post/ColleguesForm/pseudo
	@PostMapping
	@Transactional
	public Collegues verification(@RequestBody ColleguesTempo col) {
		return colleguesRepo.save(verifExist(col));

	}
}
