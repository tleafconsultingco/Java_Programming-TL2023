package day19_array;

import java.util.Arrays;

public class Practice06_MoveZero {
    public static void main(String[] args) {

        int[] originalArray = {10, 0, 5, 0, 1, 0};

        // 1. Create new array to house elements from originalArray
        int[] newArray = new int[originalArray.length];

        // 2. Create variable to account for newArray
        int j = 0;

        // 3. Use for loop to move the zeros from originalArray to newArray
        for (int i = 0; i < originalArray.length; i++) {
            // 4. Use If statement to move the elements that are greater than 0 into the newArray
            if (originalArray[i]!=0){
                newArray[j++]=originalArray[i];
            }
        }

        // 5. Print
        System.out.println(Arrays.toString(newArray));
            //[10, 5, 1, 0, 0, 0]


    }//main close
}//class close
/*
write a program that can move all the zeros to the end of the array Ex:
array = {10, 0, 5, 0, 1, 0};
output:
{10, 5, 1, 0, 0, 0}
 */