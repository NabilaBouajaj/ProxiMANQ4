package org.formation.controller;

import java.util.ArrayList;
import java.util.List;

import org.formation.model.Adresse;
import org.formation.model.Client;
import org.formation.model.Conseiller;
import org.formation.service.ClientService;
import org.springframework.stereotype.Controller;

@Controller
public class BankController {

	public List<Client> obtenirListeClients() {
		List<Client> listclient = new ArrayList<Client>();
		Client client = new Client("Christ", "Jesu", "JesuChrist@paradis.amen",
				new Adresse(7, "rue du paradis", "Ciel", "77777"));
		listclient.add(client);
		return listclient;

	}

	public Integer obtenirNombreCompte() {
		return 0;

	}

}
