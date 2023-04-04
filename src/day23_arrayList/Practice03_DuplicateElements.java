package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice03_DuplicateElements {
    public static void main(String[] args) {
        
        //!! Create new ArrayList with elements
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println("list = " + list); //list = [1, 2, 3, 4, 5]

        //!! Create new ArrayList to include duplicates
        ArrayList<Integer> dupList = new ArrayList<>(list);
        System.out.println("dupList = " + dupList); //dupList = [1, 2, 3, 4, 5]

        //!! Use addAll() to duplicate list and add to dupList
        dupList.addAll(list);
        System.out.println("dupList = " + dupList); //dupList = [1, 2, 3, 4, 5, 1, 2, 3, 4, 5]
      

        
        
    }//main close
}//class close
/*
Write a program that can duplicate the elements of an arraylist
                         ex:
                list = [1,2,3,4,5];
            output:
                 [1,2,3,4,5,1,2,3,4,5];
 */