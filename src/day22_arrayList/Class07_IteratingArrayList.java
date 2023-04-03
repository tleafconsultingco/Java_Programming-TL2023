package day22_arrayList;
import java.util.ArrayList;
public class Class07_IteratingArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);
        numbers.add(3, 255);

        //!! Manually evaluate the ArrayList
            //{100, 200, 300, 255, 400, 500}

        System.out.println("numbers = " + numbers);
            //numbers = [100, 200, 300, 255, 400, 500]

        //!! Not possible to add at index 300 since you currently only have up to index 5
        // numbers.add(300, 2000);

        System.out.println("------ For Loop --------");
        //! Iterate every element in this ArrayList

        //! 1. Use a For loop
        for (int i = 0; i < numbers.size(); i++) {
            //!! Assign each iteration to a variable
            int each = numbers.get(i);
            System.out.println(each);
                //100
                //200
                //300
                //255
                //400
                //500
        }//for loop close

        System.out.println("-------- For loop reverse ------");
        for (int i = numbers.size() - 1; i >= 0; i--) {
            int reverse = numbers.get(i);
            System.out.println(reverse);
                //500
                //400
                //255
                //300
                //200
                //100
        }//for loop close

        System.out.println("-------- For-Each loop ---------");

        for (Integer each : numbers) { //? Why do I have Integer instead of int in this ArrayList?
            //?? Each element is an Integer, when the loop executes, each element (which is an Integer) will be assigned to the variable of Integer
            //!! But you won't get error if you use int instead of Integer, but there will be an additional step needed
                //!! Each element in this array is an Integer wrapper class. Integer wrapper class will be assigned to the primitive value (unboxing). NOT THE BEST PRACTICE
            System.out.println(each);
                //100
                //200
                //300
                //255
                //400
                //500
        }//for-each loop close


        System.out.println("------- Another example --------");

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Alpha");
        arrayList.add("Bravo");
        arrayList.add("Charlie");
        arrayList.add("Delta");
        arrayList.add("Echo");

        //? Iterate elements using For loop
        for (int i = 0; i < arrayList.size(); i++) {
            //!! Assign each iteration to a variable
            String each = arrayList.get(i);
            System.out.print(each+" ");
                //Alpha Bravo Charlie Delta Echo
        }//For loop close

        System.out.println();

        //? Iterate elements in reverse using For loop
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            String eachReverse = arrayList.get(i);
            System.out.print(eachReverse+" ");
                //Echo Delta Charlie Bravo Alpha
        }//For loop close

        System.out.println();

        //? Iterate elements using For-Each loop
        for (String each : arrayList) {
            System.out.print(each+" ");
                //Alpha Bravo Charlie Delta Echo
        }//For-Each loop close






    }//main close
}//class close
