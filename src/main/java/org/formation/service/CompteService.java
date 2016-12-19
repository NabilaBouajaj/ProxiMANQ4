package org.formation.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;


import org.formation.dao.ICompteDao;
import org.formation.model.Compte;
import org.springframework.beans.factory.annotation.Autowired;

@Component
@Service
public class CompteService {

	@Autowired
	ICompteDao compteDao;

	public void persist(Compte compte) throws Exception {
		compteDao.persist(compte);
	}

	public void merge(Compte compte) throws Exception {
		compteDao.merge(compte);
	}

	public void remove(Compte id) throws Exception {
		compteDao.remove(id);
	}

	public Compte findById(int id) throws Exception {
		return compteDao.findById(id);
	}

	public List<Compte> findAll() throws Exception {
		return compteDao.findAll();
	}

	public List<Compte> findByProperty(String prop, Object val) throws Exception {
		return compteDao.findByProperty(prop, val);
	}

	public List<Compte> findInRange(int firstResult, int maxResults) throws Exception {
		return compteDao.findInRange(firstResult, maxResults);
	}

	public long count() throws Exception {
		return compteDao.count();
	}
}
