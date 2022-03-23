package tn.esprit.spring.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Magasin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
private String nom;
private String adresse;
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
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
@Override
public String toString() {
	return "Magasin [id=" + id + ", nom=" + nom + ", adresse=" + adresse + "]";
}
public Magasin() {
	super();
	// TODO Auto-generated constructor stub
}
public Magasin(String nom, String adresse) {
	super();
	this.nom = nom;
	this.adresse = adresse;
}



}
