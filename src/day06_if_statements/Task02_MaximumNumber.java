package day06_if_statements;

public class Task02_MaximumNumber {
    public static void main(String[]  args){

        // 3 possible outputs -- first num could be max, second num could be max, nums can be equal

        int num1 = 10,
                num2 = 20;

        if(num1 > num2){
            System.out.println(num1 + " is the maximum number"); // false, not printed
        }

        if(num1 < num2){
            System.out.println(num2 + " is the maximum number"); // true, printed
        }

        if(num1 == num2){
            System.out.println("The numbers are equal"); // false, not printed
        }



    }





}
/*
. Create a class named MaximumNumber.java
2. Declare the following variables:
	1. num1
	2. num2
3. Write a program that can print the maximum number between the two numbers above, if both are equal then print Equal
	Ex:
		num1 = 10
		num2 = 20
	     output:
		20 is the maximum number
 */