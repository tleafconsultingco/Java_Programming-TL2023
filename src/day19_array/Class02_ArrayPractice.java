package day19_array;
import java.util.Arrays;
public class Class02_ArrayPractice {
    public static void main(String[] args) {
        // Create an array with 5 names

        String[] myGroup = new String[5];

        // 1. Initialize elements for first and last person
        myGroup[0] = "First person";
        myGroup[myGroup.length-1] = "Last person";

        // 1a. Print
        System.out.println(Arrays.toString(myGroup));
            // [First person, null, null, null, Last person]

        // 2a. Initialize element for 3rd person
        myGroup[2] = "Third person";
        System.out.println(Arrays.toString(myGroup));
            // [First person, null, Third person, null, Last person]

        // 3. Assign values for the other elements
        myGroup[1] = "Second person";
        myGroup[3] = "Fourth person";

        System.out.println(Arrays.toString(myGroup));
            // [First person, Second person, Third person, Fourth person, Last person]

        // 4. Update an element
        myGroup[1] = "ABC";
        System.out.println(Arrays.toString(myGroup));
            // [First person, ABC, Third person, Fourth person, Last person]

        // 5. What if we add another element, even though it's outside of/greater than the array size?
        // myGroup[5] = "Additional person";
        // System.out.println(Arrays.toString(myGroup));
            // out of bounds error

        // 6. Print the elements starting from last to first. Use a For loop.
        for (int i = myGroup.length-1; i >= 0; i--) {
            // Initialization starts at last index...which is length-1
            // Condition has to be greater or equal to index 0
            // Iterator must decrease by one after every iteration
            System.out.println(myGroup[i]);
                /*
                Last person
                Fourth person
                Third person
                ABC
                First person
                 */
        }

        String[] newArray = new String[5];

        // Iterate the array starting from beginning index to last -- For loop SHORT CUT
            // newArray.fori + Enter
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
        // Iterate the array starting from last index to beginning (reverse) -- For loop SHORT CUT
            // newArray.forr + Enter
        for (int i = newArray.length - 1; i >= 0; i--) {
            System.out.println(newArray[i]);
        }




    } // main close


} // class close
