package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice04_ReturnNumber {
    public static void main(String[] args) {

        //!! Create new ArrayList with elements
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,7,8,8));
        System.out.println("arrayList = " + arrayList); //arrayList = [1, 2, 3, 4, 5, 6, 7, 7, 8, 8]


        //!! Create int variable max
        int max = 0;

        for (int i = 0; i < arrayList.size(); i++) {
            if (i>max){
                max++;
            }
        }
        //!! Return nth largest number from the list



    }//main close
}//class close
/*
write a program that can return the nth largest number from an
arraylist
ex:
n=5
arraylist = {1,2,3,4,5,6,7,7,8,8}
output: 4
 */