package dev.top.controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VoteWeb {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Vote action;

	public Vote getAction() {
		return action;
	}

	public void setAction(Vote action) {
		this.action = action;
	}
}
