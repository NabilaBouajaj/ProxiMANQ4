package org.formation.service;

import java.util.List;

import org.formation.model.Conseiller;

public interface IConseillerService {

	public void persist(Conseiller conseiller) throws Exception;

	public void merge(Conseiller conseiller) throws Exception;

	public void remove(Conseiller id) throws Exception;

	public Conseiller findById(int id) throws Exception;

	public List<Conseiller> findAll() throws Exception;

	public List<Conseiller> findByProperty(String prop, Object val) throws Exception;

	public List<Conseiller> findInRange(int firstResult, int maxResults) throws Exception;

	public long count() throws Exception;

}
