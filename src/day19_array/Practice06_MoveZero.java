package day19_array;

import java.util.Arrays;

public class Practice06_MoveZero {
    public static void main(String[] args) {

        int[] array1 = {10, 0, 5, 0, 1, 0};

        // 1. Create new array to house elements from array1
        int[] array2 = new int[array1.length];

        // 2. Create variable to account for array2
        int j = 0;

        // 3. Use for loop to move the zeros from array1 to array2
        for (int i = 0; i < array1.length; i++) {
            // 4. Use If statement to move the elements that are greater than 0 into the array2
            if (array1[i]!=0){
                array2[j++]=array1[i]; // TODO -- I don't understand this
            }
        }

        // 5. Print
        System.out.println(Arrays.toString(array2));
            //[10, 5, 1, 0, 0, 0]


    }//main close
}//class close
/*
write a program that can move all the zeros to the end of the array Ex:
array = {10, 0, 5, 0, 1, 0};
output:
{10, 5, 1, 0, 0, 0}
 */