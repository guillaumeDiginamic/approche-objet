package fr.diginamic.banque;

import fr.diginamic.banque.entites.Operation;
import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;

public class TestOperation {
    public static void main(String[] args) {

        Operation[] operations = new Operation[4];

        operations[0] = new Credit("01/12/23", 12300.5);
        operations[1] = new Debit("11/04/23", 1307.5);
        operations[2] = new Credit("05/02/22", 19300.5);
        operations[3] = new Debit("01/09/22", 1700.6);

        double montantGlobal = 0;

        for (int i=0;i<operations.length; i++) {
            System.out.println(operations[i].getType()+" : "+operations[i]);
            if (operations[i].getType().equals("Credit"))  {
                montantGlobal += operations[i].getMontant() ;
            } else {
                montantGlobal -= operations[i].getMontant() ;
            }

        }
        System.out.println("montantGlobal: "+montantGlobal);

    }
}
