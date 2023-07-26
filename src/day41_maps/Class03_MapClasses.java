package day41_maps;

import java.util.*;

public class Class03_MapClasses {

    public static void main(String[] args) {

        System.out.println("-- HashMap --");

        //!! random order, accept null key & null values
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Daniel", 95000);
        hashMap.put("Emily", 100000);
        hashMap.put("Bella", 85000);
        // using the same key -- this will replace the first key value, since it's duplicate key
        hashMap.put("Daniel", 80000);
        hashMap.put("Arron", 78000);
        hashMap.put("Chris", null);
        hashMap.put("Breanna", null);
        // Only the last of the null pairs will be printed, bc keys must be unique
        hashMap.put(null, 120000);
        hashMap.put(null, 110000);
        hashMap.put(null, 100000);

        System.out.println("hashMap = " + hashMap);
            //hashMap = {null=100000, Emily=100000, Breanna=null, Chris=null, Arron=78000, Daniel=80000, Bella=85000}

        System.out.println("-- LinkedHashMap --");

        //!! insertion order, accepts null key  & null values
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Daniel", 95000);
        linkedHashMap.put("Emily", 100000);
        linkedHashMap.put("Bella", 85000);
        // using the same key -- this will replace the first key value, since it's duplicate key
        linkedHashMap.put("Daniel", 80000);
        linkedHashMap.put("Arron", 78000);
        linkedHashMap.put("Chris", null);
        linkedHashMap.put("Breanna", null);
        // Only the last of the null pairs will be printed, bc keys must be unique
        linkedHashMap.put(null, 120000);
        linkedHashMap.put(null, 110000);
        linkedHashMap.put(null, 100000);

        System.out.println("linkedHashMap = " + linkedHashMap);
            //linkedHashMap = {Daniel=95000, Emily=100000, Bella=85000, Arron=78000, Chris=null, Breanna=null, null=100000}


        System.out.println("-- TreeMap --");

        //!! sorted order, does not accept null key, accepts null values
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Daniel", 95000);
        treeMap.put("Emily", 100000);
        treeMap.put("Bella", 85000);
        // using the same key -- this will replace the first key value, since it's duplicate key
        treeMap.put("Daniel", 80000);
        treeMap.put("Arron", 78000);
        // only value can be null in treeMap
        treeMap.put("Chris", null);
        treeMap.put("Breanna", null);
        // key can not be null in treeMap
            //treeMap.put(null, 120000);
            //treeMap.put(null, 110000);
            //treeMap.put(null, 100000);

        System.out.println("treeMap = " + treeMap);
            //treeMap = {Arron=78000, Bella=85000, Breanna=null, Chris=null, Daniel=95000, Emily=100000}


        System.out.println("-- HashTable --");

        //!! random order, does not accept null key & null values, Synchronized
        Map<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("Daniel", 95000);
        hashtable.put("Emily", 100000);
        hashtable.put("Bella", 85000);
        // using the same key -- this will replace the first key value, since it's duplicate key
        hashtable.put("Daniel", 80000);
        hashtable.put("Arron", 78000);
        // Value in Hashtable can not be null
            //hashtable.put("Chris", null);
            //hashtable.put("Breanna", null);
        // Key in Hashtable can not be null
            //hashtable.put(null, 120000);
            //hashtable.put(null, 110000);
            //hashtable.put(null, 100000);

        System.out.println("hashtable = " + hashtable);
            //hashtable = {Arron=78000, Daniel=80000, Emily=100000, Bella=85000}

        //!! use try-catch to avoid breaking the code
        try {
            hashtable.put(null, 100000);
        }catch (RuntimeException e){
            e.printStackTrace();
        }

        System.out.println("hashtable = " + hashtable);
            //hashtable = {Arron=78000, Daniel=80000, Emily=100000, Bella=85000}

        try {
            hashtable.put("Diana", 100000);
        }catch (RuntimeException e){
            e.printStackTrace();
        }

        System.out.println("hashtable = " + hashtable);
            //hashtable = {Arron=78000, Daniel=80000, Diana=100000, Emily=100000, Bella=85000}





    }

}
