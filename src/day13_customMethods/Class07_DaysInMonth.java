package day13_customMethods;

import java.util.Scanner;

public class Class07_DaysInMonth {


    public static void main(String[] args) {

        int month = new Scanner(System.in).nextInt();

        if(month<1||month >12) {
            System.err.println("Invalid number");
            return;
        }

        switch(month){
            case 2:
                System.out.println("28 days");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("31 days");
                break;
            default: // able to use this for the remaining months bc of the previous if statement and return statement
                System.out.println("30 days");




        }





    }



}
