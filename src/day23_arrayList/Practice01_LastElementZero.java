package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Practice01_LastElementZero {
    public static void main(String[] args) {

        //!! Add elements using Arrays.asList()
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println("list = " + list); //list = [1, 2, 3, 4, 5]

        //!! Use set to change the element
        //!! list.size()-1 is the index of the last element
        list.set(list.size()-1,0);
        System.out.println("list = " + list); //list = [1, 2, 3, 4, 0]


    }//main close
}//class close
/*
write a program that can set the last element of the Integer
arraylist to zero
            ex:
                list = [1,2,3,4,5];
            output:
                 [1,2,3,4,0];
 */