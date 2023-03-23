package day06_if_statements;

public class Class01_OddOrEven {
    public static void main(String[] args){

        int number = 20;

        boolean isEven = number % 2 == 0; // when we divide the number by 2 the remainder should be 0, this means it's an even number

        // boolean isOdd = number % 2 != 0; // when we divide the number by 2  if the remainder is not 0, this means it's an odd number
        boolean isOdd = !isEven; // if the number is not even, then it's odd

        System.out.println(number + " is an even number: " + isEven); // true
        System.out.println(number + " is an odd number: " + isOdd); // false




    }



}
/*
1. Create a class named OddOrEven, and write a program that can identify if the given number is odd or even
			Ex:
				number = 20

			output:
				20 is an even number: true
				20 is an odd number: false

		Hint: even numbers are the numbers that are evenly divisible by 2 (remainder is zero)


 */
