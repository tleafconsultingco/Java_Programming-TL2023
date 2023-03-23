package day15_whileLoop;
import java.util.Scanner;

public class Class02_MaxNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // create a variable to contain the max number
        int max = -2147483648; // this is the min int value for Java, any number that is entered is larger than this min number, which means the variable WILL be reassigned


        // create an input loop for 5x
            for(int i = 0; i<5;i++){ // i: 0, 1, 2, 3, 4...when i = 5 then it will be false and not be executed
                System.out.println("Enter a number: ");
                int num = input.nextInt(); // 10, 5, 3, 20, 15

                if(num>max){ // if the number is greater than variable max, then it's reassigned to new input
                    max = num;

                    // if user enters 10, it's greater than original variable value. Then variable max gets replaced. Second entry 5 is less than new value of variable, so it remains 10. So on, until it reaches a number greater than current max number (10), then it will be reassigned.
                }
            }

        System.out.println("max = " + max);

            input.close();








    }



}
/*
1. Write a program that can ask the user to enter a number for
5 times and returns the maximum number
 */