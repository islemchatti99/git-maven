package tn.esprit.spring.entities;

public abstract class Personne {
 String nom; 
 String prennom;
 
 
public Personne() {
	super();
}
public Personne(String nom, String prennom) {
	super();
	this.nom = nom;
	this.prennom = prennom;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrennom() {
	return prennom;
}
public void setPrennom(String prennom) {
	this.prennom = prennom;
}
public abstract void afficheSalaire();

}
