package day18_garbageCollection;

import day17_customClass.Class05_Dog;

public class Class06_GarbageCollection {

    public static void main(String[] args) {

        // NULL THE REFERENCE
        // 1. Create new string
        
        String s1 = "Java";
        System.out.println("s1 = " + s1); // Java
        
        // 2. Assign s1 the value of null
        
        s1=null; // "Java" value will be eligible for garbage collection. From this point on s1 will return "null", not it's originally assigned value
        System.out.println("s1 = " + s1); // null
        
        
        System.out.println("----------");
        // ASSIGN REFERENCE TO ANOTHER
        // 1. Create a new string

        String str1 = "Python";
        //     stack   heap
        System.out.println("str1 = " + str1);

        // 2. Reassign str1
        str1 = "CYDEO"; // the string object Python is now eligible for garbage collection
        System.out.println("str1 = " + str1);

      
        // 3. Create objects
        Class05_Dog dog3 = new Class05_Dog();
        dog3.setInfo("Bella","Golden Retriever", "Small", 'F',5,"Blonde");

        System.out.println(dog3);
        
        Class05_Dog dog4 = new Class05_Dog();
        dog4.setInfo("JJ","Pitt","Medium",'F',8,"Black");

        System.out.println(dog4);
        
        // 3a. The two objects above are separate and their values are separate
        // 3b. To make a dog object eligible for garbage collection
        dog3 = dog4;
        System.out.println("dog3 = " + dog3);
        System.out.println("dog4 = " + dog4);




    } // main close


} // class close
