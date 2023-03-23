package day15_whileLoop;

import java.util.Scanner;

public class Class03_MinNumber {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int min = 2147483647; // this is max integer for Java, this will allow for the variable min to be assigned

        for (int i = 0; i < 5; i++) { // i: 0, 1, 2, 3, 4...when i = 5 then it will be false and not be executed

            System.out.println("Enter a number:"); // 20, 30, -5, 100, 200
            int num = input.nextInt();

            if (num<min){ // if the number is less than variable min, then it's reassigned to new input
                min = num;

                // when loop executes 20, it is less than current min value so the variable min gets reassigned to 20. Then it keeps checking the new input to see if it's less than the current min, if it is then the variable min gets reassigned.
            }
        }

        System.out.println("min = " + min);

        input.close();




    }

}
/*
 2. Write a program that can ask the user to enter a number for
5 times and returns the minimum number
 */