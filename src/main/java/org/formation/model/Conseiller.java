package org.formation.model;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Conseiller extends Banquier {

	@OneToMany(mappedBy = "conseiller", fetch = FetchType.EAGER)
	private List<Client> listClients = new ArrayList<Client>();

	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "gerant_id")
	private Gerant gerant;

	public List<Client> getListClients() {

		return listClients;
	}

	public void setListClients(List<Client> listClients) {
		this.listClients = listClients;
	}

	public Conseiller(String nom, String prenom, String login, String motDePasse) {
		super(nom, prenom, login, motDePasse);

	}

	public Conseiller() {

	}

	@Override
	public String toString() {
		return "Conseiller [listClients=" + listClients + ", gerant=" + gerant + "]";
	}

}
