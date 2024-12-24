package tn.amira.exceptions.entites;

import java.io.IOException;

public class MyBankApplication {
    public static void start() throws IOException {
        BankAccount bankAccount = new BankAccount();
        try {
            bankAccount.deposit(-90);
        } catch (BankAccountException e) {
            System.out.println(e.getCause().getMessage());
        }
    }
}
