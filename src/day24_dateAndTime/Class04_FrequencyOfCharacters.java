package day24_dateAndTime;

import java.util.Arrays;
import java.util.Collections;

public class Class04_FrequencyOfCharacters {
    public static void main(String[] args) {

        //- To get frequency of character we need each character and its frequency

        //? frequency() can only be applied to Collections, not String objects
            //?? Create an Array from the String, then convert the new String Array to Collection type

        String str = "aaabbbbccccc";

        //- 1. Create a variable to contain the result
        String result = "";    //a3b4c5

        //- 2. Use for-each loop to iterate the String Array
        for (String each : str.split("")) {
            //!! Use split() String method to convert str (String object) to a String Array
                //@@ If it's a String array it can be converted to a Collection type

            //- 3. Use the frequency() Collections utility method
            int frequency = Collections.frequency(  Arrays.asList( str.split("") )   , each );
            //!! Convert the String Array to a Collection
            //!! Use asList() Array utility method to convert the String Array into a Collection type
            //!! Apply the frequency() method by passing the newly created Collection type followed by the element

            //- 4. Use If statement to return the character and its frequency
            if(!result.contains(each)){
                //!! Use the contains() ArraysList method to only include an element if it is NOT already contained in the String result, and then add its frequency
                result += each + frequency;
            }//if statement close
        }//for-each close

        System.out.println("result = " + result); //result = a3b4c5


    }//main close
}//class close
