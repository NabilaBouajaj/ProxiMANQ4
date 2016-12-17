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

	void remove(Client id) throws Exception{
		clientDao.remove(id);
	}
	
	Client findById(Client id) throws Exception{
		return clientDao.findById(id);
	}
	
	List<Client> findAll() throws Exception{
		return clientDao.findAll();
	}
	
	List<Client> findByProperty(String prop, Client motcle) throws Exception{
		return clientDao.findByProperty(prop, motcle);
	}
	
	List<Client> findInRange(int firstResult, int maxResults) throws Exception{
		return clientDao.findInRange(firstResult, maxResults);
	}
	
	long count() throws Exception{
		return clientDao.count();
		
	}
	

}
