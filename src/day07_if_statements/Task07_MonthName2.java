package day07_if_statements;

public class Task07_MonthName2 {

    public static void main(String[] args) {

        int number = 10;

        if (number >= 1 && number <= 12){

            if (number == 1){
                System.out.println("January");
            } else if (number == 2) {
                System.out.println("February");
            } else if (number == 3) {
                System.out.println("March");
            } else if (number == 4) {
                System.out.println("April");
            } else if (number == 5) {
                System.out.println("May");
            } else if (number == 6) {
                System.out.println("June");
            } else if (number == 7) {
                System.out.println("July");
            } else if (number == 8) {
                System.out.println("August");
            } else if (number == 9) {
                System.out.println("September");
            } else if (number == 10) {
                System.out.println("October");
            } else if (number == 11) {
                System.out.println("Novemeber");
            }else {
                System.out.println("December");
            }


        }else{
            System.out.println("Invalid");
        }


        // using no curly braces

        String month = "";

        if (number >= 1 && number <= 12){
            if (number == 1) month = "January";
            else if (number== 2) month = "February";
            else if (number== 3) month = "March";
            else if (number== 4) month = "April";
            else if (number== 5) month = "May";
            else if (number== 6) month = "June";
            else if (number== 7) month = "July";
            else if (number== 8) month = "August";
            else if (number== 9) month = "September";
            else if (number== 10) month = "October";
            else if (number== 11) month = "November";
            else month = "December";

        }else{
            System.out.println("Invalid");
        }

        System.out.println(month);

    }













}
/*
Create a class named MonthName.java
2. An integer variable named number is declared and given, Write a
program that can print the name of the month that the number
represents. (only if the given number is a valid number, then print the
name of the month. Otherwise print Invalid)

Ex:
Given:
number = 10

output:

October
 */