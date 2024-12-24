package tn.amira.exceptions.entites;

public class InvalidSizePassword extends Exception{
    @Override
    public String getMessage() {
        return "minimum de taille 8";
    }
}
