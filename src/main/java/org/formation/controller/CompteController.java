package org.formation.controller;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

import org.formation.model.Client;
import org.formation.model.Compte;
import org.formation.model.CompteCourant;
import org.formation.model.CompteEpargne;
import org.formation.service.ClientService;
import org.formation.service.CompteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CompteController implements Serializable{
	
	private CompteCourant compteCourant;
	private CompteEpargne compteEpargne;
	private Compte compte;
	private double montant;
	private LocalDate dateOuverture;
	
	@Autowired
	CompteService compteService;
	
	@Autowired
	ClientService clientService;
	
	public String creerCompteCourant(){
		Client client = new Client();
		dateOuverture = LocalDate.now();
		CompteCourant cc = new CompteCourant(montant, dateOuverture);
	
		client.setCompteCourant(cc);
		
		
		try {
			clientService.merge(client);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "error";
		}
		
		return "accueil.xhtml";
		
	}
	public String creerCompteEpargne(){
		Client client = new Client();
		dateOuverture = LocalDate.now();
		CompteEpargne ce = new CompteEpargne(montant, dateOuverture);
		
		client.setCompteEpargne(ce);
		
		try {
			clientService.merge(client);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "error";
		}
		
		return "accueil.xhtml";
		
	}

	public Collection<Compte> getAllComptes(){
		Collection<Compte> comptes = new ArrayList<>();
		try {
			comptes = compteService.findAll();
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		return comptes;
		
	}
	
	
	
	private static final long serialVersionUID = -8754223287899679722L;
	public void creerComptePourClient(Compte compte, Client client){
		
		
	
		
		
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public LocalDate getDateOuverture() {
		return dateOuverture;
	}
	public void setDateOuverture(LocalDate dateOuverture) {
		this.dateOuverture = dateOuverture;
	}
	

}
