package org.formation.controller;

import org.formation.model.Adresse;
import org.formation.model.Client;
import org.formation.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

@Controller
public class ClientController {
	String nom;
	String prenom;
	String rue;
	String ville;
	int numero;
	String codePostal;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	// @Autowired
	ClientService clientService = new ClientService();

	public String creerClient() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/applicationContext-db-mysql.xml");
		ClientService clientService = context.getBean("clientService", ClientService.class);

		Adresse adresse = new Adresse(numero, rue, ville, codePostal);
		Client client = new Client(nom, prenom, null, adresse);

		clientService.createClient(client);

		return "accueil.xhtml";

	}

	public String modifierClient(Client client) throws Exception {
		clientService.merge(client);
		return "accueil.xhtml";

	}

	public void detailsClient(int idclient) throws Exception {
		Client client = clientService.findById(idclient);

	}

}
