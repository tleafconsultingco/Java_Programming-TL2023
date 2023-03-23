package day07_if_statements;

public class Task01_PosNegZero {

    public static void main(String[]args){

        int number = 20;


        String result = "";

        if (number > 0){
            result = "Positive";
        } else if (number < 0) {
            result = "Negative";
        }else {
            result = "Zero";
        }


        System.out.println(result);

    }



}
/*
Create a class named PosNegZero.java
2. An integer variable named number is declared and given, Write a program can identify if the number is positive, negative or zero
Ex:
number = 20
output: Positive
 */