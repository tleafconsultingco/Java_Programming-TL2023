package day13_customMethods;

public class Class03_ReturnMethodsPractice {
    public static void main(String[] args) {

        System.out.println(isOdd(11));
        System.out.println(isEven(15));
        System.out.println(max(10,100));
        System.out.println(min(10,100));
    }

    public static boolean isOdd(int num) {

        return (num%2!=0)?true:false;

    }

    public static boolean isEven(int num) {

        return !isOdd(num);
    }


    public static int max(int num1, int num2){
        if(num1>num2){
            return num1;
        }else{
            return num2;
        }


    }


    public static int min(int num1, int num2){
        return (num1<num2)? num1:num2;

    }

}





/*
Create a method named isOdd, that can return true if a number is an odd number
Create a method named isEven, that can return true if a number is an even number
Create a method named max, that can return the maximum number between two numbers
Create a method named min, that can return the minimum number between two numbers
 */

