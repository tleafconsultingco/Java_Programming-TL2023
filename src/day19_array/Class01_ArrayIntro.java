package day19_array;

import java.util.Arrays;

public class Class01_ArrayIntro {
    public static void main(String[] args) {

        // suppose you have 5 classes that you want to store the scores for

        // Old way -- create 5 separate variables
        int score1 = 50; // you cannot store more than one value in this variable
        int score2 = 60;
        int score3 = 70;
        int score4 = 80;
        int score5 = 90;

        System.out.println("------USING ARRAY------");

        // 1. Instantiate new array
        int[] scores = new int[5]; // this means we have 5 elements
        // index is 0 - 4 ...remember length()-1 to find last index number


        // 2. import arrays utility class
        System.out.println("scores = " + scores); // hashcode [I@59a6e353
        // 2a. Print array using toString() from Array utilities class
        System.out.println(Arrays.toString(scores)); // [0, 0, 0, 0, 0]

        // 3. You can assign new data to the array elements
        scores[2] = 71; // this takes the element from index 2 and changes its value
        scores[0] = 51;
        scores[1] = 61;
        scores[3] = 81;
        scores[4] = 91;
        System.out.println(Arrays.toString(scores));

        // 4. Reassinging array objects
        // scores = new int[10]; // index: 0-9
        // scores = new int[50]; // index: 0-49
        // 4a. The original scores array, and the scores = new int[10] will be deleted

        // 5. How do you access the value for a specific element? For example, I want the score from index 2
        System.out.println(scores[2]);

        // 6. What if I want to print all scores one at a time? Use a For loop

        for (int i = 0; i < 5; i++) {
            System.out.println(scores[i]);
            /*
            71
            51
            61
            71
            81
            91
             */

        }

        System.out.println("------");


        // General For loop expression for printing every element in an array:
        for (int i = 0; i < scores.length; i++) {
            // length is an instance variable that returns the total number of elements contained in the array.
            // this length is different from the length() method.
            // length is unchangeable.
            System.out.println(scores[i]);
                /*
                71
                51
                61
                71
                81
                91
                 */
        }

        int[] newArray = new int[10];
            // To return the value for the last element in an array:
            System.out.println(newArray[newArray.length-1]);


    } // main close
} // class close
