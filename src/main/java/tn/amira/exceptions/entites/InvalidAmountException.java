package tn.amira.exceptions.entites;

// checked -> Exception
//unchecked -> RuntimeException
public class InvalidAmountException extends Exception{

    public InvalidAmountException(){
        super("Invalid amount");
    }

    public InvalidAmountException(String message) {
        super(message);
    }
}