package day22_arrayList;

public class Class01_MaxMinNumbersOfMultiDimensionalArray {
    public static void main(String[] args) {


        int[][] array = {{100, 20000, 300}, {10, 1000, 50}, {-200, 400, 0}};
        // element index  0    1      2      0   1     2     0     1    2
        // 1D array index 0                  1               2

        //! Assume max and min values
        int max = array[0][0];
        int min = array[0][0];

        //! 1. Use Nested For-Each loop to iterate all 1D arrays and elements
        for (int[] each1D : array) {
            //!! Iterates all 1D arrays from 2D array
            for (int eachElement : each1D) {
                //!! Iterates all elements from each 1D array w/in 2D array
                //! Use If statements to change the value of max and min variables
                if (eachElement > max) {
                    max = eachElement;
                }//if statement max close
                if (eachElement < min) {
                    min = eachElement;
                }//if statement min close
            }//inner for-each loop close
        }//outer for-each loop close

        System.out.println("Max number in 2D array: "+max);
            //Max number in 2D array: 20000
        System.out.println("Min number in 2D array: "+min);
            //Min number in 2D array: -200

    }//main close
}//class close
