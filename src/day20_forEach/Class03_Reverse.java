package day20_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Class03_Reverse {
    public static void main(String[] args) {
        // Create a new array that is reverse of array below
        int[] array1 = {1, 2, 3, 4, 5};

        // 1. Create new array that is the same size as array1
        int[] reverse = new int[array1.length];

        // 2. Iterate array1 by using For loop
        for (int i = array1.length-1,j=0; i >= 0; i--,j++) {
            // 2a. Declare a second variable j to hold characters
            reverse[j] = array1[i]; // every time i is decreased j is increased
        }

        System.out.println("reverse = " + Arrays.toString(reverse));

        System.out.println("-------Using custom method-------");

        int[] nums = {100,200,300,400,500};
        nums = ArraysUtility.reverse(nums);
        System.out.println(Arrays.toString(nums));
            // [500, 400, 300, 200, 100]

        System.out.println("-----reverse double------");

        double[] a1 = {1.5, 2.5, 3.5, 4.5};
        a1 = ArraysUtility.reverse(a1);

        System.out.println(Arrays.toString(a1));
            // [4.5, 3.5, 2.5, 1.5]


    } // main close
} // class close
/*
Write a program that can reverse an array of integers and returns it as new array ex:
array = {1,2,3,4,5};
output:
reversedArray = {5,4,3,2,1};

 */