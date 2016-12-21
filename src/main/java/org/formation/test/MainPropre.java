package org.formation.test;

import java.util.List;

import org.formation.model.Adresse;
import org.formation.model.Client;
import org.formation.model.Conseiller;
import org.formation.service.ClientService;
import org.formation.service.ConseillerService;
import org.formation.service.IClientService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainPropre {
	public static void main(String[] args) throws Exception {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"/META-INF/spring/applicationContext-db-mysql.xml");
		ClientService clientService = applicationContext.getBean("clientService", ClientService.class);
		// Client client = new Client("nom", "jidrs", "ovs", new Adresse());
		// clientService.createClient(client);

		ConseillerService conseillerService = applicationContext.getBean("conseillerService", ConseillerService.class);
		// Conseiller conseiller = new Conseiller("Dieu", "Notre père", "dieu",
		// "dieu");
		// conseillerService.persist(conseiller);

		// client.setConseiller(conseiller);
		// System.out.println(client);
		// System.out.println(client.getConseiller().getNom());
		// conseillerService.merge(conseiller);
		// clientService.createClient(client);
		List<Client> listClientTot = clientService.findAll();
		System.out.println(listClientTot);
	}
}
