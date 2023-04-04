package day23_arrayList;

import java.util.ArrayList;

public class Class02_FirstUniqueElement {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        //! 1. Add elements to ArrayList list
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(6);

        System.out.println("list = " + list); //list = [1, 1, 2, 3, 3, 4, 5, 5, 6]

        //! 2. Use For-Each loop to iterate the elements
        for (Integer element : list) {
            //!! 2a. Initialize a new variable frequency
            int frequency = 0;
            //! 3. Nested For-Each loop to iterate each
            for (Integer each : list) { // TODO not really sure about this step
                //! 4. Create If statement for checking each against the element
                if (each == element){
                    //!! 3a. Increase frequency by 1
                    frequency++;
                }//if statement close
            }//inner for-each loop close
            //? How can you determin if the element is unique?
            //! 5. Create If statement to print the first unique value
            if (frequency ==1) {
                System.out.println(element); //2
                //!! 5a. Make break statement to exit the loop after the first unique element is returned
                break;
            }//if statement close
        }//outer for-each loop close

        


    }//main close
}//class close
/*
Write a program that can return the first unique elements from an arraylist
			Ex:
				ArrayList = {1, 1, 2, 3, 3, 4, 5, 5, 6}
			output:
				2
 */