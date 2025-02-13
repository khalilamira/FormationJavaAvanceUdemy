package tn.amira.collection;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("holder1",50,"email1");
        BankAccount b2 = new BankAccount("holder2",150,"email2");

        Map<String,BankAccount> bankAccounts = new HashMap<>();
        bankAccounts.put(b1.getEmail(),b1);
        bankAccounts.put(b2.getEmail(),b2);

        for (var entry : bankAccounts.entrySet()) {
            System.out.println(entry);
        }
    }
}
