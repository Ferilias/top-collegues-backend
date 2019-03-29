package dev.top.controller;

public class ColleguesTempo {

	private String matricule;
	private String pseudo;
	private String photoUrl;
	
	
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public String getPhotoUrl() {
		return photoUrl;
	}
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	
	public ColleguesTempo(String matricule, String pseudo, String photoUrl) {
		super();
		this.matricule = matricule;
		this.pseudo = pseudo;
		this.photoUrl = photoUrl;
	}

	
	
	
}
