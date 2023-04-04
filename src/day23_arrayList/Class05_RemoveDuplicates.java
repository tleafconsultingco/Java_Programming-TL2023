package day23_arrayList;
import java.util.ArrayList;
public class Class05_RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        //! 1. Add elements with add()
        names.add("Vasyl"); // 0
        names.add("Vasyl"); // 1
        names.add("Sumeye"); //2
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");

        System.out.println(names); //[Vasyl, Vasyl, Sumeye, Sumeye, Ali, Sumeye]

        //! 2. Declare second ArrayList
        ArrayList<String> nonDup = new ArrayList<>();

        //! 3. Add elements from names to nonDup with For-Each loop
        for (String each : names) {
            //! 4. If statement to check if the  element is already contained
            if(nonDup.contains(each)){
                continue; //!! 4a. Continue statement to skip those that are already included
            }//if statement close
            nonDup.add(each); //! 5. Add iterated each elements to nonDup (already skips the elements that are duplicates
        }//for-each loop close

        //! 6. Reassign names to values of nonDup;
        names = nonDup;

        System.out.println(names); //[Vasyl, Sumeye, Ali]
        System.out.println(nonDup); //[Vasyl, Sumeye, Ali]


    }//main close
}//class close
