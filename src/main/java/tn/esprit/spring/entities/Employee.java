/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.spring.entities;

/**
 *
 * @author zohratebib
 */
public abstract class Employee {
	protected int id;
	protected String nom, adresse;
	protected int nbHeure;
	protected int cin;

	public Employee(int id, String n) {
		this.id = id;
		nom = n;
		System.out.println("2 para Emp");
	}

	public Employee(int id, String nom, String adresse, int nbHeure) {
		this.id = id;
		this.nom = nom;
		this.adresse = adresse;
		this.nbHeure = nbHeure;
	}

	public Employee(int id, String n, String ad) {
		this(id, n);
		this.adresse = ad;
		System.out.println("Emp 3 par");
	}

	public Employee() {
		System.out.println("Employe par defaut");
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

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getNbHeure() {
		return nbHeure;
	}

	public void setNbHeure(int nbHeure) {
		this.nbHeure = nbHeure;
	}

	public int getCin() {
		return cin;
	}

	public void setCin(int cin) {
		this.cin = cin;
	}

	@Override
	public String toString() {
		return "id " + id + "nom :" + nom + "adresse :" + adresse + "nombre heure :" + nbHeure;
	}

	private float calculSalaire() {
		return 0;
	}

	public abstract void afficheSalaire();

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Employee) {
			Employee e = (Employee) obj;

			if (e.id == this.id && e.nom.equals(nom))
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println("test");
	}

}
