package day20_forEach;

import java.util.Arrays;
import utilities.ArraysUtility;
public class Class02_MergeTwoArrays {
    public static void main(String[] args) {

        // 1. Create 2 arrays (given)
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7};

        //? How do you merge these two arrays into a third array?

        //! 2. You need the third array to be the size of first and second array combined
        //!! 2a. Use new keyword with the size equal to length of arr1 plus length of arr2
        int[] arr3 = new int[(arr1.length + arr2.length)];

        //! 3. Start merge...but the arrays are different lengths
        //!! 3a. You need to create a For loop that uses different variables to represent the different arrays

        int k = 0; //!! 3b. Declare a new variable to be the index variables of arr3 to use during the loops of arr1 and arr2

        //!! 3c. Iterate each of the arrays one at a time

        //! 4. Iterate first array
        for (int i = 0; i < arr1.length; i++, k++) { // 4a. i is for arr1 index numbers
            //!! 4b. increase k iterator to account for adding to arr3 to track elements of arr3 since arr3 needs to include elements of arr2 after getting elements of arr1
            arr3[k] = arr1[i]; //!! use k to track indexes of arr3
        } //! this loop will get all elements of arr1 into arr3

        // 4c. Print to check arr3 contains elements of arr1
        System.out.println("arr3 with arr1 elements: " + Arrays.toString(arr3));
        // arr3 with arr1 elements: [1, 2, 3, 4, 0, 0, 0]
        //                          [arr1 index] [empty elements reserved for arr2]

        //! 5. Iterate second array
        for (int i = 0; i < arr2.length; i++, k++) { // 5a. i is for arr1 index numbers
            arr3[k] = arr2[i]; //!! this loop will get all elements of arr2 into arr3 (which already contains elements of arr1)
        }

        // 5b. Print to check arr3 contains elements of arr1 + arr2
        System.out.println("arr3 with arr1 and arr2 elements: " + Arrays.toString(arr3));
        // arr3 with arr1 and arr2 elements: [1, 2, 3, 4, 5, 6, 7]
        //                                   [arr1      ][arr2   ]

        //? IF I WANT TO ADD MORE ARRAYS, IS IT WISE TO RUN THIS CODE OVER AND OVER?
            //! No, create a method!


        System.out.println("-----USING CUSTOM METHOD-----");

        int[] a1 = {10,20,30,40,50,60};
        int[] a2 = {70,80,90};

        // 1. Import utilities package

        int[] a3 = ArraysUtility.merge(a1,a2);
        System.out.println(Arrays.toString(a3));
            //[10, 20, 30, 40, 50, 60, 70, 80, 90]

        System.out.println("----merging arrays with doubles------");

        double[] b1 = {10.5,20.5,30.5,40.5,50.5};
        double[] b2 = {60.5,70.5,80.5,90.5};

        //! You cannot use the ArraysUtilties merge method that has int parameters
            //!! Create a new method that passes double data type

        double[] b3 = ArraysUtility.merge(b1,b2);
        System.out.println(Arrays.toString(b3));
            //[10.5, 20.5, 30.5, 40.5, 50.5, 60.5, 70.5, 80.5, 90.5]

        System.out.println("-----merging arrays with char------");

        char[] ch1 = {'A','b','c','D','e'};
        char[] ch2 = {'X','Y','Z'};

        char[] ch3 = ArraysUtility.merge(ch1, ch2);
        System.out.println(Arrays.toString(ch3));
            //[A, b, c, D, e, X, Y, Z]

        System.out.println("------------merging arrays with String-------------");

        String[] c1 = {"Java", "Python", "JavaScript", "Ruby"};
        String[] c2 = {"C#", "C++", "Swift"};

        String[] c3 = ArraysUtility.merge(c1, c2);
        System.out.println(Arrays.toString(c3));
            //[Java, Python, JavaScript, Ruby, C#, C++, Swift]






    } // main close
} // class close
/*
write a program that can merge two arrays of integers Ex:
arr1 = {1,2,3,4} arr2 = {5,6}
output
arr3 = {1,2,3,4,5,6}
 */