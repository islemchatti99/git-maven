package tn.esprit.spring.entities;

public class Caissier extends Personne {
    private int numCaisse;

    public Caissier() {}

    public Caissier(int numCaisse, int id, String n) {
        this.numCaisse = numCaisse;
    }

    public Caissier(int numCaisse, int id, String nom, String adresse, int nbHeure) {
        this.numCaisse = numCaisse;
    }

    @Override
    public String toString() {
        return "Caissier{" +super.toString()+ "numCaisse=" + numCaisse + '}';
    }

    public int getNumCaisse() {
        return numCaisse;
    }

    public void setNumCaisse(int numCaisse) {
        this.numCaisse = numCaisse;
    }

    protected float calculSalaire()
    {
        float Salaire=0;


            int Heure_Supp = 3600 - 180 ;
            float Prix_Supp= (float) (Heure_Supp *(5+(5*0.15)));
            Salaire= (180 * 5 )+Prix_Supp ;
        return Salaire;

        }


    @Override
    public void afficheSalaire() {
        System.out.println("Caissier :"+this.calculSalaire());
    }

}
