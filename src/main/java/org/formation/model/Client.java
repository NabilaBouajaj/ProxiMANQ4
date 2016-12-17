package org.formation.model;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Client extends Personne {
	
	private String email;
	
	@Autowired
	@Embedded
	Adresse adresse;
	
	@ManyToOne
	@JoinColumn(name="conseiller_id")
	private Conseiller conseiller;

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

	
	public Client() {
		
	}

	public Conseiller getConseiller() {
		return conseiller;
	}

	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}

	public Client(String nom, String prenom, String email, Adresse adresse) {
		super(nom, prenom);
		this.email = email;
		this.adresse = adresse;
	
	}


}
