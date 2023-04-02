package day06_if_statements;

public class Task08_NumberOfDays {

    public static void main(String[] args){


        int n = 10;

        boolean has28Days = n == 2; // if month number is 2 (Feb), then it will have 28 days
        boolean has30Days = n == 4 || n == 6 || n == 9 || n == 11;
        boolean has31Days = !has28Days && !has30Days; // if month doesn't have 28 or 30 days, then it will have 31 days
        // boolean has31Days = number == 1 || number == 3 || number == 5 || number = 7 || number = 8 || number = 10 || number == 12;

        if (has28Days){
            System.out.println("28 Days");
        }

        if (has30Days){
            System.out.println("30 days");
        }

        if (has31Days){
            System.out.println("31 days");

        }


        // To print 1 print statement
        String result = "";

        if(has28Days){
            result = "28 days";
        }

        if(has30Days){
            result = "30 days";
        }

        if(has31Days){
            result = "31 days";
        }

        System.out.println(result);


    }//main close
}//class close

/*
2. An integer variable named month is declared and given, Write a program that can print the number of days in the given month
	Ex:
	     Given:
		number = 1
	     output:
		31 days
       Hints:
	 Months that has 31 days are: 1, 3, 5, 7, 8, 10, 12
	 Months that has 30 days are: 4, 6, 9, 11
	 Month that has 28 days: 2
 */