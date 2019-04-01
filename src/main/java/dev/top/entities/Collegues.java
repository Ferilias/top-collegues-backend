package dev.top.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Collegues {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	private Integer id;

	private String pseudo;

	private Integer score;

	private String photoUrl;
	
	private String nom;
	
	private String prenom;
	
	private String adresse;
	
	private String email;

	public Collegues() {
		
	}

	public Collegues(Integer id, String pseudo, Integer score, String photoUrl, String nom, String prenom,
			String adresse, String email) {
		super();
		this.id = id;
		this.pseudo = pseudo;
		this.score = score;
		this.photoUrl = photoUrl;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.email = email;
	}

	public Collegues(String string, int i, String string2) {
		this.pseudo = string;
		this.score = i;
		this.photoUrl = string2;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



}
