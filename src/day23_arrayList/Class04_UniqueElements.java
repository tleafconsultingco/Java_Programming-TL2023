package day23_arrayList;

import java.util.ArrayList;

public class Class04_UniqueElements {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        //! Add elements with add() method
        names.add("Vasyl"); //!! index: 0
        names.add("Vasyl"); //!! index: 1
        names.add("Sumeye"); //!! index: 2
        names.add("Sumeye"); //!! index: 3
        names.add("Ali"); //!! index: 4
        names.add("Sumeye"); //!! index: 5
        names.add("Shukir"); //!! index: 6
        names.add("Marika"); //!! index: 7
        names.add("Marika"); //!! index: 8

        //! 2. Iterate all elements with For-Each loop
        for (String each : names) {
            //! 2a. If statement to verify if the first time the name occurs == the last time it occurs
            if(names.indexOf(each) == names.lastIndexOf(each)){ //!! If true, then it means the element is unique
                System.out.println(each);
            }//if statement close
        }//for-each loop close





    }//main close
}//class close
