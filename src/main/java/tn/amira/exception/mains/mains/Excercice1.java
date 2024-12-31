package tn.amira.exception.mains.mains;

import tn.amira.exception.entites.InvalidNumbersContents;
import tn.amira.exception.entites.InvalidSizePassword;
import tn.amira.exception.entites.PasswodException;
import tn.amira.exception.entites.UpperCaseInvalidException;

import java.util.Scanner;

public class Excercice1 {


    public static void main(String[] args) {
        // Validez un mot de passe en respectant les conditions suivantes :
        // * minimum de taille 8
        // * contient des lettres minuscules et majuscules
        // * contient au minimum 2 nombres
        // pour chaque condition non respectée, lancez l'exception qui lui correspond
        // => gérez les exceptions

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("enter a password : ");
            String password = scanner.nextLine();

            try {
                validatePassword(password);
            } catch (PasswodException e) {
                System.out.println(e.getCause().getMessage());
            }
            System.out.println("valid password");
        }

    }

    public static boolean containsLowercaseAndUppercase(String str) {
        // Stream-based approach
        boolean hasLowercase = str.chars().anyMatch(Character::isLowerCase);
        boolean hasUppercase = str.chars().anyMatch(Character::isUpperCase);
        return hasLowercase && hasUppercase;
    }

    public static boolean containsAtLeastTwoDigits(String str) {
        long digitCount = str.chars()
                .filter(Character::isDigit)
                .count(); // Compte les caractères qui sont des chiffres
        return digitCount >= 2;
    }

    public static void validatePassword(String password) throws PasswodException{
            if (password.length() < 8){
                throw new PasswodException(new InvalidSizePassword());
            }
            if (!containsLowercaseAndUppercase(password)){
                throw new PasswodException(new UpperCaseInvalidException());
            }
            if (!containsAtLeastTwoDigits(password)){
                throw new PasswodException(new InvalidNumbersContents());
            }
    }
}