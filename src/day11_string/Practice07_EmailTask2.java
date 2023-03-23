package day11_string;

public class Practice07_EmailTask2 {
    public static void main(String[] args) {
        String email = "craig_federighi@apple.com";
        String firstName = email.substring(0,1).toUpperCase()+email.substring(1,email.indexOf('_'));

        String lastName = email.substring(email.lastIndexOf('_')+1,email.indexOf('@'));
        String lastUpper = lastName.substring(0,1).toUpperCase()+lastName.substring(1);

        String domain = email.substring(email.lastIndexOf('@')+1,email.indexOf('.'));


        System.out.println("firstName = " + firstName);
        System.out.println("lastUpper = " + lastUpper);
        System.out.println("domain = " + domain);


    } // main close
} // Class close
/*
Create a class called EmailTask2.
Assume that email address is constructed by person's first name and followed by an
underscore and last name.
Write a program that will print out information about user based on email. Print first name, last
name, and domain.
First and Last name should be printed with proper format - uppercase first letter and remaining
lowercase.
Ex:
input:
craig_federighi@apple.com
Output:
First name: Craig
Last name: Federighi
Domain: apple
 */