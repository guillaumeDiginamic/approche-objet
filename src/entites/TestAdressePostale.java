package entites;

public class TestAdressePostale {
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

        System.out.println("Adresse1 :"+adr1.numeroRue+" "+adr1.libelleRue+" "+adr1.codePostal+" " +adr1.ville);
        System.out.println("Adresse2 :"+adr2.numeroRue+" "+adr2.libelleRue+" "+adr2.codePostal+" " +adr2.ville);

    }


}
