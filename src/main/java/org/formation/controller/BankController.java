package org.formation.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import org.formation.model.Adresse;

import org.formation.model.Client;
import org.formation.model.Conseiller;
import org.formation.service.ClientService;
import org.formation.service.ConseillerService;

import org.springframework.stereotype.Controller;


@Controller
public class BankController {
	// Banquier banq = new Banquier();
	Conseiller conseiller = new Conseiller("Dieu", "Notre père", "dieu", "dieu");
	String login;
	String password;
	List<Client> listclient = new ArrayList<Client>();

	public List<Client> getListclient() {
		return listclient;
	}

	public void setListclient(List<Client> listclient) {
		this.listclient = listclient;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// @Autowired
	ConseillerService conseillerService = new ConseillerService();
	// @Autowired
	ClientService clientService = new ClientService();

	// public String seConnecter(Model model) throws Exception {
	// int varpers = 0;
	//
	// // Méthode inachevée
	//
	// List<Conseiller> conseillers = conseillerService.findAll();
	//
	// for (Conseiller conseiller : conseillers) {
	//
	// if ((conseiller.getLogin().equals(login)) &&
	// (conseiller.getMotDePasse().equals(password))) {
	// HttpSession session = (HttpSession)
	// FacesContext.getCurrentInstance().getExternalContext()
	// .getSession(true);
	// session.setAttribute("ConseillerConnecté", banq);
	// return "acceuil.xhtml";
	// } else {
	// return "home.xhtml";
	// }
	// }
	// return "";
	//
	// }

	// model.addAttribute("conseillerConnecté",new Conseiller("Dieu","Notre
	// père","dieu","dieu"));if(varpers==1)
	//
	// {
	// return "acceuil.xhtml";
	// }else if(varpers==2)
	// {
	// return "acceuilGerant.xhtml";
	// }else
	// {
	// return "home.xhtml";
	// }
	// }

	public List<Client> obtenirListeClients() {
		Client client = new Client("Christ", "Jesus", "JesusChrist@paradis.amen",
				new Adresse("7", "rue du paradis", "Ciel", "77777"));
		conseiller.getListClients().add(client);
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
		session.setAttribute("ConseillerConnecté", conseiller);
		listclient = conseiller.getListClients();

		// listclient.add(client);
		return listclient;

	}

	public Integer obtenirNombreCompte() {
		return 0;

	}

}
