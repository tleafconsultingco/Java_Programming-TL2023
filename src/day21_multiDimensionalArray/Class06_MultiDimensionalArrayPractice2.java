package day21_multiDimensionalArray;

import java.util.Arrays;

public class Class06_MultiDimensionalArrayPractice2 {
    public static void main(String[] args) {

        //- 3D array

        //!! First 2D array
        int[][] arr2D1 = {{1, 2}, {3, 4, 5}};
        // 1D index        0  1    0  1  2
        // 2D index        0       1
        // 2D length       1       2

        //!! Second 2D array
        int[][] arr2D2 = {{6, 7, 8, 9}, {10, 11}, {12, 13, 14}};
        // 1D index        0  1  2  3    0   1     0    1   2
        // 2D index        0             1         2
        // 2D length       1             2         3

        //!! Third 2D array
        int[][] arr2D3 = {{15, 16, 17, 18}};
        // 1D index        0   1   2   3
        // 2D index        0
        // 2D length       1


        //! Storing the 2D arrays into a 3D array!

        //!! 3D array
        //?? Cannot contain elements or 1D arrays. Only 2D arrays.
        int[][][] arr3D = {{{1, 2}, {3, 4, 5}}, {{6, 7, 8, 9}, {10, 11}, {12, 13, 14}}, {{15, 16, 17, 18}}};
        // 1D index          0  1    0  1  2      0  1  2  3    0   1     0   1   2      0    1   2   3
        // 2D index          0       1            0             1         2              0
        // 3D index          0                    1                                      2
        // 2D length         1                    2                                      3
        //!! [index of 2d array][index of 1d array][index of elements]

        System.out.println(Arrays.deepToString(arr3D));
        //[[[1, 2], [3, 4, 5]], [[6, 7, 8, 9], [10, 11], [12, 13, 14]], [[15, 16, 17, 18]]]

        //? Can I pull a specific 2D array from the 3D array?
            //?? Yes, you only need 1 bracket
        //!! Pull the 2nd 2D array (index 1)
        System.out.println(Arrays.deepToString(arr3D[1])); //!! use deepToString() since we are printing a 3D array
            //[[6, 7, 8, 9], [10, 11], [12, 13, 14]]

        //? Can I pull a specific 1D array from the 3D array?
            //?? Yes, include 2 brackets -- first will have the index of the 2D array that contains the 1D array
        //!! Pull the 2nd 1D array from the 1st 2D array (indexes 0 and 1)
        System.out.println(Arrays.toString(arr3D[0][1])); //!! use toString() since we are printing a 2D array
            //[3, 4, 5]

        //? Can I pull an element from the 3D array?
            //?? Yes, include 3 brackets -- first will have the index of the 2D array that contains the 1D array that the element is a part of
        //!! Pull the 3rd element of the 3rd 1D array from the 2nd 2D array (indexes 2, 2, and 1)
        System.out.println(arr3D[1][2][2]); //!! not necessary to call an array class method since you aren't printing an array
            //14
        //!! Pull the 3rd element of the 1st (only) 1D array from the 3rd 2D array (indexes 2, 0, and 2)
            //17

        //! Iterating 2D arrays, 1D arrays, and elements in a 3D array

        System.out.println("------ Iterate 2D arrays ------");
        //! Use a For loop for iterating 2D arrays
        for (int i = 0; i < arr3D.length; i++) { //!! i: index number of each 2D array
            //!! Initialize another array to contain indexes from arr2D3
            int[][] each2DArray = arr3D[i];
            System.out.println(Arrays.deepToString(each2DArray)); //!! use deepToString() to print from 3D arrays
                //[[1, 2], [3, 4, 5]]
                //[[6, 7, 8, 9], [10, 11], [12, 13, 14]]
                //[[15, 16, 17, 18]]
        }//For loop close

        System.out.println("------ Iterate 1D arrays ------");
        //! Use a nested For loop for iterating 1D arrays
        for (int i = 0; i < arr3D.length; i++) {
            int[][] each2DArray = arr3D[i];
            for (int j = 0; j < each2DArray.length; j++) { //!! j: index of each 1D array
                int[] each1DArray = each2DArray[j];
                System.out.println(Arrays.toString(each1DArray)); //!! use toString() to print from 2D arrays
                    //[1, 2]
                    //[3, 4, 5]
                    //[6, 7, 8, 9]
                    //[10, 11]
                    //[12, 13, 14]
                    //[15, 16, 17, 18]
            }//inner For loop close
        }//outer For loop close

        System.out.println("------ Iterate elements ------");
        //! Use a double nested For loop for iterating elements
        for (int i = 0; i < arr3D.length; i++) {
            int[][] each2DArray = arr3D[i];
            for (int j = 0; j < each2DArray.length; j++) {
                int[] each1DArray = each2DArray[j];
                for (int k = 0; k < each1DArray.length; k++) { //!! k: index of each element
                    int eachElement = each1DArray[k];
                    System.out.print(eachElement+" "); //!! no need to use Array class method to print from 1D array
                        //1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18
                }//inner inner For loop close
            }//inner For loop close
        }//outer For loop close

        System.out.println();

        String[][] array2D1 = {{"1D-1"}};
        String[][] array2D2 = {{"1D-2","1D-3"},{"1D-4","1D-5","1D-6"}};
        String[][] array2D3 = {{"1D-7","1D-8","1D-9"},{"1D-10","1D-11"},{"1D-12"}};
        String [][][] array3D = {array2D1,array2D2,array2D3};
        System.out.println(Arrays.deepToString(array3D));
            //[[[1D-1]], [[1D-2, 1D-3], [1D-4, 1D-5, 1D-6]], [[1D-7, 1D-8, 1D-9], [1D-10, 1D-11], [1D-12]]]




    }//main close
}//class close
