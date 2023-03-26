package day19_array;

public class Class06_MaxNumber {
    public static void main(String[] args) {

        int[] numbers = {100,20,500,40,-10,30};

        // 1. Assign variable max
        int max = numbers[0]; // this is an assumption
            // index 0, value is 100...set as the max

        // 2. In order to compare elements we need to create a For loop

        for (int i = 1; i < numbers.length; i++) { // index 1,2,3,4,5. can start from second element since we already accounted for the first in our variable max (will prevent an extra unnecessary iteration)
            // 2a. If statement to replace max number value
            if(numbers[i] > max){
                max = numbers[i];
                // at index 1, value is 20...does not update the max
                // index 2, value is 500...updates the max
                // index 3, value is 40...does not update the max
                // index 4, value is -10...does not update the max
                // index 5, value is 30...does not update the max
            }
        }
        System.out.println("max = " + max);
            // max = 500




    } // main close
} // class close
/*
Write a program that can find the maximum number from an array
 */