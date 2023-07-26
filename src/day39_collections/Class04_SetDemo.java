package day39_collections;

import java.util.*;

public class Class04_SetDemo {

    public static void main(String[] args) {

        System.out.println("-- List --");
        List<Integer> list = new ArrayList<>(); //!! accepts duplicates, keeps insertion order, has index
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));

        System.out.println(list); //[10, 200, 300, 40, 90, 10, 200, 300, 40, 90, 10, 200, 300, 40, 90, 10, 200, 300, 40, 90]

        System.out.println("-- Set --");
        Set<Integer> set1 = new HashSet<>(); //!! no duplicates, order is random, accepts null key
        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set1.addAll(Arrays.asList(null, null, null, null, null));

        System.out.println(set1); //[null, 200, 40, 10, 90, 300]


        System.out.println("-- LinkedHashSet --");

        Set<Integer> set2 = new LinkedHashSet<>();  //!! keeps insertion order, accepts null key
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(null, null, null, null, null));

        System.out.println(set2); //[10, 200, 300, 40, 90, null]


        System.out.println("-- TreeSet --");

        String str = null;
        // System.out.println(str.toLowerCase());

        Set<Integer> set3 = new TreeSet<>(); //!! Keeps sorted order, does not accept duplicate, does not accept null
        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        // set3.addAll(Arrays.asList(null, null, null, null, null));

        System.out.println(set3); //[10, 40, 90, 200, 300]


        System.out.println("-- LinkedHashSet --");



        //? Convert Set to List

        //!! 1. Create a set using Set reference type and LinkedHashSet object type.
        String[] words = {"Java", "Java", "Java", "Python", "Python", "C#", "C++", "Ruby", "C#", "C#"};

        //!! 2. Add elements from an array using Arrays.asList() method.
        Set<String> result = new LinkedHashSet<>();
        result.addAll( Arrays.asList(words) );

        //!! When printed, this will return a linked hash set that maintains the insertion order of unique elements.
        System.out.println(result); //[Java, Python, C#, C++, Ruby]


        //!! 3.  Pass the LinkedHashSet object in the constructor of the ArrayList.
        //!! Now you’re able to use ArrayList methods.
        System.out.println("new ArrayList<>(result).get(1) = " + new ArrayList<>(result).get(1));
        // new ArrayList<>(result).get(1) = Python

        /*
        // System.out.println(result.get(1));

        for (String each : result) {
            System.out.println(each);
        }
        */


        //? Convert LinkedHashSet to Array
        words = result.toArray(new String[0]);  //!! converting Set to Array
        System.out.println("set converted to array = "+Arrays.toString(words));
        //set converted to array = [Java, Python, C#, C++, Ruby]



        //? Covert Set to Array

        //!! 1. Create array
        String[] stringWords = {"Java", "Java", "Java", "Python", "Python", "C#", "C++", "Ruby", "C#", "C#"};

        Set<String> stringSet = new LinkedHashSet<>();
        stringSet.addAll( Arrays.asList(stringWords) );
        System.out.println("stringSet = " + stringSet);
            //stringSet = [Java, Python, C#, C++, Ruby]
        stringWords = stringSet.toArray(new String[0]);  //!! converting Set to Array

        System.out.println("Words Array : " + Arrays.toString(stringWords)); // Words Array : [Java, Python, C#, C++, Ruby]


        System.out.println("----------------------------------------");

        //? Convert List to Set
        //!! 1. Create a list using List reference type and ArrayList object type.
        List<Integer> numbers = new ArrayList<>();

        //!! 2. Add elements using Array.asList().
        numbers.addAll(Arrays.asList(10, 10, 10, 20, 20, 30, 30, 30, 40, 40, 40, 50, 50, 50,5, 5, 5, 1, 1, 1, 2, 2,2));
        System.out.println("numbers = " + numbers);
        //numbers = [10, 10, 10, 20, 20, 30, 30, 30, 40, 40, 40, 50, 50, 50, 5, 5, 5, 1, 1, 1, 2, 2, 2]

        //!! 3. Create a set using Set reference type and TreeSet object type, pass the ArrayList object.
            // Recall that Set does not allow duplicates (all duplicate elements in the ArrayList will not be included in the new set).
        Set<Integer> n = new TreeSet<>(numbers);
        System.out.println("n = " + n);
            //n = [1, 2, 5, 10, 20, 30, 40, 50]



        // numbers = new ArrayList<>(n);



    }
}
