package MethodPractice;

public class validatenameandage {
 static boolean validate(String name){
        return name.matches("[a-zA-Z\\s]+");
    }
    static boolean validate(int age){
        return age>=3 && age<=99;
    }
    public static void main(String[] args){
        System.out.println(validate(20));
    }
}
 