package day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Class03_CollectionsUtilityMethods {
    public static void main(String[] args) {

        System.out.println("--------- replaceAll() ---------");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java", "Java", "Java", "C#", "C#", "Ruby", "Swift", "Swift", "Java"));
        System.out.println(names); //[Java, Java, Java, C#, C#, Ruby, Swift, Swift, Java]

        //? Replace all Java with Python, use For-loop NOT BEST PRACTICE
        /*
        for (int i = 0; i < names.size(); i++) {
            if(names.get(i).equals("Java")){ // get all elements that are Java
                names.set(i, "Python"); // replace with Python
            }//if statement close
        }//for loop close
        */

        //! Instead, use replaceALL Collections utility class method
        Collections.replaceAll(names, "Java", "Python");
            //!! Pass ArrayList, old value, and new value
        System.out.println(names); //[Python, Python, Python, C#, C#, Ruby, Swift, Swift, Python]


        System.out.println("-- frequency() with Integer --");
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 20, 20, 30, 40, 40, 50, 50, 50, 50, 50, 60, 60, 50, 50, 50));

        int count = Collections.frequency(list, 50);
            //!! Pass ArrayList and element

        System.out.println("count = " + count); //count = 8

        System.out.println("-- frequency() with String --");
        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Java", "Java", "Java", "C#", "C#", "Ruby", "Swift", "Swift", "Java"));

        int countJava = Collections.frequency(words, "Java");

        System.out.println("countJava = " + countJava); //countJava = 4

        System.out.println("-- frequency() inside a loop --");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10, 20, 20, 30, 40, 40, 50, 50, 50, 50, 50, 60, 60, 50, 50, 50));

        //? Find unique element of the ArrayList
        //! Use For-Each loop
        for (Integer each : numbers) {
            //!! Use if statement
            if( Collections.frequency(numbers, each)  == 1 ){ //!! If frequency is equal to 1...
                System.out.println(each); //!! ...then print
            }//if statement close
        }//for each loop
        //-- Without using frequency() method you would need to use a Nested loop







    }//main close
}//class close
