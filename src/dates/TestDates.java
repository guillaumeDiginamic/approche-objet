package dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {
    public static void main(String[] args) throws ParseException {
        // Créez une instance de la classe java.util.Date à la date du jour en utilisant un de ses constructeurs
        Date dateJour = new Date();

        // Affichez l’instance ainsi créée au format suivant :
        // jour/mois/année (sans la partie heure)
        SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(formateur.format(dateJour));

        // Créez une instance de la classe Date à la date du 19/05/2016 à 23 :59 :30 secondes
        String str = "19/05/2016 23:59:30";
        formateur = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date2 = formateur.parse(str);

        // Affichez l’instance ainsi créée au format suivant :
        // année/mois/jour heure:minute:seconde
        System.out.println(formateur.format(date2));

        Date dateSystem= new Date();
        System.out.println(formateur.format(dateSystem));
    }
}
