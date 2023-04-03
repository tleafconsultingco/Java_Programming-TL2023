package day12_customMethods;

import java.util.Scanner;

public class Class01_FormatFullName {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first name");
        String firstName = input.nextLine().trim().replace(" ", "");
        //!! trim() and replace() methods will make sure that the white spaces and additional spaces between characters will be removed
        System.out.println("Enter last name");
        String lastName = input.nextLine().trim().replace(" ", "");
        input.close();

        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        //!! Getting first character and converting to uppercase, then concatenate the remaining characters in lowercase
        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();

        String fullName = firstName + " " + lastName;
        System.out.println(fullName);


    }


}
/*
Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

	                    input:
	                        firstName = "cyDEo"
	                        lastName = "SCHOOL";

	                    output: Cydeo School
 */