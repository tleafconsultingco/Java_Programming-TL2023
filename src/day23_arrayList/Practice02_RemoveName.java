package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice02_RemoveName {
    public static void main(String[] args) {

        //!! Create a new ArrayList and add elements
        ArrayList<String> names = new ArrayList<>(Arrays.asList("John", "Ahmed", "Daniel", "Ahmed", "James","Muhammed"));
        System.out.println("names = " + names); //names = [John, Ahmed, Daniel, Ahmed, James, Muhammed]

        //!! Use removeAll()
        names.removeAll(Arrays.asList("Ahmed"));
        System.out.println("names w/o Ahmed = " + names); //names w/o Ahmed = [John, Daniel, James, Muhammed]




    }//main close
}//class close
/*
Write a program that can remove all the names "Ahmed" from an
arraylist of String
"Muhammed"];
             ex:
    list = ["John", "Ahmed", "Daniel", "Ahmed", "James",
output:
     ["John", "Daniel", "James", "Muhammed"];
 */