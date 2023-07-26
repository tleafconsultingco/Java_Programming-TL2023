package day42_maps;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class Class02_UniqueCharacters {

    public static void main(String[] args) {

        String str = "aabcccdeeeef";

        //!! 1. Use LinkedHashMap to maintain insertion order
        Map<Character, Integer> map = new LinkedHashMap<>();

        //!! 2. To find frequency, convert the String to an Array using split() method
        //!! 3. Use For-each loop to iterate through the String
        for (String each : str.split("")) {
            //!! 4. Convert the new string Array to Collections and call the frequency() method
            //!! 4a. Pass the string Array and each element
            // str.split("") is the string array that contains the characters of the original String
            //!! 4b. Convert the Array to a Collection using Arrays.asList() method.
            //!! 5. Create an int variable and pass the Collection
            int frequency = Collections.frequency( Arrays.asList( str.split(""))  , each );
            //!! 6. Use if statement to only put the character in the map if its frequency is 1.
            if(frequency == 1)
                //!! 7. Use the charAt() method to call the single character from the iteration (since we are using Character as key and not String)
                //!! 8. Use put() method to pass each element as the key and its frequency as the value
                map.put(each.charAt(0), frequency);
        }

        System.out.println("map = " + map);
            //map = {b=1, d=1, f=1}
    }

}

/*
2. Write a program that can find the unique characters from a String
	              Not: MUST use map
	            Ex:
	                    str = "aabcccdeeeef";

	            output:
	                    {b=1, d=1, f=1}

 */
