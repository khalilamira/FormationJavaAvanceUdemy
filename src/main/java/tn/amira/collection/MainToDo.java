package tn.amira.collection;


import java.sql.SQLOutput;
import java.util.*;

public class MainToDo {


    public static void main(String[] args) {

        // TODO ******* ArrayList *******

        // Créez une ArrayList de String "colors1",
        List<String> colors1 = new ArrayList<>();

        // ajoutez 3 couleurs (black, Red, Yellow),
        colors1.add("black");
        colors1.add("Red");
        colors1.add("Yellow");
        // affichez "colors1"
        System.out.println("Colors1 ="+ colors1);
        // Affichez chaque couleur par ligne
        for (var color : colors1){
            System.out.println(color);
        }
        // Ajoutez une nouvelle couleur (Blue) au début de "colors1"
        colors1.addFirst("Blue");

        // affichez "colors1"
        System.out.println("Colors1 ="+ colors1);
        // Affichez la deuxième couleur
        System.out.println(colors1.get(1));
        // Remplacez la deuxième couleur par (Purple)
        colors1.set(1,"Purple");
        // affichez "colors1"
        System.out.println("Colors1 ="+ colors1);
        // Supprimez la troisième couleur
        colors1.remove(2);
        // affichez "colors1"
        System.out.println("Colors1 ="+ colors1);
        // Vérifiez si "colors1" contient la couleur "Black"
        System.out.println(colors1.contains("Black"));
        // Triez "colors1"
        Collections.sort(colors1);
        // affichez "colors1"
        System.out.println("Colors1 ="+ colors1);
        // Copiez "colors1" dans une autre ArrayList "colors2"
        List<String> colors2 = new ArrayList<>(colors1);

        // affichez "colors2"
        System.out.println("Colors2 ="+ colors2);
        // Mélangez l'ordre de vos couleurs de manière aléatoire dans "colors2"
        Collections.shuffle(colors2);
        // affichez "colors2"
        System.out.println("Colors2 ="+ colors2);
        // Inversez l'ordre de vos éléments de "colors2"
        Collections.reverse(colors2);
        // affichez "colors2"
        System.out.println("Colors2 ="+ colors2);
        // Extrayez les 2 premières couleurs de "colors1" et affichez les
        System.out.println("Extracting Colors2 ="+ colors1.subList(0,2));
        // Échanger 2 couleurs par leur places dans "colors1"
        Collections.swap(colors1,0,1);
        // affichez "colors1"
        System.out.println("Colors1 ="+ colors1);
        // Videz "colors1"
        colors1.removeAll(colors1);
        // affichez "colors1"
        System.out.println("Colors1 ="+ colors1);
        // Testez si "colors1" est vide ou non
        System.out.println("Colors1 is empty"+ colors1.isEmpty());
        // TODO ******* HashSet *******

        // Créez un HashSet de String "colorsSet1", ajoutez 3 couleurs (black, Red, Yellow)
        Set<String> colorsSet1 = new HashSet<>();
        colorsSet1.add("black");
        colorsSet1.add("Red");
        colorsSet1.add("Yellow");
        // et affichez "colorsSet1"
        System.out.println(colorsSet1);
        // Affichez la taille de votre set
        System.out.println(colorsSet1.size());
        // Convertissez votre set en un tableau
        String[] tab = colorsSet1.toArray(new String[0]);
        // affichez le tableau
        System.out.println("Tableau ::"+tab);
        // Convertissez votre set en liste
        List<String> colors3 = new ArrayList<>(colorsSet1);
        // affichez la liste
        System.out.println("colors3="+colors3);
        // Créez un autre set contenant (Black, Red)
        // affichez leur intersection
        Set<String> colorsSet2 = new HashSet<>();
        colorsSet2.add("Black");
        colorsSet2.add("Red");
        colorsSet1.retainAll(colorsSet2);
        System.out.println("intersection =" + colorsSet1);
        // Videz "colorsSet1"
        colorsSet1.clear();
        // affichez "colorsSet1"
        System.out.println("cleanning set1 =" + colorsSet1);

        // TODO ******* Map *******

        // Créez un Map de Integer:String "map1",
        // ajoutez 3 couleurs (1:black, 2:Red, 3:Yellow),
        // affichez "map1"
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(1,"Black");
        map1.put(2,"Red");
        map1.put(3,"Yellow");
        System.out.println("map1 : " + map1);

        // Affichez la taille de "map1"
        System.out.println("la taille de map1 : "+ map1.size());

        // Créez un autre Map de Integer:String, "map2" ,
        // ajoutez 3 couleurs (4:White, 5:Orange, 6:Blue)
        // affichez "map2"
        Map<Integer,String> map2 = new HashMap<>();
        map1.put(4,"white");
        map1.put(5,"orange");
        map1.put(6,"Blue");
        System.out.println("map2 : " + map2);


        // Ajoutez toutes les valeurs de "map2" dans "map1"
        map1.putAll(map2);
        // affichez "map1"
        System.out.println("map1 after add map2 : " + map1);
        // Videz "map2"
        map2.clear();
        // affichez "map2"
        System.out.println("map2 : " + map2);
        // Copiez le contenu de map1 en map2
        // affichez "map2"
        map2 = new HashMap<>(map1);
        System.out.println("new map2 : " + map2);
        // Affichez les clés de "map1"
        System.out.println(map1.keySet());
        // Affichez les valeurs de "map1"
        System.out.println(map1.values());
        // Vérifiez si "map1" contient la clé 1
        System.out.println("map1 containts 1 : "+ map1.containsKey(1));
        // Vérifiez si "map1" contient la valeur "Red"
        System.out.println("map1 containts red :" + map1.containsValue("red") );

    }
}