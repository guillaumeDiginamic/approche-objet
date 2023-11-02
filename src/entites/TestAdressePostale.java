package entites;

public class TestAdressePostale {
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

        System.out.println("Adresse1 :"+adr1.numeroRue+" "+adr1.libelleRue+" "+adr1.codePostal+" " +adr1.ville);
        System.out.println("Adresse2 :"+adr2.numeroRue+" "+adr2.libelleRue+" "+adr2.codePostal+" " +adr2.ville);

    }


}
