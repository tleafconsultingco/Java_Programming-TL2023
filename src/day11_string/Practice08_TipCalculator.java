package day11_string;

import java.util.Scanner;

public class Practice08_TipCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Split or No split");
        String split = input.next().toUpperCase();
        System.out.println("Enter number of people");
        int numPeople = input.nextInt();
        System.out.println("Enter check amount");
        double amount = input.nextDouble();
        System.out.println("Enter quality");
        String quality = input.next().toUpperCase();


        input.close();

        // need to calculate tip rate based on service quality response
        double tipRate = 0;
        switch (quality) {
            case "EXCELLENT":
                tipRate += amount * .25;
                break;
            case "GREAT":
                tipRate += amount * .2;
                break;
            case "GOOD":
                tipRate += amount * .15;
                break;
            case "FAIR":
                tipRate += amount* .10;
                break;
            case "POOR":
                tipRate += amount*.5;
        }

        // add tip rate to check amount for total amount
        double totalAmount = amount + tipRate;


        // output
        if (split.equals("YES")){
            System.out.println("Number of People: " + numPeople);
            System.out.println("Total to Pay: "+totalAmount);
            System.out.println("Total tip: "+tipRate);
            System.out.println("Total per person: "+totalAmount/numPeople);
            System.out.println("Tip per person: "+tipRate/numPeople);
        }else{
            System.out.println("Number of People: " + numPeople);
            System.out.println("Total to Pay: "+totalAmount);
            System.out.println("Total tip: "+tipRate);
        }





    } // main close
} // class close
/*
Create a class called TipCalculator, and write a program for a tip calculator.
There will be different service quality benchmarks that will determine the tip given.
There will also the ability to calculate based on the number of people in the party and if there
is a split of the bill or not.
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
How was the service quality? (Excellent/Great/Good/Fair/Poor)
ExCElLeNt
output:
Number of people entered: 4
Total to pay: 595.0
Total tip: 119.0
Total per person: 148.75
Tip per person: 29.75
 */