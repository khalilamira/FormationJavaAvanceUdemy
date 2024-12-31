package tn.amira.genericite;

public class Utils {

    public static <T extends Comparable<T>> T min(T first,T second){
        return (first.compareTo(second)<0) ? first : second;
    }

    public static <K,V> void printKeyValue(K key,V value){
        System.out.println(key+" ="+ value);
    }

    public static void printJoueur(Joueur joueur){
        System.out.println(joueur);
    }

    public static void printBankAccounts
            (GenericList<? extends Joueur> joueurGenericList){

    }
}
