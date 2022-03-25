/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionEmploye;

/**
 *
 * @author Aichabenjebara
 */
public class Ressponsable extends Employe {

    private float prime;

    public Ressponsable() {
        super();
    }

    public Ressponsable(int id, String n, float p) {
        //super(id,n);
        prime = p;
    }

    public Ressponsable(int id, String n, String ad, float prime) {
        super(id, n, ad);
        this.prime = prime;
        System.out.println("responsable");
    }

    public float getPrime() {
        return prime;
    }

    public void setPrime(float prime) {
        this.prime = prime;
    }

    public void test() {
        System.out.println("this" + this.toString());
        System.out.println("super " + super.toString());
    }

    @Override
    public String toString() {
        return "Responsable :" + super.toString() + "Prime :" + this.prime;
    }

    public float calculSalaire() {
        float Salaire = 0;
        if (this.nbHeure > 160) {

            int Heure_Supp = this.nbHeure - 160;
            float Prix_Supp = (float) (Heure_Supp * (10 + (10 * 0.2)));
            Salaire = (160 * 10) + Prix_Supp + prime;

        } else {
            Salaire = (this.nbHeure * 10) + prime;
        }

        return Salaire;

    }

    @Override
    public void afficheSalaire() {
        System.out.println("Responsable :"+calculSalaire());
    }
    
}
