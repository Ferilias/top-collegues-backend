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

	public Collegues() {
		
	}

	public Collegues(String pseudo, Integer score, String imgUrl) {
		super();
		this.pseudo = pseudo;
		this.score = score;
		this.photoUrl = imgUrl;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the pseudo
	 */
	public String getPseudo() {
		return pseudo;
	}

	/**
	 * @param pseudo the pseudo to set
	 */
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	/**
	 * @return the score
	 */
	public Integer getScore() {
		return score;
	}

	/**
	 * @param score the score to set
	 */
	public void setScore(Integer score) {
		this.score = score;
	}

	/**
	 * @return the imgUrl
	 */
	public String getPhotoUrl() {
		return photoUrl;
	}

	/**
	 * @param imgUrl the imgUrl to set
	 */
	public void setPhotoUrl(String imgUrl) {
		this.photoUrl = imgUrl;
	}

}
