package org.formation.model;

import java.time.LocalDate;

import javax.persistence.Entity;

@Entity
public class CompteEpargne extends Compte{
	
	public CompteEpargne(){
		
	}

	public CompteEpargne(double montant, LocalDate dateOuverture) {
		super(montant, dateOuverture);
		// TODO Auto-generated constructor stub
	}
	

}
