package day09_scanner;

import java.util.Scanner;


public class Task02_EligibleNotEligible {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        System.out.println("Enter your age: ");

        int age = input.nextInt();

        if (age >= 21){
            System.out.println("You are eligible to buy alcohol");
        } else{
            System.out.println("You are not eligible to buy alcohol");
        }

        input.close();






    }






}
/*
Ask the user to enter his/her age, then check if person is eligible to buy alcohol
 */