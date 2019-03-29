package dev.top.entities;

public class PapaColleguesJson {

	private String matricule;
	private String photo;
	private String nom;
	private String prenom;
	private String email;
	private String adresse;

	
	public PapaColleguesJson() {
		
	}


	public PapaColleguesJson(String matricule, String photo, String nom, String prenom, String email, String adresse) {
		super();
		this.matricule = matricule;
		this.photo = photo;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.adresse = adresse;
	}


	public String getMatricule() {
		return matricule;
	}


	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}


	public String getPhoto() {
		return photo;
	}


	public void setPhoto(String photo) {
		this.photo = photo;
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	
}	