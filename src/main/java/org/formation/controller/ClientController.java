package org.formation.controller;

import java.io.Serializable;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import org.formation.model.Adresse;
import org.formation.model.Client;
import org.formation.model.Conseiller;
import org.formation.service.ClientService;
import org.formation.service.ConseillerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

@Controller
public class ClientController implements Serializable {
	String nom;
	String prenom;
	String email;
	String rue;
	String ville;
	String numero;
	String codePostal;

	// Conseiller conseiller = new Conseiller("Dieu", "Notre père", "dieu",
	// "dieu");

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

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

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
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

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"/META-INF/spring/applicationContext-db-mysql.xml");
		ClientService clientService = applicationContext.getBean("clientService", ClientService.class);
		ConseillerService conseillerService = applicationContext.getBean("conseillerService", ConseillerService.class);

		Adresse adresse = new Adresse(numero, rue, ville, codePostal);
		Client client = new Client(nom, prenom, email, adresse);
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
		Conseiller conseiller = (Conseiller) session.getAttribute("Conseiller");
		System.out.println("après session");
		// client.setConseiller(conseiller);
		conseiller.getListClients().add(client);
		// client.setConseiller(conseiller);
		System.out.println("après set");
		// conseillerService.persist(conseiller);
		// System.out.println("après création cons");
		clientService.createClient(client);
		System.out.println("à la fin");
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
