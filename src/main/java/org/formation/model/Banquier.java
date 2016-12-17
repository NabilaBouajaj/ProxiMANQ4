package org.formation.model;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Banquier extends Personne{
	
	private String login;
	private String motDePasse;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	public Banquier(String nom, String prenom, String login, String motDePasse) {
		super(nom, prenom);
		this.login = login;
		this.motDePasse = motDePasse;
	}
	public Banquier() {
		
	}
	
	

}
