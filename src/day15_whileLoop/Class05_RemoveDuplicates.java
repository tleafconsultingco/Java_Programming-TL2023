package day15_whileLoop;

public class Class05_RemoveDuplicates {
    public static void main(String[] args) {

        // First test with existing data, then we will apply scanner

        // You cannot change the original variable without string methods
        String str = "aabbbcccc";


        String result = ""; // this will be the variable that holds the output
        // you will add the characters to the string under the condition if the character has already been added to the string


        // you need to get every character of the string using charAt() using a loop
        for (int i = 0; i < str.length(); i++) {
            // index number always starts at 0
            // Using the < you can use length of string- it will go until last character

            // get each character of the string
            char each = str.charAt(i);

            // concatenate only if the character has not already been added
            if (!result.contains("" + each)) { // !! is used for "does not". if string result does not contain a character of string str yet,
                result += each; // then we will add the character to string result
            }


        }


        System.out.println(result);

    }


}
/*
3. Write a program that can remove the duplicated characters
from the a string
Branching (Jump) statements:
                 1. Return
                 2. Break
                 3. Continue
Ex:
str = "aabbbcccc"
output:
abc
 */