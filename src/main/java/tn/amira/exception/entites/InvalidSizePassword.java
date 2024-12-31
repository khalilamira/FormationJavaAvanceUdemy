package tn.amira.exception.entites;

public class InvalidSizePassword extends Exception{
    @Override
    public String getMessage() {
        return "minimum de taille 8";
    }
}
