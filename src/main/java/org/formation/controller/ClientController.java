package org.formation.controller;

import org.formation.model.Client;
import org.formation.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ClientController {
	Client client;
	@Autowired
	ClientService clientService;

	public String creerClient() throws Exception {
		clientService.persist(client);
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
