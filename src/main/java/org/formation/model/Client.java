package org.formation.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Client extends Personne {
	
	private String email;
	
	@Autowired
	@Embedded
	Adresse adresse;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public Client(String nom, String prenom, String email, Adresse adresse) {
		super(nom, prenom);
		this.email = email;
		this.adresse = adresse;
	}

	public Client() {
		
	}
	
	

}
