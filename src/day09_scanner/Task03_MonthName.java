package day09_scanner;

import java.util.Scanner;

public class Task03_MonthName {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter number: ");

        int num = input.nextInt();

        String month = "Invalid month";

        if(num >=1 && num <=12) {
            month = (num == 1) ? "Jan" : (num == 2) ? "Feb" : (num == 3) ? "Mar" : (num == 4) ? "Apr" : (num == 5) ? "May" : (num == 6) ? "Jun" : (num == 7) ? "Jul" : (num == 8) ? "Aug" : (num == 9) ? "Sep" : (num == 10) ? "Oct" : (num == 11) ? "Nov" : "Dec";
        }

            input.close();


            System.out.println("Your month is: "+month);



        }






    }

/*
Ask the user to enter number then display the name
 */