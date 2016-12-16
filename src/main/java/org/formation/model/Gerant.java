package org.formation.model;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class Gerant extends Banquier{
	
	private List<Conseiller> listConseillers;

	public List<Conseiller> getListConseillers() {
		return listConseillers;
	}

	public void setListConseillers(List<Conseiller> listConseillers) {
		this.listConseillers = listConseillers;
	}

	public Gerant(String nom, String prenom, String login, String motDePasse) {
		super(nom, prenom, login, motDePasse);
	}
	
	
	
	

}
