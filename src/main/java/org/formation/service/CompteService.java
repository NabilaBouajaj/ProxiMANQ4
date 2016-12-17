package org.formation.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;




import org.formation.dao.ICompteDao;
import org.formation.model.Compte;
import org.springframework.beans.factory.annotation.Autowired;

@Component
@Service
public class CompteService {

	@Autowired
	ICompteDao compteDao;

	void persist(Compte compte) throws Exception {
		compteDao.persist(compte);
	}

	void merge(Compte compte) throws Exception {
		compteDao.merge(compte);
	}

	void remove(Compte id) throws Exception {
		compteDao.remove(id);
	}

	Compte findById(Compte id) throws Exception {
		return compteDao.findById(id);
	}

	List<Compte> findAll() throws Exception {
		return compteDao.findAll();
	}

	List<Compte> findByProperty(String prop, Object val) throws Exception {
		return compteDao.findByProperty(prop, val);
	}

	List<Compte> findInRange(int firstResult, int maxResults) throws Exception {
		return compteDao.findInRange(firstResult, maxResults);
	}

	long count() throws Exception {
		return compteDao.count();
	}
}
