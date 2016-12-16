package org.formation.model;

import javax.persistence.Embeddable;

@Embeddable
public class Adresse {
	
	private int numero;
	private String rue;
	private String ville;
	private String codePostal;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public Adresse(int numero, String rue, String ville, String codePostal) {
		super();
		this.numero = numero;
		this.rue = rue;
		this.ville = ville;
		this.codePostal = codePostal;
	}
	public Adresse() {
		super();
	}
	
	

}
