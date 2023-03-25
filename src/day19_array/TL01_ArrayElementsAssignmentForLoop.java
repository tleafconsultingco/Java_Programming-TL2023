package day19_array;

import java.util.Arrays;

public class TL01_ArrayElementsAssignmentForLoop {
    public static void main(String[] args) {


        // 0. Create a new array: assignElements
        int[] assignElements = new int[10];

        // 0a. Print assignElements
        System.out.println("assignElements = " + Arrays.toString(assignElements));
            // assignElements = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        // Assign values to assignElements using For loop. Two ways.
        // 1. Assigning values to another variable's value
        for (int i = 0, j = 1; i < assignElements.length; i++, j++) {
            // 1a. Add variable j to represent the elements (in initialization and iterator). Remember - i is the index number
            // 1b.
            assignElements[i] = j; // access index numbers of array and assign to j value
        }
        // 1c. Print assignElements
        System.out.println("assignElements created by adding variable j: "+Arrays.toString(assignElements));
            // assignElements created by adding variable j: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        // 2. Assigning value of index to increase i+1 (which will make index 0 "return as" 1 instead)
        for (int i = 0; i < assignElements.length; i++) {
            // 2a.
            assignElements[i] = i+1; // the value returned will be the index number + 1, to make it seem like the first element is 1 even though its index number is 0 by default
        }
        // 2b. Print assignElements
        System.out.println("assignElements created by i+1: " +Arrays.toString(assignElements));
            // assignElements created by i+1: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]






    } // main close
} // class close
