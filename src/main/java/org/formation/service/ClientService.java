package org.formation.service;



import java.util.List;

import org.formation.dao.IClientDao;
import org.formation.model.Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class ClientService {
	
	@Autowired
	IClientDao clientDao;
	
	
public void persist(Client c) throws Exception{
	clientDao.persist(c);
	
}
	
	public void merge(Client c) throws Exception{
		clientDao.merge(c);
	}

	public void remove(Client id) throws Exception{
		clientDao.remove(id);
	}
	
	public Client findById(Client id) throws Exception{
		return clientDao.findById(id);
	}
	
	public List<Client> findAll() throws Exception{
		return clientDao.findAll();
	}
	
	public List<Client> findByProperty(String prop, Client motcle) throws Exception{
		return clientDao.findByProperty(prop, motcle);
	}
	
	public List<Client> findInRange(int firstResult, int maxResults) throws Exception{
		return clientDao.findInRange(firstResult, maxResults);
	}
	
	public long count() throws Exception{
		return clientDao.count();
		
	}
	

}
