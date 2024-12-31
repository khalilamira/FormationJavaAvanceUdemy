package tn.amira.exception.entites;

public class UpperCaseInvalidException extends Exception{
    @Override
    public String getMessage() {
        return "le password ne contient pas  des lettres minuscules et majuscules";
    }
}
