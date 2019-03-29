package dev.top.entities;

public class PapaColleguesJson {

	private String matricule;
	private String photo;
	
	public PapaColleguesJson() {
		
	}

	public PapaColleguesJson(String matricule, String photo) {
		super();
		this.matricule = matricule;
		this.photo = photo;
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

}
