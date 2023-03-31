package day19_array;
import java.util.Arrays;
public class Class05_ArrayObjects {
    public static void main(String[] args) {

        // 1. New array object
        int[] array1 = {10,20,30,40,50}; // size is 5, index 1-4
            //! this object is in the heap memory

        // 2. Create other arrays
        int[] array2 = array1;
        int[] array3 = array2;

        //? 3. HOW MANY ARRAY OBJECTS ARE ALLOCATED IN THE HEAP?
            // Just 1

        //? 3a. HOW MANY VARIABLES IN THE STACK ARE REFERENCING TO THE OBJECT?
            // 3

        System.out.println("array1 = " + Arrays.toString(array1));
        System.out.println("array2 = " + Arrays.toString(array2));
        System.out.println("array3 = " + Arrays.toString(array3));

            // array1 = [10, 20, 30, 40, 50]
            // array2 = [10, 20, 30, 40, 50]
            // array3 = [10, 20, 30, 40, 50]

        //? 4. What if I change the first element of array1?
        array1[0] = 1000;
            //?? all arrays 1-3 will return the same output bc they all reference the SAME object
        System.out.println("array1 = " + Arrays.toString(array1));
        System.out.println("array2 = " + Arrays.toString(array2));
        System.out.println("array3 = " + Arrays.toString(array3));
            // array1 = [1000, 20, 30, 40, 50]
            // array2 = [1000, 20, 30, 40, 50]
            // array3 = [1000, 20, 30, 40, 50]

        //? 5. What if I change the third element of array2?
        array2[2] = 3000;
            //?? all arrays 1-3 will return the same output bc they all reference the SAME object
        System.out.println("array1 = " + Arrays.toString(array1));
        System.out.println("array2 = " + Arrays.toString(array2));
        System.out.println("array3 = " + Arrays.toString(array3));
            // array1 = [1000, 20, 3000, 40, 50]
            // array2 = [1000, 20, 3000, 40, 50]
            // array3 = [1000, 20, 3000, 40, 50]

        //? 6. Can multiple objects be referenced by one variable? No.
        String[] a1 = {"ABC","DEF"}; //?? 6d. this object will be eligible for garbage collection
        a1 = new String[]{"123", "456"}; //?? 6a. this will reassign the variable
        System.out.println(Arrays.toString(a1));
            //[123, 456]


    } // main close
} // class close
