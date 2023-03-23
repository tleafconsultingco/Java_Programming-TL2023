package day16_nestedLoop;

import java.util.Scanner;

public class Class05_LogIn {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String u, p;

        int attempt = 3;

        do { // runs the statements under do statement before checking while condition
            // can use this block of code at least once
            System.out.println("Enter your user name");
            u = input.next();
            System.out.println("Enter your password");
            p = input.next();
            attempt--; // this decreases the number of attempts until it reaches value in variable

            if(attempt == 0){
                break;
            }

        } while (!(u.equals("Cydeo") && p.equals("WoodenSpoon"))); // while the credentials are invalid, then do block is executed again


    }
}
