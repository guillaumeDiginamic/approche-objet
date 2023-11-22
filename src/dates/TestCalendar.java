package dates;


import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class TestCalendar {
    public static void main(String[] args)  {
        //Utilisez la classe java.util.Calendar pour créer une instance de Date à la date du 19 mai 2016 à 23h59 et 30 secondes
        // et affichez-la au format suivant : jour/mois/année

        Calendar cal = Calendar.getInstance();
        cal.set(2016, 4, 19, 23, 59, 30);
        Date date = cal.getTime();
        SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(formateur.format(date));

        //Utilisez la classe java.util.Calendar pour créer une instance de Date à la date du jour.
        Calendar cal1 = Calendar.getInstance();
        Date dateJour = cal1.getTime();
        // Affichez l’instance ainsi créée au format suivant : année/mois/jour heure:minute:seconde
        formateur = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(formateur.format(dateJour));

        //Affichez la même instance avec le nom des jours et des mois en français, russe, chinois et allemand.
        formateur = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.FRANCE);
        System.out.println(formateur.format(dateJour));
        formateur = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", new Locale("ru", "RU"));
        System.out.println(formateur.format(dateJour));
        formateur = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.CHINESE);
        System.out.println(formateur.format(dateJour));
        formateur = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.GERMAN);
        System.out.println(formateur.format(dateJour));
    }
}
