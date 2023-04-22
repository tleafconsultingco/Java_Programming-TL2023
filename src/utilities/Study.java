package utilities;

import java.util.ArrayList;

public class Study {

    public static void main(String[] args) {

        //- Int Array to Integer ArrayList


        int[] arrayInt = {1,2,3,4,5,6};

        //ArrayList<Integer> arrayListInteger = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

        
        ArrayList<Integer> arrayListInteger = new ArrayList<>();
        for (int each : arrayInt) {
            arrayListInteger.add(each);
        }

        System.out.println("arrayListInteger = " + arrayListInteger);
            //arrayListInteger = [1, 2, 3, 4, 5, 6]







    }//main close
}//class close
