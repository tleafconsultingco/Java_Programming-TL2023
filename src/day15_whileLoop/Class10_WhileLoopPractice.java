package day15_whileLoop;

import java.util.Scanner;

public class Class10_WhileLoopPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter your age:");
        int age = input.nextInt();

        // user could enter invalid number so you need to repeat entry, but you don't know how many times that will be. Use a while loop

        while (!(age>=1 || age<= 150)) { // this will be asked if the response is invalid, the loop will stop when the input is false
            System.out.println("Invalid entry. Please re-enter your age: ");
            age = input.nextInt();
        }
        if (age >= 21) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }


        input.close();
    }
}
