package org.formation.model;

import java.util.ArrayList;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;

@Entity
public class Conseiller extends Banquier {

	@OneToMany(cascade = { CascadeType.PERSIST }, mappedBy = "conseiller")
	private List<Client> listClients = new ArrayList<Client>();

	@ManyToOne(cascade = { CascadeType.PERSIST })
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

}
