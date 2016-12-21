package org.formation.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class CompteCourant extends Compte{
	
public CompteCourant(){
	
}

public CompteCourant(double montant, LocalDate dateOuverture) {
	super(montant, dateOuverture);
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "CompteCourant numero = "+ getId() + " solde = " + + getMontant() + " €";
}




	
}
