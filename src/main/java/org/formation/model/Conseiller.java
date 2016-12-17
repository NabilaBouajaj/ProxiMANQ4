package org.formation.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity
public class Conseiller extends Banquier{
	
	@OneToMany(cascade={CascadeType.ALL}, mappedBy="conseiller")
	private List<Client> listClients = new ArrayList<Client>();
	
	

	

	

	public List<Client> getListClients() {
		return listClients;
	}

	public void setListClients(List<Client> listClients) {
		this.listClients = listClients;
	}

	public Conseiller(String nom, String prenom, String login, String motDePasse, List<Client> clients) {
		super(nom, prenom, login, motDePasse);
		this.listClients = clients;
	}

	public Conseiller() {
		
	}

	public Conseiller(String nom, String prenom, String login, String motDePasse) {
		super(nom, prenom, login, motDePasse);
	}
	
	
	
	

}
