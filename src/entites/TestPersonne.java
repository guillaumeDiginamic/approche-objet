package entites;

public class TestPersonne {
    public static void main(String[] args) {

        AdressePostale adr1 = new AdressePostale();
        AdressePostale adr2 = new AdressePostale();

        //adresse 1
        adr1.numeroRue = 5;
        adr1.libelleRue = "rue des lilas";
        adr1.codePostal = 44100 ;
        adr1.ville = "Nantes";

        //adresse 2
        adr2.numeroRue = 10;
        adr2.libelleRue = "rue des roses";
        adr2.codePostal = 34000 ;
        adr2.ville = "Montpellier";


        Personne personne1 = new Personne();
        Personne personne2 = new Personne();

        //personne 1
        personne1.nom = "Dupont";
        personne1.prenom = "Paul";
        personne1.adressePostale= adr1;


        //personne 2
        personne2.nom = "Durand";
        personne2.prenom = "Pierre";
        personne2.adressePostale = adr2;


        System.out.println("Personne1 :"+personne1.nom+" "+personne1.prenom);
        System.out.println("Personne1 :"+personne1.adressePostale.numeroRue+" "+personne1.adressePostale.libelleRue+" "+personne1.adressePostale.codePostal+" " +personne1.adressePostale.ville);
        System.out.println("Personne2 :"+personne2.nom+" "+personne2.prenom);
        System.out.println("Personne2 :"+personne2.adressePostale.numeroRue+" "+personne2.adressePostale.libelleRue+" "+personne2.adressePostale.codePostal+" " +personne2.adressePostale.ville);

    }
}
