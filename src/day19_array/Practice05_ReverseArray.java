package day19_array;

import java.util.Arrays;

public class Practice05_ReverseArray {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};

        /*
        STEPS
        1. Create new array that's the same size as array1
        2.
         */

        // 1. New array
        int[] reversedArray = new int[array1.length];

        // 2. Use For loop to reverse elements
        for (int i = array1.length - 1,j=0; i >= 0; i--,j++) {
            // 2a. Add variable j to account for the index of reversedArray
            reversedArray[j] = array1[i];
        }

        // 3. Print
        System.out.println(Arrays.toString(reversedArray));
            //[5, 4, 3, 2, 1]



    }//main close
}//class close
/*
Write a program that can reverse an array of integers and returns it as new array ex:
array = {1,2,3,4,5};
output:
reversedArray = {5,4,3,2,1};
 */