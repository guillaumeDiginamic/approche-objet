package listes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestVilles {
    public static void main(String[] args) {
        ArrayList<Ville> villes = new ArrayList<>();
        villes.add(new Ville("Nice",343000));
        villes.add(new Ville("Carcassonne",47800));
        villes.add(new Ville("Narbonne",53400));
        villes.add(new Ville("Lyon",484000));
        villes.add(new Ville("Foix",9700));
        villes.add(new Ville("Pau",77200));
        villes.add(new Ville("Marseille",850700));
        villes.add(new Ville("Tarbes",40600));

        // Recherchez et affichez la ville la plus peuplée
        Ville maxVille= villes.get(0);
        for (Ville ville : villes) {
           if (ville.getNbHabitants() > maxVille.getNbHabitants()) {
                maxVille = ville;
            }
        }
        System.out.println("\nville la plus peuplée : "+maxVille.toString());

        //Supprimez la ville la moins peuplée
        Iterator<Ville> iter1 = villes.iterator();
        Ville minVille= villes.get(0);
        while(iter1.hasNext()) {
            Ville ville = iter1.next();
            if (ville.getNbHabitants() < minVille.getNbHabitants()) {
                minVille = ville;
            }
        }
        System.out.println("\nsuppression de ville la moins peuplée : "+minVille.toString());
        villes.remove(minVille);

        //Modifiez les villes de plus de 100 000 habitants en mettant leur nom en majuscules
        System.out.println("\nville de plus de 100 000 habitants en majuscules");
        for (Ville ville : villes) {
            if (ville.getNbHabitants()>100000) {
                ville.setNom(ville.getNom().toUpperCase());
            }
            System.out.println(ville.toString());
        }
        //Affichez enfin la liste résultante
        System.out.println("\nListe résultante");
        for (Ville ville : villes) {
           System.out.println(ville.toString());
        }

    }
}
