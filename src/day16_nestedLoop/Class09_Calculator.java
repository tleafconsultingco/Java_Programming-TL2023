package day16_nestedLoop;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Class09_Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String answer = "yes";

        System.out.println("Enter first number");
        double num1 = input.nextDouble(); // 1. input from user

        System.out.println("Enter operator");
        char operator = input.next().charAt(0); // 2. input from user

        while (!(operator == '+' || operator == '-' || operator == '*' || operator == '/')) { // 2a. if they enter invalid operater, then run loop until they enter valid operator
            System.out.println("Invalid operator. Enter operator");
            operator = input.next().charAt(0);
        }

        System.out.println("Enter second number"); // 3. input from user
        double num2 = input.nextDouble();

        double result = (operator=='+')?num1+num2
                :(operator=='-')? num1-num2
                :(operator=='*')?num1*num2
                :num1/num2;
        System.out.println("result = "+result);

        System.out.println("Would you like to continue? Yes/No");
        answer = input.next().toLowerCase();

        while(!(answer.equals("yes")|| answer.equals("no"))){
            System.out.println("Invalid answer. Would you like to continue? Yes/No");
            answer = input.next().toLowerCase();
        }


        input.close();



        }



}
/*
Write a program for a simple calculator
                 1.1 ask the user to enter first number:
(double)
(-, +, *, /)
operator, reapet the same step until user enters a valid operator
(double)
                 1.3 ask the to enter the second number:
                 1.4 display the calculation result
                 1.5 Would you like to continue? (Yes/No)
 */