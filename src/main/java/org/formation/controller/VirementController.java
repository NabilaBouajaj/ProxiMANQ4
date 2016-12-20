package org.formation.controller;

import java.text.DateFormat;
import java.util.Date;

import org.formation.dao.IVirementDao;
import org.formation.model.Client;
import org.formation.model.Virement;
import org.formation.service.VirementService;
import org.springframework.beans.factory.annotation.Autowired;

public class VirementController {
	
	private Virement virement;
	private Client clientEx;
	private Client clientBe;
	private long compteExId;
	private long compteBeId;
	private double montant;
	
	@Autowired
	VirementService virementService;

	
	// getter & setter
	public Virement getVirement() {
		return virement;
	}

	public void setVirement(Virement virement) {
		this.virement = virement;
	}

	public Client getClientEx() {
		return clientEx;
	}

	public void setClientEx(Client clientEx) {
		this.clientEx = clientEx;
	}

	public Client getClientBe() {
		return clientBe;
	}

	public void setClientBe(Client clientBe) {
		this.clientBe = clientBe;
	}

	public long getCompteExId() {
		return compteExId;
	}

	public void setCompteExId(long compteExId) {
		this.compteExId = compteExId;
	}

	public long getCompteBeId() {
		return compteBeId;
	}

	public void setCompteBeId(long compteBeId) {
		this.compteBeId = compteBeId;
	}

	public double getMountant() {
		return montant;
	}

	public void setMountant(double montant) {
		this.montant = montant;
	}

	public VirementService getVirementService() {
		return virementService;
	}

	public void setVirementService(VirementService virementService) {
		this.virementService = virementService;
	}

	// controleur
	public VirementController() {
		super();
	}
	
	// methode qui verifie si le compte beneficiaire et expediteur existe
	public boolean compteCourantBeExist(){
		if(clientBe.getCompteCourant() != null){
			return true;
		}
		return false;
	}
	public boolean compteCourantExExist(){
		if(clientEx.getCompteCourant() != null){
			return true;
		}
		return false;
	}
	public boolean compteEpargneBeExist(){
		if(clientBe.getCompteEpargne() != null){
			return true;
		}
		return false;
	}
	public boolean compteEpargneExExist(){
		if(clientEx.getCompteEpargne() != null){
			return true;
		}
		return false;
	}
	
	// methode de virement
	
public String virement(){
	Date now = new Date();
	DateFormat shDateFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
	Virement virement = new Virement();
	virement.setMontant(montant);
	virement.setCompteEx(compteExId);
	virement.setCompteBe(compteBeId);
	virement.setDate(shDateFormat.format(now));
	System.out.println(virement);
	virementService.virement(virement);
	return "virement.xhtml";
	}
	
	
	
	
	

}
