package day21_multiDimensionalArray;

import java.util.Arrays;

public class Class02_Anagram {
    public static void main(String[] args) {
        String str1 = "heart",
                str2 = "earth",
                str3 = "java",
                str4 = "python";


        // 1. Convert to arrays -- 2 ways

        // 1a. Use toCharArray()
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
            //[e, a, r, t, h]

        // 1b.. Use sort() to get them in the same order
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr1));
            //[a, e, h, r, t]
        System.out.println(Arrays.toString(arr2));
            //[a, e, h, r, t]

        // 1c. Use equals() to see if arr1 and arr2 are anagrams
        boolean anagramArr1Arr2 = Arrays.equals(arr1, arr2);
        System.out.println(anagramArr1Arr2);
            //true

        // 2a. Use split()
        String[] arr3 = str3.split(""); // keep the string empty
        String[] arr4 = str4.split("");

        // 2b.
        Arrays.sort(arr3);
        Arrays.sort(arr4);

        // 2c.
        boolean anagramArr3Arr4 = Arrays.equals(arr3,arr4);
        System.out.println(anagramArr3Arr4);
            //false






    }//main close
}//class close
/*
Write a  function that check if a string is build out of
the same letters as another string. (Anagram Task)
            Ex: str1 = "heart"
                 str2 = "earth"
output: true
                 str1 = "java"
                 str2 = "python"
                 output:
                         false
        listen  sildent
 */