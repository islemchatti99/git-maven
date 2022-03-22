package tn.esprit.spring.methodes;

import tn.esprit.spring.entities.Personne;
public class PersonneImpl {

	public void afficherPersonne (Personne P){
		//*affichage *//
		System.out.println("Le nom est : "+ P.getNom());
		System.out.println("Le Prénom est : "+ P.getPrennom());
	}
}
