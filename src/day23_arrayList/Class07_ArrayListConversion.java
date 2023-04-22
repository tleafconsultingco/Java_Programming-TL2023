package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Class07_ArrayListConversion {
    public static void main(String[] args) {

        System.out.println("----------- non-primitive arrays --------------");
        //- Non-primitive Arrays, like String, can be easily converted to ArrayList using constructor

        String[] arr = {"A", "B", "C", "D"};
        //@@ Array is not a collection, so you need to call asList() constructor from Arrays utility methods
        ArrayList<String> alphabet = new ArrayList<>( Arrays.asList(arr) );

        System.out.println("alphabet = " + alphabet); //alphabet = [A, B, C, D]


        System.out.println("------------ ArrayList convert to Array -----------");

        //- ArrayList to Array, 2 methods
        //-- Advantages of Array are that it supports primitives and can be multidimensional

        //! 1.
        ArrayList<String> list2 = new ArrayList<>( Arrays.asList("Java", "Python", "C#") );

        //!! Requires the toArray() method and the size
        String[] languages = list2.toArray(new String[0]);
            //?? Pass the minimum size of the new Array, best is 0
            //?? If the size of the ArrayList is less than specified size of the new array then it will create a new array that can contain the size of the Array
        System.out.println(Arrays.toString(languages)); //[Java, Python, C#]

        //! 2.
        ArrayList<String> colorArrayList = new ArrayList<>( Arrays.asList("Red", "Orange", "Yellow") );

        //!! Requires the toArray() method and the size of the ArrayList
        String[] colorArray = colorArrayList.toArray(new String[colorArrayList.size()]);
            //?? Pass the size of the colorArray to the size of the colorArrayList using size()
        System.out.println("colorArray = " + Arrays.asList(colorArray));
            //colorArray = [Red, Orange, Yellow]
        
       

        System.out.println("----------- Integer ArrayList convert to Array  ----------------");

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

        //!! Set Array to the Wrapper class (int to Integer)
        Integer[] n = nums.toArray(new Integer[0]);
            // ?? The primitive will not work
                // int[] n = nums.toArray(new Integer[0]);
        System.out.println(Arrays.toString(n)); //[1, 2, 3, 4, 5, 6, 7]


    }//main close
}//class close
