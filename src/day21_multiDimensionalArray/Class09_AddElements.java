package day21_multiDimensionalArray;

import java.util.Arrays;
import utilities.ArraysUtility;

public class Class09_AddElements {
    public static void main(String[] args) {

        //- Create a function that takes 1 array of integer and takes another argument of integer (one integer array and one integer, should add the element into the integer)

        //!! Given 1D array
        int[] array = {1,2,3,4,5};
        //!! Add another element to the array
        int element = 6;

        //?? Expected result: {1, 2, 3, 4, 5, 6}, but not possible since the array was already created with the size 5.
            //!! You will need a NEW array, with size of given array + extra element

        //! 1. Create new array to combine given array with the added element
        // int[] newArray = new int[array.length+1];
        //!! 1a. In order to copy all the elements of array, use copyOf() method
        int [] newArray = Arrays.copyOf(array,array.length+1); //!! new array length is array.length+1 bc you need to account for the element you will add
        System.out.println("newArray: "+Arrays.toString(newArray));
            //newArray: [1, 2, 3, 4, 5, 0]
        //? How do you ensure that at the last index you can add the element to the end?
            //?? 1b. Assign it
        newArray[newArray.length-1] = element;

        System.out.println("newArray: "+Arrays.toString(newArray));
            //newArray: [1, 2, 3, 4, 5, 6]


        System.out.println("------ use addElements method ------");
        int[] numbers = { 100, 90, 80, 70, 60};

        System.out.println("numbers: "+Arrays.toString(numbers));
            //numbers: [100, 90, 80, 70, 60]
        //! Call addElements custom methods
            //!! Takes one int array and one int element
        numbers = ArraysUtility.addElement(numbers, 50);
            //!! This custom method doesn't change the size of the current array numbers, instead it creates a new array
            //!! In order to get the new array just reassign it the previous array.
                //?? This makes the previous array name numbers no longer reference the given array, it will reference the newly created array that includes the added element

        System.out.println("numbers: "+Arrays.toString(numbers));
            //numbers: [100, 90, 80, 70, 60, 50]

        System.out.println("----- addElements method for doubles ------");
        double[] nums = {1.5, 2.5, 3.5, 4.5};

        nums = ArraysUtility.addElement(nums, 5.5);
        System.out.println("nums: "+Arrays.toString(nums));
            //nums: [1.5, 2.5, 3.5, 4.5, 5.5]

        nums = ArraysUtility.addElement(nums, 6.5);
        System.out.println("nums: "+Arrays.toString(nums));
            //nums: [1.5, 2.5, 3.5, 4.5, 5.5, 6.5]

        nums = ArraysUtility.addElement(nums, 7.5);
        System.out.println("nums: "+Arrays.toString(nums));
            //nums: [1.5, 2.5, 3.5, 4.5, 5.5, 6.5, 7.5]


        System.out.println("----- addElements method for String ------");
        String[] students = {"Yasin", "Sumeye", "Ermek"};
        System.out.println("students: "+Arrays.toString(students));
            //students: [Yasin, Sumeye, Ermek]
        students = ArraysUtility.addElement(students, "Umran");
        System.out.println("students: "+Arrays.toString(students));
            //students: [Yasin, Sumeye, Ermek, Umran]
        students = ArraysUtility.addElement(students, "Abidullah");
        System.out.println("students: "+Arrays.toString(students));
            //students: [Yasin, Sumeye, Ermek, Umran, Abidullah]
        students = ArraysUtility.addElement(students, "Muhtar");
        System.out.println("students: "+Arrays.toString(students));
            //students: [Yasin, Sumeye, Ermek, Umran, Abidullah, Muhtar]


    }//main close
}//class close
