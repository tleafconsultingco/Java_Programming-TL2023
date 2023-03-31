package day21_multiDimensionalArray;
import java.util.Arrays;
public class Class04_IteratingMultiDimensionalArray {
    public static void main(String[] args) {

        //! Iterate every 1D array from a multidimensional array (MD)
        // 1D element index:0   1    2     0   1   2   3   4       0   1
        int[][] arr2D = {  {10, 20, 30} , {40, 50, 60, 70, 80} ,  {90, 100} };
        // 1D arrays index:     0                    1                2
        // 2D array length:     1                    2                3

        //! 1. Use For loop
        for (int i = 0; i < arr2D.length; i++) { 
            //!! 1a. i: index number of 1D array in arr2D
            //!! 1b. i condition needs to be less than 3, since it's the total number of iterations that we have (2D array length = last index number)
                //? 1c. What if the MD array has more than 3 1D arrays?
                    //?? You would pass length of MD array

            //! 2. Assign arr2D[i] to new int variable
            int[] each1D = arr2D[i];

            //! 3. Print
            System.out.println(Arrays.toString(each1D));
                //[10, 20, 30]
                //[40, 50, 60, 70, 80]
                //[90, 100]
            //!! 2&3 Alt. Print w/in statement
            // System.out.println(Arrays.toString(arr2D[i]));

            //! 4. Iterate every element from every 1D array w/in the MD by nesting another loop
            for (int j = 0; j < each1D.length; j++) {
                //!! Need to iterate each element from each1D
                //!! j is the index number of the elements w/in each 1D array of arr2D
                int eachElement = each1D[j];
                //! 5. Print
                System.out.println(eachElement);
                    //[10, 20, 30]
                    //10
                    //20
                    //30
                    //[40, 50, 60, 70, 80]
                    //40
                    //50
                    //60
                    //70
                    //80
                    //[90, 100]
                    //90
                    //100
            }//inner loop close
        }// outer loop close

        System.out.println("-------");

        //! Iterate elements from a multidimensional array

        //! 1. Use For-Each loop
        for (int[] each1DArray:arr2D){ //!! This loop only iterates the 1D arrays w/in the MD array
            //!! Create new array variable for 1D arrays w/in arr2D
            // arr2D has arrays, not elements (3 total)
            // arr2D has 3 index numbers (0-2)
            // Every 1D array has elements that start at index 0
            //! 2. Print
            System.out.println(Arrays.toString(each1DArray));
                //[10, 20, 30]
                //[40, 50, 60, 70, 80]
                //[90, 100]

            //! 3. Iterate every element from every 1D array w/in the MD by nesting another loop
            for(int eachElement:each1DArray){
                //! 4. Print
                System.out.println(eachElement);
                    //[10, 20, 30]
                    //10
                    //20
                    //30
                    //[40, 50, 60, 70, 80]
                    //40
                    //50
                    //60
                    //70
                    //80
                    //[90, 100]
                    //90
                    //100
            }//inner loop close
        }//outer loop close

        System.out.println("---- FOR LOOP SHORT CUT -----");

        //! Use For loop shortcuts to iterate 1D arrays w/in multidimensional (MD) arrays
        // First call the MD array, then use .fori (the For loop shortcut)

        //! 1. arr2D.fori shortcut, will get the 1D arrays
        for (int i = 0; i < arr2D.length; i++) { //!! i: index numbers of each 1D array
            //! 2. arr2D[i].fori shortcut, will get the elements from each 1D array
            for (int j = 0; j < arr2D[i].length; j++) { //!! j: index numbers of each element w/in a 1D array
                //! 3. Print using 2 brackets
                System.out.println(arr2D[i][j]);
                //!! first bracket is for the index of the 1D array
                //!! second bracket is for the index of elements of the 1D array
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

        //! In reverse
        // First call the MD array, then use .forr (the reverse For loop shortcut)
        for (int i = arr2D.length - 1; i >= 0; i--) {
        }//loop close

        System.out.println("---- FOR-EACH LOOP SHORT CUT -----");

        //! Use For-Each loop shortcuts to iterate 1D arrays w/in multidimensional (MD) arrays
        // First call the MD array, then use .for (the For-Each loop shortcut)
        //! 1. arr2D.for shortcut, will get the 1D arrays
        //! 2. each1DArray.for shortcut, will get the elements from each 1D array
        //! 3. Print eachElement

        for (int[] each1DArray : arr2D) { //!! Will get you each 1D array from MD array
            for (int eachElement : each1DArray) { //!! Will get you each element from every 1D array w/in a MD array
                System.out.println(eachElement);
            }//inner loop close
        }//outer loop close









    }//main close
}//class close
