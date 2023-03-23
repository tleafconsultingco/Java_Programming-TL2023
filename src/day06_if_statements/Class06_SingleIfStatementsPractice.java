package day06_if_statements;

public class Class06_SingleIfStatementsPractice {
    public static void main(String[] args){

        int number = 20;

        boolean isEven = number % 2 == 0;
        boolean isOdd = !isEven;

        if(isEven){
            System.out.println(number + " is even number");
        }

        if(isOdd){
            System.out.println(number + " is odd number");
        }

        // Another expression for odd number
        if(!isEven){
            System.out.println(number + " is odd number");
        }

        System.out.println("-----------------------------");
        // Another way to express without using boolean variable

        if(number % 2 == 0){
            System.out.println(number + " is even number");
        }

        if(number % 2 != 0){
            System.out.println(number + " is odd number");
        }
    }

}
/*
1. write a program that can identify if the given number is odd or even
			Ex:
				number = 20

			output:
				20 is an even number: true
				20 is an odd number: false

		Hint: even numbers are the numbers that are evenly divisible by 2 (remainder is zero)


 */
