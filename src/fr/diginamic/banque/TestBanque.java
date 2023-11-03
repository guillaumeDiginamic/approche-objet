package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {
    public static void main(String[] args) {
        Compte cpt = new Compte(123, 12300.5);
        CompteTaux cptTaux = new CompteTaux(123, 1300.5, 2.5);

        Compte[] tableau ;
        tableau = new Compte[2];
        tableau[0] = cpt;
        tableau[1] = cptTaux;

        for (int i=0;i<tableau.length; i++) {
            System.out.println(tableau[i]);
        }
    }
}
