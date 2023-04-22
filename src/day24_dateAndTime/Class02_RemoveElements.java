package day24_dateAndTime;

import day17_customClass.Class07_Employee;

import java.util.ArrayList;
import java.util.Arrays;

public class Class02_RemoveElements {
    public static void main(String[] args) {

        //! 1. Create new ArrayList
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

        //!! Another method to create ArrayList
            // ArrayList<Integer> list2 = new ArrayList<>();
            // list2.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

        System.out.println(list); //[1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7]

        //- 2. remove() method...BUT WAIT
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)<4){ //!! if element is <4, then
                list.remove(i); //-- BUT YOU CAN'T USE REMOVE IN A LOOP BC ELEMENTS SHIFT AFTER AN ELEMENT IS REMOVED, WHICH MEANS THE PREVIOUS INDEX WAS ALREADY ITERATED, EVEN IF THE VALUE AT THAT INDEX CHANGED
            }//if statement close
        }//for loop close

        System.out.println(list); //[2, 4, 5, 6, 7, 2, 4, 5, 6, 7]
            //!! Still contains elements that are <4, bc values shift index if an index was removed in the loop

        for (Integer each : list) {
        }


        //! 2. Use removeIf() method

        list.removeIf(p->p<4);
            //!! Assign a variable for the predicate expression, p is preferred (it will automatically match the datatype)
            //!! Use -> operator (compiler will now recognize you are giving a lambda expression)
                //@@ This variable will iterate every element of the ArrayList and assign it to the variable
            //!! State condition (remove elements if they are less than 4)
                //@@ During each iteration the variable (which is now the value of the element at a specified index) will be checked against the condition
            //!! If true, then the element will be removed

        System.out.println("list w/o numbers less than 4: "+list);
            //list w/o numbers less than 4: [4, 5, 6, 7, 4, 5, 6, 7]



        System.out.println("------- removeIf() with String ArrayList ------");

        ArrayList<String> names = new ArrayList<>();

        names.addAll( Arrays.asList("Java", "Python", "C#", "Java", "Ruby", "JavaScript", "C++", "C") );

        //! Remove elements that start with J
        //!! Use String method startsWith()
        names.removeIf( p -> p.startsWith("J") );
        System.out.println(names); //[Python, C#, Ruby, C++, C]


        System.out.println("------- removeIf() with custom class ------");

        ArrayList<Class07_Employee> employees = new ArrayList<>();

        employees.addAll(Arrays.asList(new Class07_Employee(), new Class07_Employee(), new Class07_Employee(), new Class07_Employee(), new Class07_Employee()));

        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
        employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
        employees.get(2).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
        employees.get(3).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
        employees.get(4).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");

        //! Remove elements with salary greater than 100000
        employees.removeIf( p -> p.salary > 100000 );

        //!! Get salary for each employee using for-each loop
        for (Class07_Employee each : employees) {
            System.out.println(each.name + " : "+each.salary);
                //Josh : 100000.0
                //Emily : 90000.0
                //Bella : 95000.0
        }//for-each close










    }//main close
}//class close
/*
Write a program that can remove the elements that are less than 4, from an ArrayList of integer
Ex:
list = {1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7};
output:
[4, 5, 6, 7, 4, 5, 6, 7]
 */