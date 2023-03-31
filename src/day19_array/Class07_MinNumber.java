package day19_array;

public class Class07_MinNumber {
    public static void main(String[] args) {

        int[] numbers = {100,20,500,40,-10,30};
        
        //! 1. Assign variable min
        int min = numbers[0]; //!! assume that the first element is the min value of the array
            //!! index 0, value is 100...set as the max

        for (int i = 1; i < numbers.length; i++) { //!! index 1,2,3,4,5. can start from second element since we already accounted for the first in our variable min (will prevent an extra unnecessary iteration)
            //! 2a. If statement to replace min number value
            if(numbers[i]<min){
                min = numbers[i];
                // at index 1, value is 20...updates the min
                // index 2, value is 500...does not update the min
                // index 3, value is 40...does not update the min
                // index 4, value is -10...updates the min
                // index 5, value is 30...does not update the min
            }
        }
        System.out.println("min = " + min);
            // min = -10


    } // main close


} // class close
/*
Write a program that can find the minimum number from an array
 */