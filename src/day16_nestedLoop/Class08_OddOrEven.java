package day16_nestedLoop;

import java.util.Scanner;

public class Class08_OddOrEven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        while (true) {

            System.out.println("Enter a number:");
            int num = input.nextInt();

            // determine if number is odd or even
            if (num % 2 == 0) {
                System.out.println(num + " is even");
            } else {
                System.out.println(num + " is odd");
            }

            // ask user if they want to enter another number
            System.out.println("Would you like to enter another number? Yes/No");
            String answer = input.next().toLowerCase();

            // you can use while or do...while loop to keep asking the user until they answer no. place code inside while loop

            while(!(answer.equals("yes")||answer.equals("no"))){ // while the user provides invalid answer
                System.err.println("Invalid entry! Would you like to enter another number");
                answer = input.next().toLowerCase();
            }

            // how to make the loop stop
            if (answer.equals("no")) {
                break;
            }


        }


    }
}
