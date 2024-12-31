package tn.amira.exception.mains.mains;

public class MainException1 {
    public static void main(String[] args) {
        System.out.println(quiz().toString());
    }

    static String quiz(){
        try {
            return "try";
        } catch (Exception e){
            return "catch";
        }finally {
            return "finally";
        }
    }
}