package org.formation.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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
public class BankController implements Serializable {
	private static final long serialVersionUID = 3457285546581409379L;
	// Banquier banq = new Banquier();
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

	// Pour l'Authentification
	// public String seConnecter(Model model) throws Exception {
	// int varpers = 0;
	//
	// // M�thode inachev�e
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
	// session.setAttribute("ConseillerConnect�", banq);
	// return "acceuil.xhtml";
	// } else {
	// return "home.xhtml";
	// }
	// }
	// return "";
	//
	// }

	// model.addAttribute("conseillerConnect�",new Conseiller("Dieu","Notre
	// p�re","dieu","dieu"));if(varpers==1)
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
	public String chargerCons() throws Exception {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"/META-INF/spring/applicationContext-db-mysql.xml");
		ConseillerService conseillerService = applicationContext.getBean("conseillerService", ConseillerService.class);
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
		List<Conseiller> listCons = conseillerService.findAll();
		System.out.println(listCons);
		System.out.println("Apr�s liste");
		Conseiller conseiller = new Conseiller();
		// for (Conseiller conseiller2 : listCons) {
		// if (conseiller2.getLogin().equals("jesus")) {
		// conseiller = conseiller2;
		// System.out.println(conseiller);
		// }
		// }
		System.out.println("Avant Boucle Conseiller");
		for (Conseiller conseiller2 : listCons) {
			if (conseiller2.getId() == 62) {
				System.out.println("trouv� : " + conseiller2);
				conseiller = conseiller2;
			}
		}
		System.out.println("Avant find");
		// Conseiller conseiller = conseillerService.findById(62);
		System.out.println(conseiller);
		System.out.println("Apr�s find");
		session.setAttribute("Conseiller", conseiller);

		return "accueil.xhtml";

	}

	public void creerCons() throws Exception {

		Conseiller conseiller = new Conseiller("Dieu", "Notre p�re", "dieu", "dieu");

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"/META-INF/spring/applicationContext-db-mysql.xml");
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
		session.setAttribute("Conseiller", conseiller);
		ConseillerService conseillerService = applicationContext.getBean("conseillerService", ConseillerService.class);
		conseillerService.persist(conseiller);

	}

	public List<Client> obtenirListeClients() throws Exception {
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
		Conseiller cons = (Conseiller) session.getAttribute("Conseiller");
		listclient = cons.getListClients();

		// listclient.add(client);
		return cons.getListClients();

	}

	public Integer obtenirNombreCompte() {
		return 0;

	}

}
