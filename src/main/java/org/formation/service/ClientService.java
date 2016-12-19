package org.formation.service;

import java.util.List;

import javax.annotation.Resource;

import org.formation.dao.IClientDao;
import org.formation.model.Client;
import org.springframework.stereotype.Service;

@Service
public class ClientService implements IClientService {
	@Resource
	private IClientDao iclientdao;

	@Override
	public void persist(Client c) throws Exception {
		iclientdao.persist(c);

	}

	@Override
	public void merge(Client c) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Client c) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public Client findById(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> findByProperty(String prop, Object val) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> findInRange(int firstResult, int maxResults) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}