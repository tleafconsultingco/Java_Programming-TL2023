package day06_if_statements;

public class Class02_IdentifyNumber {
    public static void main (String[] args){

        int number = 200;

        boolean isPositive = number > 0; // if the number is greater than zero, it's positive
        // boolean isNegative = !isPositive; // this does not work bc the number can be something else besides negative if it's not positive
        boolean isNegative = number < 0; // if the number is less than zero, it's negative
        // boolean isZero = number == 0; // if the number is equal to zero
        boolean isZero = !isPositive && !isNegative; // if number is not positive and not negative, then it's zero

        System.out.println(number + " is positive number: " + isPositive);
        System.out.println(number + " is negative number: " + isNegative);
        System.out.println(number + " is zero: " + isZero);

        System.out.println("---------------------------------");
        // Using if statement

        int number1 = -100;

        boolean isPositive1 = number1 > 0;
        boolean isNegative1 = number1 < 0;
        boolean isZero1 = number1 == 0;

        if(isPositive1){
            System.out.println(number1 + " is positive number"); // not executed
        }

        if(isNegative1){
            System.out.println(number1 + " is negative number"); // executed
        }

        if(isZero1){
            System.out.println(number + " is zero"); // not executed
        }

        System.out.println("--------------------------------");
        // Using if statement without creating boolean variables

        int number2 = 0;

        if(number2 > 0){
            System.out.println(number2 + " is positive"); // not executed
        }

        if(number2 < 0){
            System.out.println(number2 + " is negative"); // not executed
        }

        if(number2 == 0){
            System.out.println(number2 + " is zero"); // executed
        }




    }

}

/*
2. Create a class named IdentifyNumber, and write a program that can identify if the given number is positive, or negative or zero.

			Ex:
				number = 200

			output:
		        200 is positive number: true
		        200 is negative number: false
		        200 is zero: false
 */
