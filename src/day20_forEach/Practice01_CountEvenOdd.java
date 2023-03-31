package day20_forEach;

import java.util.Arrays;

public class Practice01_CountEvenOdd {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        //! 1. Create variables for count
        int countOdd = 0;
        int countEven = 0;

        //! 2. Use For each loop
        for (int each : numbers) {
            //!! 3. Use if...else statement to increase value of countEven by 1 if the element can be divided by 2 with remainder 0
            if (each % 2 == 0) {
                countEven++;
            } else { //!! 3a. Set else statement to be other values (odd) and increase value of countOdd by 1
                countOdd++;
            }
        }

        //! 4. Concatenate the results
        System.out.println(Arrays.toString(numbers) + " even numbers = " + countEven + ", odd numbers = " + countOdd);


    } // main close
} // class close
/*
Write a program that can count the even and odd number from an array of integers Note: MUST use for each loop
 */