package day20_forEach;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Class05_ArrayUtilityMethods {
    public static void main(String[] args) {

        System.out.println("----- toString() ------");
        int[] score = {70, 100, 80, 90, 65};

        System.out.println(Arrays.toString(score));

        String result = Arrays.toString(score);

        System.out.println(result); //[70, 100, 80, 90, 65]

        System.out.println("------ equals() -------");
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {1, 2, 3, 4, 5};

        boolean r1 = Arrays.equals(a1, a2);
        System.out.println(r1); //true

        char[] ch1 = {'A', 'B', 'C'};
        char[] ch2 = {'A', 'C', 'B'};

        boolean r2 = Arrays.equals(ch1, ch2);
        System.out.println(r2);
            //false


        //? What if you want to see if the arrays have the same elements regardless of order
        System.out.println("-------- sort() ------");
        int[] nums = {100, 80, 90, 75, 88, 99, 0, 5, 4, 1000, 500};

        // 1. Print before using sort()
        System.out.println(Arrays.toString(nums));
            //[100, 80, 90, 75, 88, 99, 0, 5, 4, 1000, 500]

        //! 2. Apply sort()
        Arrays.sort(nums);
            // [0, 4, 5, 75, 80, 88, 90, 99, 100, 500, 1000]

        // 3. Print after using sort()
        System.out.println(Arrays.toString(nums));

        //! 4. Find min and max of array
        System.out.println("Min number: "+nums[0]);
            // Min number: 0
        System.out.println("Max number: "+nums[nums.length-1]);
            // Max number: 1000

        //! Use this method on strings array to see if the elements are equal even if the order isn't the same
        String[] b1 = {"A","B","C"};
        String[] b2 = {"A","C","B"};

        //!! 1. Sort the arrays separately
        Arrays.sort(b1);
        Arrays.sort(b2);

        System.out.println(Arrays.equals(b1,b2));
            //true

        //? What if the array I have is a string with multiple characters
        String[] colors = {"Red", "Orange","Yellow","Green","Blue","Indigo"};

        Arrays.sort(colors);
        System.out.println(Arrays.toString(colors));
            //[Blue, Green, Indigo, Orange, Red, Yellow] // alphabetized

        System.out.println("------- copyOf() ---------");
        int[] array ={10,20,30,40,50,60,70};

        //! 1. I want a new array to be its own object, not just a reassignment
        int[]array2 = Arrays.copyOf(array,7);
        System.out.println(Arrays.toString(array2));
            //[10, 20, 30, 40, 50, 60, 70]

        //? What if I only want the first 4 elements?
        int[]array3 = Arrays.copyOf(array,4);
        System.out.println(Arrays.toString(array3));
            //[10, 20, 30, 40]


        //? What if I pass a length that exceeds the original array?
        int[]array4 = Arrays.copyOf(array,10);
        System.out.println(Arrays.toString(array4));
            //[10, 20, 30, 40, 50, 60, 70, 0, 0, 0]

        //! the copyOf() method gives you another approach for combining arrays instead of using 2 For loops
        int[] n1 = {1,2,3,4,5};
        int[] n2 = {6,7,8,9,10,11,12};

        //!! 1. Merge the arrays into 1 by copying the first array into the new array, and set n3 length as the sum of length n1 and n2
        int[] n3 = Arrays.copyOf(n1,n1.length+n2.length);
        System.out.println(Arrays.toString(n3));
            // [1, 2, 3, 4, 5, 0, 0, 0, 0, 0, 0, 0]
        
        //!! 2. Use loop to add the elements from n2 into n3
            //? How do you know what index to start with in n3?
                //!! Length of first array is equal to the index number for the first "blank" element in the new array (where n2 array would start)
        for (int i = 0, j=n1.length; i < n2.length; i++,j++) {
            //! 2a. Declare another variable j that will be the remaining index of n3
            n3[j] = n2[i];
            // 2b. Using i you can get the elements of n2, then assign to n3 index number
        }
        // 3. Print n3
        System.out.println(Arrays.toString(n3));
            // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]

        System.out.println("------- copyOfRange ---------");
        char[] ch = {'A','B','C','D','E','F','G'};
        // index      0   1   2   3   4   5   6

        char[] range = Arrays.copyOfRange(ch,2,4); // excludes ending index
        System.out.println(Arrays.toString(range));
            // [C, D]

        //? What if you want to start copying the array from a specified index through the end?
        char[] range2 = Arrays.copyOfRange(ch,2,ch.length);

        System.out.println(Arrays.toString(range2));
            // [C, D, E, F, G]





    } // main close
} // class close
