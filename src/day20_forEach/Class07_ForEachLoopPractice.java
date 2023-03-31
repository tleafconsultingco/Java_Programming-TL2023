package day20_forEach;

import java.util.Arrays;

public class Class07_ForEachLoopPractice {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        //! 1. Print odd numbers from array. 2 options: For loop and For-Each loop
        //!! 1a. If you use For loop you need to specify the components
        // 1b. If you use For-Each loop you don't need to worry about those components required in the For loop
        //!! 1c. Best loop is For-Each loop

        //! 2. Use For-Each loop
        for (int each : numbers) {
            //!! 2a. During each execution it will pull elements in succession
            // 2b. Print
            // System.out.println(each); // will print all numbers, not just odd. First add an If statement
            //!! 2c. Create if statement to only print odd numbers
            if (each % 2 != 0) {
                System.out.println(each);
                    // 1
                    // 3
                    // 5
                    // 7
                    // 9
                    // 11
            } // If statement close
        } // For-Each loop close

        System.out.println("---------------");

        int[] nums = {100,20,30,40,5,4,3,1,2,1000,300,500};

        //! Find max and min numbers -- can't use sort()

        //! 1. Assume first number in this array is the max
        int max = nums[0];
        //!! 1a. Check against all elements and update the value of max
        for (int each : nums) {
            //!! 1b. Creat if statement to update max value
            if (each > max) { // 1c. If true...
                max = each; //!! 1c. Assign new value of each to the value of max
            } // if close
        } // for-each close
        System.out.println("max: " +max);
            // 1000
        
        //! 2. Assume first number in the array is the min
        int min = nums[0];
        for (int each : nums) {
            if(each<min){
                min = each;
            } // if close
        } // for each close
        System.out.println("min: "+min);
            // 1

        //! IF YOU USED REGULAR FOR LOOP YOU DO NOT HAVE DIRECT ACCESS TO THE ELEMENT. YOU ONLY HAVE ACCESS TO THE INDEX, THEN YOU USE THE INDEX NUMBER TO GET THE ELEMENT (additional step)!


        System.out.println("------ merging two arrays ------");

        //! Merge a1 and a2
        int[] a1 = {10,20,30,40,50};
        int[] a2 = {60,70,80,90,100,110,120};

        //! 1. Create third array, remember the size needs to be the sum of length a1 and a2
        int[] a3 = new int[a1.length+a2.length];

        //! Access all elements in a1 and a2 by using For-Each loop, but you don't have index numbers for For-Each loops
        //!! 2. Create new variable to be the index number of a3 every time the loop is executed
        int k = 0;

        //? How do I get all elements of a1?
        //! 3. Call For-Each loop for first array
        for (int each : a1) {
            //!! 3a. Variable name each represents the first element of a1
            //!! 3b. Assign each element of a1 to indexes of a3
            a3[k++] = each;
            //!! 3c. Every time the loop is executed it will automatically flow to the next element, the index of a3 does not automatically do this, so we need to increase k by 1 using a postincrement
        } // for-each loop close

        //? How do I get all elements of a2?
        //?? 4. Repeat same process as a1
        for (int each : a2) {
            a3[k++] = each;
        }
        // 5. Print
        System.out.println(Arrays.toString(a3));
            //[10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120]

        System.out.println("----- Print initials -----");

        //! Display the initials of every person
        String[] names = {"Mohammad Karimi", "Vasyl Dobrianski", "Gadir Ibrahimov", "Abidullah Rahimi"};

        //! 1. Use For-Each loop
        for (String each : names) {
            // 1a. Print names
            // System.out.println(each);
                //Mohammad Karimi
                //Vasyl Dobrianski
                //Gadir Ibrahimov
                //Abidullah Rahimi
            //! 2. But we just want the initials. Use string methods.
                //!! 2a. How do you get the initial of the last name? Pass the index number of the character placed after the space
            System.out.println(each.charAt(0)+"."+each.charAt(each.lastIndexOf(" ")+1)); // 2b. (each.lastIndexOf(" ")+1) returns the character at the index after the space
                //M.K
                //V.D
                //G.I
                //A.R
        } // loop close






    } // main close
} // class close
