package tn.amira.genericite;

public class Joueur implements Comparable<Joueur> {

    private double scorre;

    public Joueur(double scorre) {
        this.scorre = scorre;
    }

    @Override
    public int compareTo(Joueur joueur) {
        return (int) (scorre - joueur.scorre);
    }
}
