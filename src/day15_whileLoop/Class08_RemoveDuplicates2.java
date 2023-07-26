package day15_whileLoop;

public class Class08_RemoveDuplicates2 {
    public static void main(String[] args) {
        // a different approach to the same problem in Class05_RemoveDuplicates

        String str = "aabbbcccc";

        String result = "";

        // iterate string
        for (int i = 0; i < str.length(); i++) {

            if (result.contains("" + str.charAt(i))) { // if the character is already contained in a new string
                continue; // skip it
            }

            result += str.charAt(i);

        }

        System.out.println();
        System.out.println("--------");

        // find the sum of all the even numbers between 50-100

        // first way
        for (int i = 50; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i+" ");
            }
        }

        System.out.println();

        // second way
        for (int i = 50; i <= 100; i +=2) { // checks every 2 iterations
            System.out.print(i+" ");
        }
        System.out.println();

        // third way
        for (int i = 50; i <= 100; i++) {
            if (i % 2 != 0) {
                continue; // will skip all the odd numbers
            }
            System.out.print(i+" ");
        }

        System.out.println();

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