package listes;

import java.util.ArrayList;

public class FusionListe {
    public static void main(String[] args) {
        // 2 listes différentes, nommées liste1 et liste2
        // Ces listes contiennent des couleurs
        // Créez en utilisant des boucles une liste appelée liste3
        // et qui contient l’ensemble des données des 2 listes précédentes

        ArrayList<String> liste1 = new ArrayList<String>();
        liste1.add("Rouge");
        liste1.add("Vert");
        liste1.add("Orange");

        ArrayList<String> liste2 = new ArrayList<String>();
        liste2.add("Blanc");
        liste2.add("Bleu");
        liste2.add("Orange");

        ArrayList<String> liste3 = new ArrayList<String>();
        for (String couleur : liste1) {
            liste3.add(couleur);
        }
        for (String couleur : liste2) {
            if (!liste3.contains(couleur)) {
                liste3.add(couleur);
            }
        }
        System.out.println(liste3);
    }
}
