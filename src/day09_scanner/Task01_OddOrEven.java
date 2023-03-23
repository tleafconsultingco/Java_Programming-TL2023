package day09_scanner;

import java.util.Scanner;

public class Task01_OddOrEven {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter number: ");

        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("Your number is even");
        } else {
            System.out.println("Your number is odd");
        }

        input.close();


    }


}
/*
Ask user to enter a number, determine if the number is odd or even
 */