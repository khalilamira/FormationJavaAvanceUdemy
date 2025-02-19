package tn.amira.InterfaceFonctionnelles;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Main {

    String suffix = "?";

    public Main(String suffix) {
        this.suffix = suffix;
    }

    public Main() {
    }

    public static void main(String[] args) {

        Printer printer = new Printer() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        };

        Main main = new Main();
        Printer p1 = msg -> System.out.println(msg+main.suffix);
        //reference de methode
        Printer p2 = System.out::println;
        //reference de constructeur
        Printer p3 = Main::new;
        System.out.println("hello world");


        //intrface fonctionelle predefinies
        System.out.println("------------Consumer------------");
        //BiConsumer
        //IntConsumer
        List<String> myList = Arrays.asList("jAd","khAlil","mAryem");
        //Approche Imperative
        for (var day : myList) {
            System.out.println(day);
        }
        //Approche Declarative
        myList.forEach(System.out::println);

        //Enchainement des consumers
        System.out.println("--------Enchainement des consumers-----------");
        Consumer<String> print = item -> System.out.println(item);
        Consumer<String> printLowerCase = item -> System.out.println(item.toLowerCase());
        Consumer<String> printUpperCase = item -> System.out.println(item.toUpperCase());

        myList.forEach(print.andThen(printLowerCase).andThen(printUpperCase));

        System.out.println("-------------Supplier-------------");
        //IntSupplier
        //DoubleSupplier
        Supplier<Integer> getActualYear = () -> LocalDateTime.now().getYear();
        System.out.println(getActualYear.get());

        System.out.println("-------------Function--------------");
        Function<String,Character> getFirstChar = str -> str.charAt(0);
        System.out.println(getFirstChar.apply("Hello"));
        //fonction andThen
        //$ -> @
        //@ -> =
        Function<String,String> dollarToArobase = str -> str.replace('$','@');
        Function<String,String> arobaseToeqale = str -> str.replace('@','=');
        var result = dollarToArobase
                .andThen(arobaseToeqale)
                .apply("ed$egr$");
        System.out.println(result);

        var result1 = dollarToArobase
                .compose(arobaseToeqale)
                .apply("ed$egr$");
        System.out.println(result1);

        System.out.println("-------------Predicate---------------");
        Predicate<String> hasLengthEven = str -> str.length()%2==0;
        System.out.println(hasLengthEven.test("Hello"));

        Predicate<String> hasLeftParenthese = str -> str.startsWith("(");
        Predicate<String> hasRightParenthese = str -> str.endsWith(")");
        //&&
        Predicate<String> hasParentheses = hasRightParenthese.and(hasLeftParenthese);
        System.out.println(hasParentheses.test("(jzhefbjjef)"));

        System.out.println("-----------BinaryOperator-------------");
        BinaryOperator<Integer> multiply = (a,b) -> a*b;
        var resultA = multiply.apply(5,2);
        System.out.println(resultA);
        System.out.println("-----------UnaryOperator-------------");
        IntUnaryOperator cube = a -> a*a*a;
        IntUnaryOperator increments = a -> a+1;
        var resultF = cube.andThen(increments).applyAsInt(5);
        System.out.println(resultF);



    }
}
