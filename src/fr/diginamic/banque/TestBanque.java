package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {
    public static void main(String[] args) {
        Compte compte = new Compte(123, 12300.5);
        System.out.println("numero = "+compte.getNumero()+" solde = "+compte.getSolde());
    }
}
