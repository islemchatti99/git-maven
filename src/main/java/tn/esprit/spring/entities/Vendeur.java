package tn.esprit.spring.entities;

/**
 * @author Ahmed BAHRI
 *
 * Class vendeur
 */
public class Vendeur extends Personne{
    private float taux_vente;
    /**
     * constructeur
     * @param nom attribute nom du vendeur
     * @param prennom attribute prenom du vendeur
     * @param taux_vente attribute taux de vente
     */
    public Vendeur(String nom, String prennom, float taux_vente) {
        super(nom, prennom);
        this.taux_vente = taux_vente;
    }

    /**
     * getter methode taux de vente
     * @return le taux de vente
     */
    public float getTaux_vente() {
        return taux_vente;
    }

    /**
     * setter methode taux de vente
     * @param taux_vente attribute taux de vente
     */
    public void setTaux_vente(float taux_vente) {
        this.taux_vente = taux_vente;
    }

    /**
     * Caculer le salaire du vendeur
     * @param taux_vente attribute taux de vente
     * @return
     */
    public float calculateSalary(float taux_vente){
        return (450*taux_vente)/100;
    }
}
