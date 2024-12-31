package tn.amira.genericite;

public class main {
    public static void main(String[] args) {
        var myList = new GenericList<String>();
        myList.add("hello");
        String ch = myList.get(0);
        System.out.println();
        Joueur j1 = new Joueur(15);
        Joueur j2 = new Joueur(30);
        System.out.println(j1.compareTo(j2));
        System.out.println(Utils.min(12,45));
        Utils.printKeyValue("jad",18);

        Joueur joueur1 = new JoueurGardient(3);
        Utils.printBankAccounts(new GenericList<Joueur>());
        Utils.printBankAccounts(new GenericList<JoueurGardient>());

    }
}
