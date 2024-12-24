package tn.amira.exceptions.entites;

public class InvalidNumbersContents extends Exception{
    @Override
    public String getMessage() {
        return "il faut le password contient au minimum 2 nombres";
    }
}
