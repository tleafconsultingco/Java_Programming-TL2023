package day21_multiDimensionalArray;
import java.util.Arrays;
public class Class03_MultiDimensionalArrayIntro {
    public static void main(String[] args) {


        int[] arr1 = {10, 20, 30};
        int[] arr2 = {40, 50, 60, 70, 80};
        int[] arr3 = {90, 100};
        int[] arr4 = {1000,2000};

        //! Instead of storing into 3 different variables you can put them in 1 and keep them in their own containers (multidimensional array)

        //!! 1. For 3 containers you create a two-dimensional array
        int[][] arr2D = {  {10, 20, 30} , {40, 50, 60, 70, 80} ,  {90, 100} };
            //  index :         0                    1                2
            // length :         1                    2                3

        //? What is the length of arr2D? This depends on how many single dimensions we have stored in the array.
        System.out.println(arr2D.length); // Determined by total number of arrays.
            //3

        //? 2. How do we pull an array or an element from a multidimensional array?
        // 2a. Identify the index number of the single dimensional array
        System.out.println(Arrays.toString(arr2D[0])); //[10, 20, 30]
        System.out.println(Arrays.toString(arr2D[1])); //[40, 50, 60, 70, 80]
        System.out.println(Arrays.toString(arr2D[2])); //[90, 100]

        //! 3. Access the element from a single dimensional array w/in arr2D
        //!! 3a. Identify the index number of the single dimensional array AND the index number of the element w/in that array
        System.out.println(arr2D[2][0]); //90
            // You don't need to use toString() to print an element since it's not the entire array
        System.out.println(arr2D[1][2]); //60

    }//main close
}//class close
