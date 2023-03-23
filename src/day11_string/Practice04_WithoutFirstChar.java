package day11_string;

import java.util.Scanner;

public class Practice04_WithoutFirstChar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter two words");
        String word1 = input.nextLine();
        String word2 = input.nextLine();

        input.close();

        System.out.println(word1.substring(1)+word2.substring(1));


    }

}
/*
Create a class named WithoutFirstChar. Ask user to enter two words. Print first word without
its first character
then print the second word without its first character.
Input:
apple
banana
Output:
ppleanana
 */