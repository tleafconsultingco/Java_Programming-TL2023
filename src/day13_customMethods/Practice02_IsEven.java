package day13_customMethods;

public class Practice02_IsEven {
    public static void main(String[] args) {
        System.out.println(isEven(100));

    }

    public static boolean isEven(int num){

        return !Practice01_IsOdd.isOdd(num);
        }



    }





/*
Create a method named isEven, that can return true if a number is an even number, otherwise returns false
 */