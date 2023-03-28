package day19_array;

public class Practice07_CommonElement {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5},
                arr2 = {4, 5, 6, 7, 8};


        // 1. Use for loop to pull all the elements from arr1
        for (int i = 0; i < arr1.length; i++) {
            // 2. Nest another for loop to do the same with arr2
            for (int j = 0; j < arr2.length; j++) { // 2a. Change variable to j
                // 3. Use if statement to compare the elements of arr1 and arr2
                if (arr1[i]==arr2[j]){
                    System.out.print(arr1[i]);
                        //45
                }
            }
        }


    }//main close
}//class close
/*
Write a program that can print out the common elements from two integer array Ex:
arr1: {1,2,3,4,5} arr2: {4,5,6,7,8}
output: 45
 */