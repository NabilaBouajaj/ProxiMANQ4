package org.formation.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

@Entity
//@Inheritance(strategy=InheritanceType.JOINED)
public class Gerant extends Banquier{
	
	@OneToMany(mappedBy="gerant", cascade={CascadeType.PERSIST})
	private Set<Conseiller> listConseillers= new HashSet<Conseiller>();

	public Set<Conseiller> getListConseillers() {
		return listConseillers;
	}

	public void setListConseillers(Set<Conseiller> listConseillers) {
		this.listConseillers = listConseillers;
	}

	public Gerant(String nom, String prenom, String login, String motDePasse) {
		super(nom, prenom, login, motDePasse);
	}
	
	
	
	

}
