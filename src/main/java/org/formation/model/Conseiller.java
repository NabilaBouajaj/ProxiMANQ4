package org.formation.model;


import java.util.HashSet;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;
@Entity
//@Inheritance(strategy=InheritanceType.JOINED)
//@Component
public class Conseiller extends Banquier{
	
	@OneToMany(cascade={CascadeType.PERSIST}, mappedBy="conseiller")
	private Set<Client> listClients = new HashSet<Client>();
	
	@ManyToOne(cascade={CascadeType.PERSIST})
	@JoinColumn(name="gerant_id")
	private Gerant gerant;

	


	public Set<Client> getListClients() {

	

	
		return listClients;
	}

	public void setListClients(Set<Client> listClients) {
		this.listClients = listClients;
	}

	public Conseiller(String nom, String prenom, String login, String motDePasse, Set<Client> clients) {
		super(nom, prenom, login, motDePasse);
		this.listClients = clients;
	}

	public Conseiller() {
		
	}

	public Conseiller(String nom, String prenom, String login, String motDePasse) {
		super(nom, prenom, login, motDePasse);
	}
	
	
	
	

}
