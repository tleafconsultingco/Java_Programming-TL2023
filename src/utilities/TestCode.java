package utilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestCode {
    public static void main(String[] args) {

        String str = "Mississippi";

        String result = "";

        // 1. Convert String object to String Array
        // 2. Iterate String Array and with For-each loop to get all the elements
        // 3. Within the loop, use frequency() Collections utility method
        // 3a. Convert String Array to Collection type
        // 4. If statement to add the character and its frequency into variable result

        //? Can we convert String object to String Array and then to Collection type before applying For-each loop?
        //TODO



        //! This code doesn't work...
        /*
        String[] str2 = new String[str.length()];
        System.out.println(Arrays.toString(str2));

        for(String each: str2){
            int frequency = Collections.frequency(Arrays.asList(str2),each);
            if(!result.contains(each)){
                result += each+frequency;
            }
        }

        System.out.println(result);
/*


        /*
        for (String each : str.split("")) {
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);
            if(!result.contains(each)){
                result += each+frequency;
            }//if statement
        }//for-each

        System.out.println("result = " + result); //result = M1i4s4p2
*/

        //? ArrayList to Array using toArray() ArrayList method

        ArrayList<String> languages= new ArrayList<>();

        //!! Add elements in the ArrayList
        languages.add("Java");
        languages.add("Python");
        languages.add("C");
        System.out.println("ArrayList: " + languages);
            //ArrayList: [Java, Python, C]

        //!! Create a new Array of String type
        //!! Size of Array is same as the ArrayList
        String[] arr = new String[languages.size()];

        //!! Convert ArrayList into an Array
        languages.toArray(arr);
        System.out.println("arr = " + Arrays.toString(arr));
            //arr = [Java, Python, C]
        

    }//main close
}//class close
