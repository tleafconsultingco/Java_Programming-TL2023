package day09_scanner;

import java.util.Scanner;

public class Class05_DaysInWeek {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // default statement
        // but if you will only use the scanner one time then you don't need to store into a variable
        // if you use this, remember to close

        System.out.println("Enter the day number: ");

        // new Scanner(System.in).nextInt(); // this line is used when you only need to use the scanner object ONE time, it will automatically close after this step.

        int num = input.nextInt();

        String day = "Invalid";

        if(num >=1 && num <=7){

            day = (num==1)? "Mon":(num==2)?"Tue":(num==3)?"Wed":(num==4)?"Thu":(num==5)?"Fri":(num==6)?"Sat":"Sun";
        }

        input.close();

        System.out.println("The day is: "+day);


    }


}
