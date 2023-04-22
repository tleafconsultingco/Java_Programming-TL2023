package day24_dateAndTime;

import java.util.ArrayList;
import java.util.Collections;

public class Practice01_UniqueElements {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);

        System.out.println("list = " + list); //list = [1, 1, 2, 3, 3, 4, 5, 5]

        //? Using a nested for-each loop with if statements
        for (Integer element : list) {
            int frequency = 0;
            for (Integer each : list) {
                if(each==element){
                    frequency ++;
                }//if statement
            }//inner for each loop
            if (frequency > 1){
                continue;
            }//if statement
            System.out.println("element = " + element);
        }//outer for each loop


        //- Without a loop

        //? How do we check each element to see if it has already occurred w/o using a loop?
        //! Find frequency of a given element


        Collections.frequency(list,0);
        Collections.frequency(list,1);
        Collections.frequency(list,2);
        Collections.frequency(list,3);
        Collections.frequency(list,4);
        Collections.frequency(list,5);
        Collections.frequency(list,6);
        Collections.frequency(list,7);


        //! If statement



        /*
        int frequency = 0;



        Collections.list(Arrays.asList(list,));
        System.out.println("list = " + list);
        */
        
        


    }//main close
}//class close
/*
Write a program that can display the unique elements of an arrayList: ex:
list = [1, 1, 2, 3, 3, 4, 5, 5]
output:
[2, 4]
Note: DO NOT use any loops

 */