package day19_array;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Class09_AverageNumber {
    public static void main(String[] args) {

        // 1. Declare scanner
        Scanner input = new Scanner(System.in); // located in the heap

        //!! 2. Ask user how many numbers they would like to enter. This will determine the size of our array
        System.out.println("How many numbers do you want to enter?");
        int total = input.nextInt();

        //? 3. How do you instantiate an array based on user answer?
            //?? new keyword
        int[] numbers = new int[total];

        //! 4d. Create new variable to find sum of the numbers
        int sum = 0;

        //!! 4. Ask user to enter number for a given number of times
            //! use a For loop
        for (int i = 0; i < total; i++) { // total is also the length of the array
            //!! 4a. When I get user input, use i to get elements of array

            // 4b.
            System.out.println("Enter a number");
            numbers[i] = input.nextInt(); //!! every input needs to be assigned to the array elements

            //! 4c. You can also use this loop to find sum
            sum += numbers[i];
        }

        input.close();

        // !5. Find average by creating a new variable
        double average = sum/(double)total; //!! sum is integer, total is integer (int/int = int, not double and you'll lose the decimal value), so you need to cast one of the variables to double

        System.out.println("number array = "+Arrays.toString(numbers));
        System.out.println("sum of numbers in number array = " + sum);
        System.out.println("average = " + average);
            // number array = [1, 2, 3, 4, 5]
            //sum of numbers in number array = 15
            //average = 3.0

        //! 6. Use descimal format to specify the pattern (number of decimals)
            //!! call object of DecimalFormat
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("average = " + df.format(average));
            // number array = [1, 2, 3, 4, 5]
            //sum of numbers in number array = 15
            //average = 3.00


    } // main close


} // class close
/*
1. Ask the user how many numbers they want to enter
2. get all the inputs from the user and store them into an array
3. Iterate the array & return the average number
 */