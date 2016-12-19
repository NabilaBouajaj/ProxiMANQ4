package org.formation.service;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;


import org.formation.dao.IConseillerDao;
import org.formation.model.Conseiller;
import org.springframework.beans.factory.annotation.Autowired;

@Component
@Service
public class ConseillerService {

	@Autowired
	IConseillerDao conseillerDao;

	public void persist(Conseiller conseiller) throws Exception {
		conseillerDao.persist(conseiller);
	}

	public void merge(Conseiller conseiller) throws Exception {
		conseillerDao.merge(conseiller);
	}

	public void remove(Conseiller id) throws Exception {
		conseillerDao.remove(id);
	}

	public Conseiller findById(Conseiller id) throws Exception {
		return conseillerDao.findById(id);
	}

	public List<Conseiller> findAll() throws Exception {
		return conseillerDao.findAll();
	}

	public List<Conseiller> findByProperty(String prop, Object val) throws Exception {
		return conseillerDao.findByProperty(prop, val);
	}

	public List<Conseiller> findInRange(int firstResult, int maxResults) throws Exception {
		return conseillerDao.findInRange(firstResult, maxResults);
	}

	public long count() throws Exception {
		return conseillerDao.count();
	}
}
