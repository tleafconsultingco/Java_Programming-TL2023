package day21_multiDimensionalArray;

import java.util.Arrays;

public class TL01_IteratingMultiDimensionalArray {
    public static void main(String[] args) {

        System.out.println("----- FOR LOOP --------");

        // 1D element index:0   1    2     0   1   2   3   4       0   1
        int[][] arr2D = {  {10, 20, 30} , {40, 50, 60, 70, 80} ,  {90, 100} };
        // 1D arrays index:     0                    1                2
        // 2D array length:     1                    2                3

        /*
        ! STEPS to iterate every 1D array from a multidimensional (MD) array using a FOR LOOP
        1. Assign arr2D[i] to new int array each1D
        2. Print each1D (not necessary to include if you continue on to iterate all elements)
        ! STEPS CONT. to iterate every element from every 1D array w/in the MD by nesting another loop
        3. Nest another For loop to iterate each element from each1D
        4. Assign each1D[j] to a new int variable eachElement
        5. Print eachElement
         */

        for (int i = 0; i < arr2D.length; i++) { //!! i: index number of 1D array in arr2D
            int[] each1D = arr2D[i];
            System.out.println(Arrays.toString(each1D));
            for (int j = 0; j < each1D.length; j++) { //!! j: index number of elements w/in each 1D array of arr2D
                int eachElement = each1D[j];
                System.out.println(eachElement);
            }//inner loop close
        }//outer loop close

        System.out.println("----- FOR EACH LOOP ----");

        /*
        ? STEPS to iterate every 1D array from a multidimensional (MD) array using a FOR-EACH LOOP
        1. Assign the data structure as arr2D
        2. Assign the data type and variable to int[] each1DArray
        3. Print each1DArray (not necessary to include if you continue on to iterate all elements)
        ? STEPS CONT. to iterate every element from every 1D array w/in the MD by nesting another loop
        3. Nest another For-Each loop to iterate each element from each1DArray
        4. Assign the data structure as each1DArray
        5. Assign the data type and variable to int eachElement
        6. Print eachElement
         */

        for (int[] each1DArray:arr2D){
            System.out.println(Arrays.toString(each1DArray));
            for(int eachElement:each1DArray){
                System.out.println(eachElement);
            }//inner loop close
        }//outer loop close

        System.out.println("---- FOR LOOP SHORT CUT -----");
        //! Use For loop shortcuts to iterate 1D arrays w/in multidimensional (MD) arrays
            // First call the MD array, then use .fori (the For loop shortcut)
        //! 1. arr2D.fori shortcut, will get the 1D arrays
        //! 2. arr2D[i].fori shortcut, will get the elements from each 1D array
        //! 3. Print using 2 brackets



        for (int i = 0; i < arr2D.length; i++) { //!! i: index numbers of each 1D array
            for (int j = 0; j < arr2D[i].length; j++) { //!! j: index numbers of each element w/in a 1D array
                System.out.println(arr2D[i][j]);
                //!! first bracket is for the index of the 1D array
                //!! second bracket is for the index of elements of the 1D array
            }//inner loop close
        }//outer loop close

        //! In reverse
            // First call the MD array, then use .forr (the reverse For loop shortcut)
        for (int i = arr2D.length - 1; i >= 0; i--) {
        }//loop close

        System.out.println("---- FOR-EACH LOOP SHORT CUT -----");

        //! Use For-Each loop shortcuts to iterate 1D arrays w/in multidimensional (MD) arrays
        // First call the MD array, then use .for (the For-Each loop shortcut)

        //! 1. arr2D.for shortcut, will get the 1D arrays
        for (int[] each1DArray : arr2D) { //!! Will get you each 1D array from MD array
            //! 2. each1DArray.for shortcut, will get the elements from each 1D array
            for (int eachElement : each1DArray) { //!! Will get you each element from every 1D array w/in a MD array
                //! 3. Print eachElement
                System.out.println(eachElement);
                    //10
                    //20
                    //30
                    //40
                    //50
                    //60
                    //70
                    //80
                    //90
                    //100
            }//inner loop close
        }//outer loop close




    }//main close
}//class close
