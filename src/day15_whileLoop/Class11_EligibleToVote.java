package day15_whileLoop;

import java.util.Scanner;

public class Class11_EligibleToVote {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter your age:");
        int age = input.nextInt(); // valid age 1-120
        // if they enter invalid age then you need to repeatedly ask for age

        while(!(age >=1 && age <=120)){
            System.err.println("Invalid entry. Please re-enter your age:");
            age = input.nextInt();
        }

        System.out.println("Are you a US citizen? Yes/No");
        String yesOrNo = input.next().toLowerCase();

        while (!(yesOrNo.equals("yes") || yesOrNo.equals("no"))){ // if the answer is not yes or no then we need to ask them to re-enter
            System.err.println("Invalid enter. Please re-enter");
            yesOrNo = input.next().toLowerCase();
        }

        if(age>=18 && yesOrNo.equals("yes")){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }

        input.close();
    }
}
