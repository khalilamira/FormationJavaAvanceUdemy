package tn.amira.mains;

import tn.amira.exceptions.entites.MyBankApplication;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            MyBankApplication.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}