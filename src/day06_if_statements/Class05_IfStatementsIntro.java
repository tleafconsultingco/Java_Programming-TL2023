package day06_if_statements;

public class Class05_IfStatementsIntro {
    public static void main(String[] args){


        int number = -100;

        System.out.println(number + " is positive"); // this statement does not depend on any condition
        // create boolean condition
        boolean isPositive = number > 0;

        // now create if statement
        if(isPositive){
            System.out.println(number + " is positive"); // this can only be printed if the condition is true

        }

        boolean isNegative = number <0;
        if(isNegative) {
            System.out.println(number + " is negative"); // gets executed
        }

        boolean isZero = number == 0;
        if(isZero) {
            System.out.println(number + " is zero"); // does not get executed
        }

    }
}
