package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
    private double tauxRenuneration;

    public CompteTaux(int numero, double solde, double tauxRenuneration) {
        super(numero, solde);
        this.tauxRenuneration = tauxRenuneration;
    }

    @Override
    public String toString() {
        String string = super.toString();
        string += " Taux de remuneration = " + tauxRenuneration;
        return string;
    }

    public double getTauxRenuneration() {
        return tauxRenuneration;
    }

    public void setTauxRenuneration(double tauxRenuneration) {
        this.tauxRenuneration = tauxRenuneration;
    }
}
