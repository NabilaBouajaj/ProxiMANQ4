package org.formation.model;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.persistence.*;

@Entity
@ManagedBean

public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nom;
	private String prenom;

	private String email;

	// @Autowired
	@Embedded
	Adresse adresse;

	@ManyToOne(cascade = { CascadeType.PERSIST })
	@JoinColumn(name = "conseiller_id")
	private Conseiller conseiller;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Client() {

	}

	public Conseiller getConseiller() {
		return conseiller;
	}

	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}

	public Client(String nom, String prenom, String email, Adresse adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.adresse = adresse;

	}

}
