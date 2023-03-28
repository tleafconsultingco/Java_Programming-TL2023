package day20_forEach;

public class Practice02_CommonElementsTwoIntArray {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {4,5,6,7,8};

        // 1. Initialize new variable
        int commonElements = 0;

        // 2. Use For-Each nested loop
        for (int elementA : arr1) {
            // 2a. Run loop through all elements in arr2
            for (int elementB : arr2) {
                // 3. Use if statement to compare the elements from loop
                if (elementA == elementB){
                    System.out.print(elementA+" ");
                }
            }
        }



    } // main close
} // class close
/*
Write a program that can print out the common elements from two integer array Ex:
arr1: {1,2,3,4,5} arr2: {4,5,6,7,8}
output: 45
MUST use for each loops
 */