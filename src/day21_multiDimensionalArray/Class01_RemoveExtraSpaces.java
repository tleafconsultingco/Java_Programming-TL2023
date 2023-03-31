package day21_multiDimensionalArray;

import java.util.Arrays;

public class Class01_RemoveExtraSpaces {
    public static void main(String[] args) {

        String str = "  Hello world      I      love      Java    ";

        //! 1. Use trim to remove blanks before and after str, assign it as the updated value of str
        str = str.trim(); // !!Not entirely necessary
        //! 2. Convert string to array using split() at every space
        String[] phrase = str.split(" ");
        System.out.println(Arrays.toString(phrase));
            //[Hello, world, , , , , , I, , , , , , love, , , , , , Java]

        str = ""; //! 3. Reassign str to be empty

        //! 3. Apply for-each loop
        for (String each : phrase) {
            //!! 3a. Check which element is not empty by using isEmpty
            if (!each.isEmpty()){ //!! 3b. Place the not operator in front of the statement
                //!! 3c. Concatenate to str (which is currently empty), include the space afterwards
                str += each+" ";
            }
        }


        // 4. Print with the string statement
                System.out.println(str.trim());
        //!! 4 alt. Adjust the final output to remove the extra space at the end
        str = str.trim();
        System.out.println(str);
            //Hello world I love Java


    }//main close
}//class close
/*
Write a program that can remove all the extra space from
string love
Ex:
Java "
Output:
        Hello world I love Java
 */
