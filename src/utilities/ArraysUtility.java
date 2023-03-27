package utilities;

import java.util.Arrays;

public class ArraysUtility {

    // Merging two arrays into a 3rd array -- int
    public static int[] merge(int[] arr1, int[] arr2) {

        // 1. You need the third array to be the size of first and second array combined
        // 1a. Use new keyword with the size equal to length of arr1 plus length of arr2
        int[] arr3 = new int[(arr1.length + arr2.length)];

        // 2. Start merge...but the arrays are different lengths
        // 2a. You need to create a For loop that uses different variables to represent the different arrays
        int k = 0; // 2b. Declare a new variable to be the index variables of arr3 to use during the loops of arr1 and arr2
        // 2c. Iterate each of the arrays one at a time

        // 3. Iterate first array
        for (int i = 0; i < arr1.length; i++, k++) { // 3a. i is for arr1 index numbers
            // 3b. increase k iterator to account for adding to arr3 to track elements of arr3 since arr3 needs to include elements of arr2 after getting elements of arr1
            arr3[k] = arr1[i]; // use k to track indexes of arr3
        } // this loop will get all elements of arr1 into arr3

        // 4. Iterate second array
        for (int i = 0; i < arr2.length; i++, k++) { // 5a. i is for arr1 index numbers
            arr3[k] = arr2[i];
        } // this loop will get all elements of arr2 into arr3 (which already contains elements of arr1)

        // 5. Return arr3
        return arr3;
    }

    // Merging two arrays into a 3rd array -- double
    public static double[] merge(double[] arr1, double[] arr2) {

        double[] arr3 = new double[arr1.length + arr2.length]; // to make sure that 3rd array has enough capacity to contain all the elements of arr1 and arr2

        int k = 0; // for third array's index number

        for (int i = 0; i < arr1.length; i++, k++) { //i: for first array's index numbers
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) { //i: for second array's index numbers
            arr3[k] = arr2[i];
        }

        return arr3;
    }

    // Merging two arrays into a 3rd array -- char
    public static char[] merge(char[] arr1, char[] arr2) {

        char[] arr3 = new char[arr1.length + arr2.length]; // to make sure that 3rd array has enough capacity to contain all the elements of arr1 and arr2

        int k = 0; // for third array's index number

        for (int i = 0; i < arr1.length; i++, k++) { //i: for first array's index numbers
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) { //i: for second array's index numbers
            arr3[k] = arr2[i];
        }

        return arr3;
    }

    // Merging two arrays into a 3rd array -- string
    public static String[] merge(String[] arr1, String[] arr2) {

        String[] arr3 = new String[arr1.length + arr2.length]; // to make sure that 3rd array has enough capacity to contain all the elements of arr1 and arr2

        int k = 0; // for third array's index number

        for (int i = 0; i < arr1.length; i++, k++) { //i: for first array's index numbers
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) { //i: for second array's index numbers
            arr3[k] = arr2[i];
        }

        return arr3;
    }

    // Reverses array -- int
    public static int[] reverse(int[] array) {

        int[] reverse = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--) {
            reverse[j++] = array[i];
        }

        return reverse;
    }

    // Reverses array -- double
    public static double[] reverse(double[] array) {

        double[] reverse = new double[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--) {
            reverse[j++] = array[i];
        }

        return reverse;
    }

    // Reverses array -- char
    public static char[] reverse(char[] array) {

        char[] reverse = new char[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--) {
            reverse[j++] = array[i];
        }

        return reverse;
    }

    // Reverses array -- string
    public static String[] reverse(String[] array) {

        String[] reverse = new String[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--) {
            reverse[j++] = array[i];
        }

        return reverse;
    }


    public static int[] addElement(int[] array, int element) {
        int[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element;
        return new_array;
    }


    public static double[] addElement(double[] array, double element) {
        double[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element;
        return new_array;
    }


    public static char[] addElement(char[] array, char element) {
        char[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element;
        return new_array;
    }


    public static String[] addElement(String[] array, String element) {
        String[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element;
        return new_array;
    }


    //{1,2,3,4},   1
    public static boolean contains(int[] array, int element) {

        for (int each : array) {
            if (each == element) {
                return true;
            }
        }

        return false;
    }


    public static boolean contains(double[] array, double element) {

        for (double each : array) {
            if (each == element) {
                return true;
            }
        }

        return false;
    }


    public static boolean contains(char[] array, char element) {

        for (char each : array) {
            if (each == element) {
                return true;
            }
        }

        return false;
    }


    public static boolean contains(String[] array, String element) {

        for (String each : array) {
            if (each.equals(element)) {
                return true;
            }
        }

        return false;
    }





    /*
    // array = { 10, 20, 30, 40} , 2  ===> {10, 20, 40}
    public static int[] remove(int[] array, int index){
    }
    public static int[] removeDup(int[] array){
    }
*/

} // class close
