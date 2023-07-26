package day42_maps;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class Class01_FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "bbcccaaaaa";

        //!! 1. Use LinkedHashMap to maintain insertion order
        Map<String, Integer> map = new LinkedHashMap<>();

        //!! 2. To find frequency, convert the String to an Array using split() method
        //!! 3. Use For-each loop to iterate through the String
        for (String each : str.split("")) {
            //!! 4. Convert the new string Array to Collections and call the frequency() method
            //!! 4a. Pass the string Array and each element
            // str.split("") is the string array that contains the characters of the original String
            //!! 4b. Convert the Array to a Collection using Arrays.asList() method.
            //!! 5. Create an int variable and pass the Collection
            int frequency = Collections.frequency( Arrays.asList( str.split(""))  , each );

            //System.out.println(each+" : "+frequency);
                //b : 2
                //b : 2
                //c : 3
                //c : 3
                //c : 3
                //a : 5
                //a : 5
                //a : 5
                //a : 5
                //a : 5


            //!! 6. Use put() method to pass each element as the key and its frequency as the value
            map.put(each, frequency);
        }
        System.out.println("map = " + map);
        //map = {b=2, c=3, a=5}



    }


}

/*
1. Write a program that can return the frequency of characters
            Not: MUST use map

                Ex: str = "bbcccaaaaa"

                output:
                    {b=2, c=3, a=5}
 */
