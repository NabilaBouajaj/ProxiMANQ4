package org.formation.test;

import org.formation.config.BankConfig;
import org.formation.dao.IClientDao;
import org.formation.dao.impl.ClientDaoimpl;
import org.formation.model.Adresse;
import org.formation.model.Client;
import org.formation.model.Conseiller;
import org.formation.service.ClientService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	
	public static void main(String[] args) throws Exception{
//		ApplicationContext context = new ClassPathXmlApplicationContext("/META-INF/spring/applicationContext-db-mysql.xml");
//
//		
//		IClientDao clientDao = (IClientDao) context.getBean("service", IClientDao.class);
	

		
		
		
//		IClientDao clientDao = new ClientDaoimpl();
//		Conseiller conseiller = new Conseiller("nab", "pop", "nab", "nab");
//		Client client = new Client("bob", "bob", "bob@fr", new Adresse(7, "rue", "gen", "92230"));
//		Client client = context.getBean("client", Client.class);
//		conseiller.getListClients().add(client);
//		client.setConseiller(conseiller);
//		clientDao.persist(client);
//		
		
		 
		ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/applicationContext-db-mysql.xml");
		ClientService clientService = context.getBean("clientService", ClientService.class);

		clientService.createClient(new Client("toto","tata","log2",new Adresse("36", "avenue Cyrnos", "Paris","hhh")));
		clientService.createClient(new Client("Bernard","Tapie","log2",new Adresse("36", "avenue Cyrnos", "Paris", "hhhh")));
//	    System.out.println("!!!!!!!!!!\n"+service.listClients());
	}

}
