package day13_customMethods;

public class Practice01_IsOdd {
    public static void main(String[] args) {
        System.out.println(isOdd(100));
    }

    public static boolean isOdd(int num){
        if(num % 2 != 0){
            return true;
        } else {
            return false;
        }


    }


}
/*
Create a method named isOdd, that can return true if a number is an odd number, otherwise returns false
 */