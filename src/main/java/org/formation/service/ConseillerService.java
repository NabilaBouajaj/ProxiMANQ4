package org.formation.service;

import java.util.List;

import org.formation.dao.IConseillerDao;
import org.formation.model.Conseiller;
import org.springframework.beans.factory.annotation.Autowired;

public class ConseillerService {

	@Autowired
	IConseillerDao conseillerDao;

	void persist(Conseiller conseiller) throws Exception {
		conseillerDao.persist(conseiller);
	}

	void merge(Conseiller conseiller) throws Exception {
		conseillerDao.merge(conseiller);
	}

	void remove(Conseiller id) throws Exception {
		conseillerDao.remove(id);
	}

	Conseiller findById(Conseiller id) throws Exception {
		return conseillerDao.findById(id);
	}

	List<Conseiller> findAll() throws Exception {
		return conseillerDao.findAll();
	}

	List<Conseiller> findByProperty(String prop, Object val) throws Exception {
		return conseillerDao.findByProperty(prop, val);
	}

	List<Conseiller> findInRange(int firstResult, int maxResults) throws Exception {
		return conseillerDao.findInRange(firstResult, maxResults);
	}

	long count() throws Exception {
		return conseillerDao.count();
	}
}
