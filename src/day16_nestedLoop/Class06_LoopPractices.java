package day16_nestedLoop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Class06_LoopPractices {
    public static void main(String[] args) {

        System.out.println("----FOR LOOP----");
        for (int i = 1; i < 6; i++) {
            System.out.println("Hello " + i);
            /*
            Hello 1
            Hello 2
            Hello 3
            Hello 4
            Hello 5
             */
            // can't use variable i outside of this block
        }
        System.out.println("--------");
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello " + i);
            /*
            Hello 0
            Hello 1
            Hello 2
            Hello 3
            Hello 4
             */
        }

        System.out.println("----WHILE LOOP----");

        // in parentheses you can only give condition
        int j = 0; // acts as initialization - you can create variable outside of while loop and then use variable as condition in the loop
        while (j < 5) { // condition statement
            System.out.println("Hello " + j);
            j++; // still can give the "iterator"
            /*
            Hello 0
            Hello 1
            Hello 2
            Hello 3
            Hello 4
             */
        }

        System.out.println("---DO-WHILE LOOP---");
        int k = 0; // declare variable that acts as initialization
        do {
            System.out.println("Hello " + k);
            k++; // serves as iterator
        } while (k < 5); // condition
            /*
            Hello 0
            Hello 1
            Hello 2
            Hello 3
            Hello 4
             */

        System.out.println("---------");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your score");
        int score = input.nextInt();

        // what if student enters invalid score? We can re-ask, but we don't know how many times they will need to provide input

        while (score > 100 || score < 0) {
            System.out.println("Invalid score. Please re-enter your score.");
            score = input.nextInt();
        }

        if (score >= 60) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
        input.close();


    }
}
