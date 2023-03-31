package day20_forEach;

import java.util.Arrays;

public class Class01_MultiplyOddNumbers {
    public static void main(String[] args) {

        // 1. Create array using array literal since we know the elements
        int[] numbers = {1,2,3,4,5}; // size is 5

        //!! 2. Check which numbers in array are odd numbers, then mutliply by 2 and replace. Use For loop
        for (int i = 0; i < numbers.length; i++) {

            //!! 2b. create if statement to only multiply odd numbers by 2
            if(numbers[i]%2==0){
                continue; // this will skip the code fragment that is true (even number)
            }

            //!! 2a. multiple element by 2 and then get arrays
            numbers[i] = numbers [i]*2; // bc of if statement above, only the odd numbers will be multiplied by 2
        }

        // 3. Print by first calling the Array.toString number
        System.out.println(Arrays.toString(numbers));
            // [2, 2, 6, 4, 10]




    } // main close
} // class close
/*
write a program that can multiply each odd number of an integer array by 2
ex:
array = [1,2,3,4,5];
output:
array =[2,2,6,4,10]
 */