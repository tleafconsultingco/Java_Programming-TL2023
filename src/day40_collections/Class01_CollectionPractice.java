package day40_collections;

import java.util.*;

public class Class01_CollectionPractice {



    public static void main(String[] args) {

        //!! Polymorphism allows us to create objects with Collection reference type and different types of collection object type
        Collection<Integer> collection = new ArrayList<>();
        Collection<Integer> collection_2 = new LinkedList<>();
        Collection<Integer> collection_3 = new Vector<>();
        Collection<Integer> collection_4 = new Stack<>();
        Collection<Integer> collection_5 = new HashSet<>();
        Collection<Integer> collection_6 = new LinkedHashSet<>();
        Collection<Integer> collection_7 = new TreeSet<>();

        //!! Collection has add() and addAll() methods that all types of collection can use
        collection.add(100);
        collection.addAll(Arrays.asList(100, 200, 100, 200, 300, 400, 500, 600, 700));

        System.out.println("collection = " + collection);
            //collection = [100, 100, 200, 100, 200, 300, 400, 500, 600, 700]

        //!! Downcast to use get() method from ArrayList
        System.out.println("(ArrayList)collection.get(2) = " + ((ArrayList) collection).get(2));
            //(ArrayList)collection.get(2) = 200

        //!! Polymorphism does not allow casting without IS-A relationship. We cannot call methods of Stack bc the object type is ArrayList
        // System.out.println( ( (Stack)collection).pop() );


        System.out.println("-------------------------------------------------");

        //? Convert Set to List
        Collection<Integer> collection2 = new HashSet<>();
        collection2.addAll(Arrays.asList(100, 200, 100, 200, 300, 400, 500, 600, 700, 100, 100, 100));

        System.out.println("collection2 = " + collection2);
            //collection2 = [400, 100, 500, 200, 600, 300, 700]

        //!! Polymorphism does not allow casting without IS-A relationship. We cannot call methods of ArrayList (list) for a HashSet (set), instead you need to pass the collection (HashSet) in the constructor of the ArrayList
        //   System.out.println(  ( (ArrayList)collection2 ).get(4)  );

        System.out.println("new ArrayList<>(collection2).get(4) = " + new ArrayList<>(collection2).get(4));
            //new ArrayList<>(collection2).get(4) = 600

        //!! If you need to use methods of the ArrayList (ex. involving index) on the HashSet, then assign to a reference variable
        List<Integer> l = new ArrayList<>(collection2);




    }
}
