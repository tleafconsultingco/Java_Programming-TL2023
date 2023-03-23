package day13_customMethods;

import java.util.Scanner;

public class Class05_ReturnStatementPractice {

    public static void main(String[] args) {

        char grade = new Scanner(System.in).next().charAt(0);

        boolean isValid = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F';
        if (!isValid) {
            System.err.println("Invalid grade");
            return; // will terminate main method
        } // if this if statement is true then the rest of the code won't execute

        System.out.println((grade == 'A') ? "Excellent" : (grade == 'B') ? "Great Job" : (grade == 'C') ? "Good" : (grade == 'D') ? "Passed" : "Failed");


    }


}
