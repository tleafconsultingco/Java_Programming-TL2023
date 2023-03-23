package day12_customMethods;

import java.util.Scanner;

public class Class03_TipCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Split or no split (yes or no)");
        String yesNo = input.next().toLowerCase();

        System.out.println("Enter number of people (number)");
        int numPeople = input.nextInt();

        System.out.println("Enter check amount (number)");
        double amount = input.nextDouble();

        input.nextLine();
        System.out.println("Enter service quality (poor, fair, good, great, excellent)");
        String service = input.next().toLowerCase();

        input.close();

        double tip = (service.equals("excellent")) ? amount * .25
                : (service.equals("great")) ? amount * .2
                : (service.equals("good")) ? amount * .15
                : (service.equals("fair")) ? amount * .10
                : amount * .05;

        double totalPay = amount + tip;

        System.out.println("Number of people entered: " + numPeople);
        System.out.println("Total to pay: " + totalPay);
        System.out.println("Total tip: " + tip);

        if(yesNo.equals("yes")){
            System.out.println("Total per person: " + (totalPay / numPeople));
            System.out.println("Tip per person: " + (tip / numPeople));
        }




    }

}
/*
Create a class called TipCalculator, and write a program for a tip calculator.
	    There will be different service quality benchmarks that will determine the tip given.
	    There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.

	        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

	    The program should ask the user to enter:
	            - Split or No split (Yes or No),
	             - Enter the number of people (number)
	             - Enter the check amount (number)
	             - Service Quality (String)

	    And then it should display:
	             Number of people entered
	             Total to pay
	             Total tip
	             Total per person
	             Tip per person:

		    Ex:
		        Split or No split (Yes or No)?
		        YeS
		        Enter the number of people
		        4
		        Enter the check amount:
		        476
		        How was the srvice quality? (Excellent/Great/Good/Fair/Poor)
		        ExCElLeNt

		        output:
		            Number of people entered: 4
		            Total to pay: 595.0
		            Total tip: 119.0
		            Total per person: 148.75
		            Tip per person: 29.75
 */