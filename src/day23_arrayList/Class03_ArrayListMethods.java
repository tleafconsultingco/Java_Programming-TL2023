package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Class03_ArrayListMethods {
    public static void main(String[] args) {

        //- Given array
        int[] array = {1, 2, 3, 4, 5};

        //? How do you update the element at index 0 to the value of 100?
        //?? Give the index of the element you want to update, then reassign new value
        array[0] = 100;

        System.out.println(Arrays.toString(array)); //[100, 2, 3, 4, 5]

        System.out.println("------- same task but with ArrayList -------");

        ArrayList<String> groceriesList = new ArrayList<>();
        groceriesList.add("Eggs");
        groceriesList.add("paper Towels");
        groceriesList.add("Apples");
        groceriesList.add("Cooking oil");

        System.out.println(groceriesList); //[Eggs, paper Towels, Apples, Cooking oil]

        System.out.println("--------- set() ----------");
        //? I want to update the list to replace apples with orange
        //?? I cant update the element like how we did with Arrays
            // groceriesList[2] = "Oranges";
        //! Use set()
        groceriesList.set(2, "Oranges");
        System.out.println(groceriesList); //[Eggs, paper Towels, Oranges, Cooking oil]
            //!! size did not change

        //! Remember that add() inserts an element at a specified index and shifts all other elements to the next index number
        groceriesList.add(2, "Chicken");
        System.out.println(groceriesList); //[Eggs, paper Towels, Chicken, Oranges, Cooking oil]
            //!! size increased by one

        System.out.println("--------- remove() ----------");
        //? I want to remove an element from the ArrayList
        groceriesList.remove(0);
        System.out.println(groceriesList); //[paper Towels, Chicken, Oranges, Cooking oil]
            //!! size is decreased by 1, and the index numbers shift over

        groceriesList.remove("paper Towels");
        System.out.println(groceriesList); //[Chicken, Oranges, Cooking oil]


        ArrayList<String> todoList = new ArrayList<>();
        todoList.add("Wake up"); //!! index: 0
        todoList.add("Drink tea"); //!! index: 1
        todoList.add("Do Java"); //!! index: 2
        todoList.add("Be awesome"); //!! index: 3

        //? Remove index 1
        //?? Pass the index
        todoList.remove(1);
        System.out.println("todoList = " + todoList); //todoList = [Wake up, Do Java, Be awesome]
            //!! size decreased by 1
            //!! elements from index 2 and 3 shifted to indexes 1 and 2

        //? Remove "Do Java"
        //?? Pass the object
        todoList.remove("Do Java");
        System.out.println("todoList = " + todoList); //todoList = [Wake up, Be awesome]
            //!! size decreased by 1
            //!! element from index 2 shifted to index 1



        System.out.println("----- remove() with wrapper class ------");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10); // index: 0
        numbers.add(20); // index: 1
        numbers.add(30); // index: 2
        numbers.add(40); // index: 3
        numbers.add(50); // index: 4
        System.out.println("numbers = " + numbers); //numbers = [20, 30, 40, 50]

        boolean r1 = numbers.remove( Integer.valueOf(10) );
        System.out.println("r1 = " + r1); //true

        numbers.clear(); //!! cleared the entire ArrayList
        System.out.println(numbers); //[]
        System.out.println(numbers.size()); //0


        System.out.println("--------- indexOf() and lastIndexOf() ------------");

        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl"); //!! index: 0
        names.add("Vasyl"); //!! index: 1
        names.add("Sumeye"); //!! index: 2
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");

        System.out.println(  names.indexOf("Vasyl") ); //0
        System.out.println( names.lastIndexOf("Vasyl") ); //1
        System.out.println( names.lastIndexOf("Sumeye") ); //5

        System.out.println("--------- contains() ------------");

        boolean hasMuhtar = names.contains("Muhtar"); //false
        boolean hasAli = names.contains("Ali"); //true

        System.out.println("hasMuhtar = " + hasMuhtar); //false
        System.out.println("hasAli = " + hasAli); //false

        System.out.println("---------------- equals() ------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = list1; //list2 is calling the same object as list1
        //-- These ArrayLists are the SAME objects

        list1.add(10);
        System.out.println(list1); //[10]
        System.out.println(list2); //[10]

        System.out.println(list1 == list2); //true
            //-- These are the SAME object

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        // -- These ArrayLists are DIFFERENT objects

        l1.add(10);
        l2.add(10);
        System.out.println(l1); //[10]
        System.out.println(l2); //[10]

        System.out.println(l1 == l2); //false
            //-- These are DIFFERENT objects

        System.out.println(l1.equals(l2)); //true
            //-- The elements are EQUAL even though the ArrayLists are DIFFERENT objects

        System.out.println("----------");
        ArrayList<Integer> n1 = new ArrayList<>();
        n1.add(10);
        n1.add(20);
        n1.add(30);

        ArrayList<Integer> n2 = new ArrayList<>();
        n2.add(30);
        n2.add(10);
        n2.add(20);

        System.out.println("n1 = " + n1); //n1 = [10, 20, 30]
        System.out.println("n2 = " + n2); //n2 = [30, 10, 20]

        System.out.println(n1.equals(n2)); //false
            //-- The indexes are not the same in both ArrayLists


        System.out.println("--------------- isEmpty --------------------");

        System.out.println(n1.isEmpty()); //false
        System.out.println(n2.isEmpty()); //false

        n1.clear(); //!! clears n1
        n2.clear(); //!! clears n2

        System.out.println(n1.isEmpty()); //true
        System.out.println(n2.isEmpty()); //true




    }//main close
}//class close
