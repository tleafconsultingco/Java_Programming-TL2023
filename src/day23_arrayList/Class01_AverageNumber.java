package day23_arrayList;
import java.util.ArrayList;
public class Class01_AverageNumber {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        //!! This array has no elements

        //! Add elements using add()
        list.add(20); //!! Even though we pass an int, it will implicitly autobox the primitive to the wrapper class object
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);

        System.out.println("list = " + list);
            //list = [20, 30, 40, 50, 60, 70]

        //! 1. Create variable sum with default value 0
        int sum = 0;

        //! 2. Iterate the elements with For-Each loop
        for (Integer element : list) {
            //!! 2a. Add each element to sum
            sum += element;
        }//close For-Each loop

        //! 3. Initialize new double variable average
        double average = sum / (double)list.size();
            //!! sum is an int, size is for Integer, you need to cast one of them to double

        System.out.println("average = " + average); //average = 45.0

    }//main close
}//class close
/*
Write a program that can find the average number from an arrayList of integers
 */