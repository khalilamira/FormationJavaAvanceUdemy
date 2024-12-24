package tn.amira.mains;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainException {
    public static void main(String[] args) {

        try (FileReader fileReader = new FileReader("src/file1.txt");
             FileWriter fileWriter = new FileWriter("src/file1.txt"); ) {
            fileReader.read();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("");
        }
    }
}