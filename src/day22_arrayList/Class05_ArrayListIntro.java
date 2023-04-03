package day22_arrayList;
import java.util.Arrays;
import java.util.ArrayList;
public class Class05_ArrayListIntro {
    public static void main(String[] args) {

        //- Evaluating an array

        int[] array = new int[5]; //{0, 0, 0, 0, 0}

        //!! Number of elements is fixed, unassigned elements will get the default value
        array[0] = 10; //{10, 0, 0, 0, 0}
        array[1] = 20; //{10, 20, 0, 0, 0}
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;
        //!! No more indexes can be created in this array
            // array[5] = 60; // index out of bounds exception

        System.out.println(Arrays.toString(array));


        System.out.println("---------------- ArrayList ----------------------");

        //!!                        object
        ArrayList<Integer>  list =  new ArrayList<>();
        //!!     Datatype  variable     constructor

        System.out.println(list); //There are currently no elements in this ArrayList
            //[]

        System.out.println(list.size());
            //0


    }//main close
}//class close
