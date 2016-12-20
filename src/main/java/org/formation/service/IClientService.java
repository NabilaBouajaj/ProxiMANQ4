package org.formation.service;

import java.util.List;

import org.formation.model.Client;

public interface IClientService {
public void persist(Client c) throws Exception;
	
	public void merge(Client c) throws Exception;

	public void remove(Client c) throws Exception;
	
	public Client findById(long id) throws Exception;
	
	public List<Client> findAll() throws Exception;
	
	public List<Client> findByProperty(String prop, Object val) throws Exception;
	
	public List<Client> findInRange(int firstResult, int maxResults) throws Exception;
	
	public long count() throws Exception;
}
