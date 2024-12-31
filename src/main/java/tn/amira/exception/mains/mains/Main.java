package tn.amira.exception.mains.mains;

import tn.amira.exception.entites.MyBankApplication;

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