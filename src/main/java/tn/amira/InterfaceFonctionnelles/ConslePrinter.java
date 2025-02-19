package tn.amira.InterfaceFonctionnelles;

public class ConslePrinter implements Printer{

    /**
     * @param message
     */
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
