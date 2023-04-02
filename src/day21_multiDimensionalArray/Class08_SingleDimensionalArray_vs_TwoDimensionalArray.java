package day21_multiDimensionalArray;
import java.util.Arrays;
public class Class08_SingleDimensionalArray_vs_TwoDimensionalArray {
    public static void main(String[] args) {

        //- 1D arrays

        //! 1. 1D array using new keyword
        int[] arr1D = new int[10]; //!! new keyword when you don't know what the elements are, but you know how many there are
        System.out.println(Arrays.toString(arr1D));
            //[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        //! 2. 1D arrays using array literals
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8};
        int[] arr3 = {9, 10};
        int[] arr4 = {11, 12, 13, 14, 15};
        int[] arr5 = {16, 17, 18, 19, 20, 21};

        int[] arr6 = {30, 40, 50, 60, 70, 80, 90};

        //! 3. Assign all the 1D arrays into a 2D array using new keyword
        int[][] arr2D = new int[5][]; //!! index: 0 ~ 4
            //!! 5 1D arrays within this 2D array
        // System.out.println(Arrays.deepToString(arr2D));
            //[null, null, null, null, null]
            //!! recall that arrays are objects and default for objects is null
        //! 3a. Assign arr2D indexes to 1D arrays
        arr2D[0] = arr1;
        arr2D[1] = arr2;
        arr2D[2] = arr3;
        arr2D[3] = arr4;
        arr2D[4] = arr5;

        //!! Arrays are fixed, which means you cannot add more elements/arrays than is determined in the new array
        // arr2D[5] = arr6;

        System.out.println(Arrays.deepToString( arr2D));
            //[[1, 2, 3, 4, 5], [6, 7, 8], [9, 10], [11, 12, 13, 14, 15], [16, 17, 18, 19, 20, 21]]

    }//main close
}//class close
