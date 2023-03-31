package day20_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Class04_StringMethods {
    public static void main(String[] args) {
        // toCharArray()
        String str = "Cydeo School";

        //! If you want to get every character and store them into a data structure from the string

        //!! 1. Use toCharArray()
        char[] ch = str.toCharArray();

        // 1a. Print
        System.out.println(Arrays.toString(ch)); //!! at each index we'll have the charaters of the string
            //[C, y, d, e, o,  , S, c, h, o, o, l]

        //? 2. What if I don't want to include the spaces in the index?
        //!! 3. Use replace() method

        char [] chNoSpace = str.replace(" ","").toCharArray(); //!! 3a. replace blank space with empty string
        System.out.println(Arrays.toString(chNoSpace));
            //[C, y, d, e, o, S, c, h, o, o, l]

        System.out.println("--------"); // split()

        String str2 = "Today is a great day to learn Java";

        //! I want to create an array out of this string by getting every word out of this string

        //!! 1. Split every word at space and assign to string array
        String[] words = str2.split(" "); // returns an array that splits the sentence by space, total 7 spaces for 8 words

        System.out.println(Arrays.toString(words)); //[Today, is, a, great, day, to, learn, Java]

        // What if I split by the word "great"?
        String[] wordsSplitGreat = str2.split("great");
        System.out.println(Arrays.toString(wordsSplitGreat)); // two arrays
            //[Today is a ,  day to learn Java]

        //? What if I split using a word that does not exist in the string?
        String[] splitPython = str2.split("Python"); // this word is not in our string
        System.out.println(Arrays.toString(splitPython)); // you will return 1 array, the original
            //[Today is a great day to learn Java]


        System.out.println("-------------");
        //! Reverse the sentence, not the text

        String sentence = "I love Java";

        //! 1. Split this sentence and put in a new array
        String[] sentenceSplit = sentence.split(" ");
        System.out.println(Arrays.toString(sentenceSplit));
            //[I, love, Java]

        //! 2. Reverse the array using the custom method
        String[] arrayReverse = ArraysUtility.reverse(sentence.split(" "));
        System.out.println(Arrays.toString(arrayReverse));
            //[Java, love, I]

        //! 3. Create new string with reversed array by concatenating each element in the array to the string variable using a For loop
        String sentenceReverse = "";

        //! 3a. For loop
        for (int i = 0; i < arrayReverse.length; i++) {
            sentenceReverse += arrayReverse[i]+" "; //!! remember to include a string for spaces in between words
        }
        System.out.println(sentenceReverse);
            //Java love I




    } // main close
} // class close
