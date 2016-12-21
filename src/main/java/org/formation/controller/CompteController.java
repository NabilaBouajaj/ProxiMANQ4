package org.formation.controller;

import java.io.Serializable;
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
	
	private Compte compte;
	String CompteType="";
	private double montant;
	
	@Autowired
	CompteService compteService;
	
	@Autowired
	ClientService clientService;
	
	public String creerCompte(){
		Client client = new Client();
		client.setCompteCourant(new CompteCourant());
		
		client.setCompteEpargne(new CompteEpargne());
		
		try {
			clientService.merge(client);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "error";
		}
		
		return null;
		
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
	public void creerUnCompte(){
		
	
		
		
	}

}
