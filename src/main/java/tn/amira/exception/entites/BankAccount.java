package tn.amira.exception.entites;

public class BankAccount {
    private double balance;

    public void deposit(double amount) throws BankAccountException {
        if (amount<=0){
            throw new BankAccountException(new InvalidAmountException());
        }
        balance+=amount;
    }
}
