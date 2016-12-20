package org.formation.service;

import java.util.List;

import org.formation.dao.IVirementDao;
import org.formation.model.Compte;
import org.formation.model.Virement;
import org.springframework.beans.factory.annotation.Autowired;

public class VirementService {
	
	@Autowired
	IVirementDao virementDao;
	
	@Autowired
	CompteService compteService;
	
	
	public void persist(Virement v) throws Exception{
		virementDao.persist(v);
	}
	
	public void merge(Virement v) throws Exception{
		virementDao.merge(v);
	}

	public void remove(Virement v) throws Exception{
		virementDao.remove(v);
	}
	
	public Virement findById(long id) throws Exception{
		return virementDao.findById(id);
	}
	
	public List<Virement> findAll() throws Exception{
		return virementDao.findAll();
	}
	
	public List<Virement> findByProperty(String prop, Object val) throws Exception{
		return virementDao.findByProperty(prop, val);
	}
	
	public List<Virement> findInRange(int firstResult, int maxResults) throws Exception{
		return virementDao.findInRange(firstResult, maxResults);
}
	
	public long count() throws Exception{
		return virementDao.count();
	}
	
	/**
	 * 
	 * @param compteExId = id compte expediteur / compteEx = compte expediteur
	 * @param compteBeId = id compte beneficiaire / compteBe = compte beneficiaire
	 * @return une methode boolean qui nous retourne si le virement a ete effectue (true) ou pas (false)
	 */
	public boolean virement(Virement v) {
	
	
	try {
		long compteBeId = v.getCompteBe();
		long compteExId = v.getCompteEx();
		
		Compte compteBe = compteService.findById(compteBeId);
		Compte compteEx = compteService.findById(compteExId);
		
		compteBe.setMontant(compteEx.getMontant() + v.getMontant());
		compteEx.setMontant(compteEx.getMontant() - v.getMontant());
		
		compteService.merge(compteEx);
		compteService.merge(compteBe);
	
		persist(v);
	
		return true;
	} catch (Exception e) {
		e.printStackTrace();
		return false;
	}
}

}
