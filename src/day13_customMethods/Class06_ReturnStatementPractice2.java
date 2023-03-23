package day13_customMethods;

import java.util.Scanner;

public class Class06_ReturnStatementPractice2 {
    public static void main(String[] args) {

        // apply return statement to exit the method
        int number = new Scanner(System.in).nextInt();

        // if number is invalid then it will exit the method

        if (number < 1 || number > 7) {
            System.err.println("Invalid Number: " + number);
            return; // will exit the method if the number is out of range
        }

        // if the number is valid, then the following code will run

        System.out.println(
                (number == 1) ? "Mon" : (number == 2) ? "Tue" : (number == 3) ? "Wed" : (number == 4) ? "Thu" : (number == 5) ? "Fri" : (number == 6) ? "Sat" : "Sun");

    }


}
