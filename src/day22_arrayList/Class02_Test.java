package day22_arrayList;
import java.util.Arrays;
import utilities.ArraysUtility;
public class Class02_Test {
    public static void main(String[] args) {


        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 90};

        //? Does the array contain 25?
        //?? Use custom contains method
        boolean has25 = ArraysUtility.contains(numbers, 25);
        System.out.println("has25 = " + has25);
            //has25 = false

        System.out.println("--------- Using contains method String ----------");

        String[] students = {"Sumeye", "Hamza", "Marika"};
        System.out.println( "has Khashayar = "+ArraysUtility.contains(students, "Khashayar")  );
            //has Khashayar = false


    }//main close
}//class close
