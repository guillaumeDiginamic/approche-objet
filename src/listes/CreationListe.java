package listes;

import java.util.ArrayList;

public class CreationListe {
    public static void main(String[] args) {
        ArrayList<Integer> entiers = new ArrayList<>();
        for (int i=1; i<101; i++) {
            entiers.add(i);
        }
        //Affichez la taille de la liste
        System.out.println(entiers.size());
    }

}
