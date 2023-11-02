package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {

        //adresse 1
        int numeroRue=5;
        String libelleRue = "rue des lilas";
        int codePostal = 44100 ;
        String ville = "Nantes";
        AdressePostale adr1 = new AdressePostale(numeroRue, libelleRue, codePostal,ville);

        //adresse 2
        numeroRue = 10;
        libelleRue = "rue des roses";
        codePostal = 34000 ;
        ville = "Montpellier";
        AdressePostale adr2 = new AdressePostale(numeroRue, libelleRue, codePostal,ville);

        //personne 1
        String nom = "Dupont";
        String prenom = "Paul";
        Personne personne1 = new Personne(nom,prenom);
        personne1.setAdressePostale(adr1);


        //personne 2
        nom = "Durand";
        prenom = "Pierre";
        Personne personne2 = new Personne(nom,prenom,adr2);

        personne1.afficheNomPrenom();
        System.out.println("Personne1 :"+personne1.adressePostale.numeroRue+" "+personne1.adressePostale.libelleRue+" "+personne1.adressePostale.codePostal+" " +personne1.adressePostale.ville);
        personne2.afficheNomPrenom();
        System.out.println("Personne2 :"+personne2.adressePostale.numeroRue+" "+personne2.adressePostale.libelleRue+" "+personne2.adressePostale.codePostal+" " +personne2.adressePostale.ville);

    }
}
