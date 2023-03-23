package day11_string;

import java.util.Scanner;

public class Practice01_StartsWithX {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word:");

        String word = input.nextLine();

        input.close();

        if(word.charAt(0) == 'x'){
            word = word.replace('x','a');
        }

        System.out.println(word);

    }





}
/*
Create a class named StartsWithX and write a program that asks user to enter a word. If the
work starts with x, replace it with a.

Input:
xcodex
Output:
acodex
 */