package day19_array;

import java.util.Arrays;

public class Class08_Alphabets {
    public static void main(String[] args) {

        //! 1. Create array using new keyword and loop
        char[] alphabetAscend = new char[26]; // index 0-25
        char[] alphabetDescend = new char[26]; // index 0-25
        //!! 1a. You can use one loop for ascending and descending since the index numbers are the same
        for (int i = 0, j = 'A', k = 'Z'; i < alphabetAscend.length; i++, j++, k--) {
            //!! 1b. Declare another variable j, assign 'A' and post increment
            //!! 1c. Declare another variable k, assign 'Z' and post decrement
            alphabetAscend[i] = (char)j;
            //?? 2. Ascending. For each index of char array we need to assign j, but j is an int and needs to be explicitly cast to char
            alphabetDescend[i] = (char)k;
            //?? 3. Descending. For each index of char array we need to assign k, but k is an int and needs to be explicitly case to char
        }

        System.out.println(Arrays.toString(alphabetAscend));
            // [A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z]
        System.out.println(Arrays.toString(alphabetDescend));
            // [Z, Y, X, W, V, U, T, S, R, Q, P, O, N, M, L, K, J, I, H, G, F, E, D, C, B, A]


        System.out.println("-------------");
        //! 4. Create char array to store all characters
        char[] characters = new char[65535]; //!! total number of char is 65535

        for (int i = 0; i < characters.length; i++) {
            characters[i] = (char)i;
        }

        System.out.println(characters);


    } // main close
} // class close
/*
Create a char array and store all the alphabet letters in ascending order
Create a char array and store all the alphabet letters in descending order
 */