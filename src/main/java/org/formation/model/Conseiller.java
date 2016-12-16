package org.formation.model;

import java.util.List;

import javax.persistence.Entity;
@Entity
public class Conseiller extends Banquier{
	
	private List<Client> listClients;
	
	

	public List<Client> getClients() {
		return listClients;
	}

	public void setClients(List<Client> clients) {
		this.listClients = clients;
	}

	public Conseiller(String nom, String prenom, String login, String motDePasse, List<Client> clients) {
		super(nom, prenom, login, motDePasse);
		this.listClients = clients;
	}

	public Conseiller() {
		
	}
	
	

}
