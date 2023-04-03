package day22_arrayList;
import java.util.ArrayList;
public class Class06_ArrayListMethods {
    public static void main(String[] args) {

        //- ArrayList methods: add(), size(), and get()


        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("------- add()----------");
        //-- Arraylist method add() with Integer
        //? How can you pass an int even though you need a wrapper class object?
            //?? The int will implicitly autoboxed into Integer wrapper class
        //! Add elements one at a time, every time you add an element the size will be increased
        list.add(10); //!! index: 0
        list.add(20); //!! index: 1
        list.add(30); //!! index: 2
        list.add(10); //!! index: 3

        //!! The ArrayList can only accept the indicated data type
        // list.add(5.5);

        System.out.println("list = "+list);
            //list = [10, 20, 30, 10]
            //index   0   1   2   3

        //! You can insert an element at a specific index number (all following elements will move to the next index
        list.add(1, 15); //1
        System.out.println("list = "+list);
            //list = [10, 15, 20, 30, 10]

        list.add(2, 25);
        System.out.println("list = "+list);
            //list = [10, 15, 25, 20, 30, 10]

        System.out.println("---------- size() and get() -------------------");

        ArrayList<String> studentsList = new ArrayList<>();
        studentsList.add("Mohammad");
        studentsList.add("Abdurasul");
        studentsList.add("Abidullah");
        studentsList.add("Tatiana");

        //-- Arraylist method size()
        System.out.println("studentList size = "+studentsList.size());
        System.out.println("studentList = "+studentsList);


        //-- Arraylist method get()
        //!! Since it is returning a String, we can assign it to a String variable
        String firstStudent = studentsList.get(0);

        String lastStudent =  studentsList.get( studentsList.size() -1  );

        System.out.println("firstStudent = "+firstStudent); //firstStudent = Mohammad
        System.out.println("lastStudent = "+lastStudent); //lastStudent = Tatiana



        ArrayList<String> codeArrayList = new ArrayList<>();
        codeArrayList.add("Alpha");
        codeArrayList.add("Bravo");
        codeArrayList.add("Charlie");
        codeArrayList.add("Delta");
        codeArrayList.add("Echo");

        String firstCode = codeArrayList.get(0);
        System.out.println("firstCode = " + firstCode); //firstCode = Alpha

        String lastCode = codeArrayList.get(codeArrayList.size()-1);
        System.out.println("lastCode = " + lastCode); //lastCode = Echo



    }//main close
}//class close
