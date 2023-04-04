package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Class06_BulkOperations {
    public static void main(String[] args) {

        System.out.println("------------ addAll() -------------");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        //! Add all elements from numbers into list1
        list1.addAll(numbers); //!! Added to the end of list1
        System.out.println("list1 = " + list1); //list1 = [1, 2, 3, 10, 20, 30, 40]
                                                // index:  0  1  2  3   4   5   6

        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.add(10);
        numbers2.add(20);
        numbers2.add(30);
        numbers2.add(40);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        //! Add elements from numbers into list1 at a specified index
        list2.addAll(1, numbers2);
        System.out.println("list2 = " + list2); //list2 = [1, 10, 20, 30, 40, 2, 3]
        //!! index of elements after the add shift:        0  1   2   3   4   5  6


        System.out.println("------ addAll() with Arrays.asList() -------");

        //? What if I don't have another ArrayList to add another ArrayList
        ArrayList<Integer> scores = new ArrayList<>();

        scores.addAll( Arrays.asList(75, 85, 95, 70, 80) ); //!! These are not contained in an ArrayList so you need to use asList() from Arrays utility methods

        System.out.println("scores = " + scores); //scores = [75, 85, 95, 70, 80]

        System.out.println("----- addAll() with String -------");

        ArrayList<String> students = new ArrayList<>();
        students.addAll(  Arrays.asList("Gadir", "Hasan", "Abidullah", "Bilal" )   );
        System.out.println("students = " + students); //students = [Gadir, Hasan, Abidullah, Bilal]

        students.addAll(2,  Arrays.asList("Shukur", "Sumeye", "Tatiana") );
        System.out.println("students = " + students); //students = [Gadir, Hasan, Shukur, Sumeye, Tatiana, Abidullah, Bilal]


        System.out.println("----------");

        //? How do I get this Array into an ArrayList?
        Integer[] newArray = {1, 2, 3, 4, 5, 6, 7, 8};
            //?? Assign it directly to a new ArrayList
            //!! Array.asList() will convert the Array into a Collections list
        ArrayList<Integer> newArrayList = new ArrayList<>( Arrays.asList(newArray) );
            //@@ Implicitly calls the ArrayList using the constructor

        System.out.println("newArrayList = " + newArrayList); //newArrayList = [1, 2, 3, 4, 5, 6, 7, 8]

            //?? Could also use addAll()
            // newArray.addAll(  Arrays.asList(mewArray) );

        System.out.println("------ containsAll() ------");

        ArrayList<String> employeesList = new ArrayList<>();
        //!! Use addAll to add elements to the new ArrayList
        employeesList.addAll( Arrays.asList(  "Alena", "Muhtar", "Gadir", "Ali" )  );

        System.out.println("employeesList = " + employeesList); //employeesList = [Alena, Muhtar, Gadir, Ali]

        boolean hasAlena = employeesList.contains("Alena"); //!! to see if ONE element is in the ArrayList use the contains() method
        System.out.println("hasAlena = " + hasAlena); //hasAlena = true

        //?? Instead of using contains() method more than once to find more than 1 element, use the containsAll() method
        boolean hasAlenaGadir = employeesList.containsAll( Arrays.asList("Alena", "Gadir") );
        System.out.println("hasAlenaGadir = " + hasAlenaGadir); //hasAlenaGadir = true

        boolean hasMuhtarAliKuzzat = employeesList.containsAll( Arrays.asList("Muhtar", "Ali", "Kuzzat") );
        
        System.out.println("hasMuhtarAliKuzzat = " + hasMuhtarAliKuzzat); //hasMuhtarAliKuzzat = false


        System.out.println("------------ removeAll() ----------------");

        ArrayList<Integer> list = new ArrayList<>();
        //!! Use addAll() to add multiple elements
        list.addAll( Arrays.asList(10, 10, 20, 30, 40, 50, 60, 70, 10, 10, 10, 10, 20, 20, 20, 20) );

        list.removeAll( Arrays.asList(10, 20) ); //!! removes all elements that match
        System.out.println("list = " + list); //list = [30, 40, 50, 60, 70]

        
        System.out.println("--------------- retainAll() ------------------");

        ArrayList<String> developers = new ArrayList<>();
        //!! Use addAll() to add multiple elements
        developers.addAll( Arrays.asList(  "Alena", "Muhtar", "Gadir", "Ali", "Khashayar", "Madiyar", "Muhtar", "Muhtar" , "Alena")  );

        developers.retainAll(  Arrays.asList("Alena", "Khashayar", "Muhtar") ); //!! retains all elements that match and removes all elements that do not match
        System.out.println("developers = " + developers); //developers = [Alena, Muhtar, Khashayar, Muhtar, Muhtar, Alena]

        System.out.println("------------------------");

        ArrayList<String> groceriesList = new ArrayList<>();
        groceriesList.addAll(
                Arrays.asList("Eggs", "Potato",  "Milk", "Tomato", "Rice", "Orange", "Strawberry", "Blueberry", "Paper towels")
        );

        //!! You can use retainAll() to keep the ones that you need
        //!! OR you can use removeAll() to get rid of the ones you don't need
        // groceriesList.retainAll( Arrays.asList("Eggs", "Potato",  "Milk", "Tomato") );
        groceriesList.removeAll( Arrays.asList("Rice", "Orange", "Strawberry", "Blueberry", "Paper towels") );

        System.out.println("groceriesList = " + groceriesList); //groceriesList = [Eggs, Potato, Milk, Tomato]





    }//main close
}//class close
