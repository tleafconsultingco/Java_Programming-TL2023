package day12_customMethods;

public class Class02_EmailTask {
    public static void main(String[] args) {

        String email = "cydeo_school@gmail.com";

        String firstName = email.substring(0, email.indexOf("_"));
        // creates substring from beginning characters until underscore
        String lastName = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
        // creates substring from character after underscore until @
        String rest = email.substring(email.indexOf("@"));
        // creates substring including everything after @
        System.out.println(firstName);

        System.out.println(lastName);

        System.out.println(rest);

        email = lastName + "_" + firstName + rest;

        System.out.println(email);








    }
}
/*
Create a class calledEmailTask1.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

        Write a program that can swap first name with last name in the email (Separated by an underscore).
        If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com
 */