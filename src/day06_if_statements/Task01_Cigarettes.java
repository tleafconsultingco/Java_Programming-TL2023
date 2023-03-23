package day06_if_statements;

public class Task01_Cigarettes {

    public static void main(String[] args){

        int age = 20;

        if(age >= 21){
            System.out.println("This person is " + age + " years old and eligible to buy cigarettes");
        }

        if(age < 21){
            System.out.println("This person is " + age + " years old and is not eligible to buy cigarettes");

        }


        System.out.println();
        System.out.println("------------------");

        int age1 = 45;
        boolean isEligible = age1 >= 21 && age1 < 100;

        if(isEligible){
            System.out.println("This person is " + age1 + " years old and is eligible to buy cigarettes");
        }

        if(!isEligible){
            System.out.println("This person is " + age1 + " years old and is not eligible to buy cigarettes");
        }

        if(age1 < 21 || age1 > 100){
            System.out.println("This person is " + age1 + " years old and is not eligible to buy cigarettes");
        }


    }


}
/*
1. Create a class named Cigarettes.java
2. A variable named age is declared and given, Write a program that can check if the person is eligible to buy cigarettes
	Ex:
		age = 20
	     output:
		    You are not eligible to buy Cigarettes
 */