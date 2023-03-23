package day09_scanner;

import java.util.Scanner;

public class Class09_NextLineMethodPractice {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine(); // John Doe + Enter

        System.out.println("Enter your school name: ");
        String schoolName = input.nextLine(); // Cydeo School + Enter

        System.out.println("Enter your gender: ");
        String gender = input.next(); // Male + Enter
        // Male will be executed but the Enter key will be left in scanner library. Now you need to execute the Enter key through a nextLine() input

        System.out.println("Enter your age: ");
        int age = input.nextInt(); // 28 + Enter, an additional Enter will be left in library

        // provide an additional nextLine() to get rid of Enter before using nextLine() after other methods of scanner
        input.nextLine();

        System.out.println("Enter your street name: ");
        String street = input.nextLine(); // you won't be able to answer in console bc there are 2 Enters in the library

        input.close();
    }


}
