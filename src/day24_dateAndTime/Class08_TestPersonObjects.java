package day24_dateAndTime;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Class08_TestPersonObjects {
    public static void main(String[] args) {

        //? I want to store multiple person objects into a data structure
            //?? Use Array or ArrayList since they both support objects


        //! Create Person Array with 5 people
        Class07_Person[] people = {new Class07_Person(), new Class07_Person(), new Class07_Person(), new Class07_Person(), new Class07_Person()};

        //!! Set people's data using setInfo() custom method
        people[0].setInfo("Alpha",'F', LocalDate.of(1989,2,25));
        people[1].setInfo("Bravo",'M', LocalDate.of(1972,4,7));
        people[2].setInfo("Charlie",'M', LocalDate.of(1992,8,12));
        people[3].setInfo("Delta",'F', LocalDate.of(1995,10,20));
        people[4].setInfo("Echo",'M', LocalDate.of(1998,1,12));


        //! Create a Person ArrayList with 5 people
        ArrayList<Class07_Person> studentsList = new ArrayList<>();
            //?? How do I add all elements of the people Array into this ArrayList? Use addAll()
        //!! Set people's data using addAll() ArrayList method
        studentsList.addAll(Arrays.asList(people));
            //!! Cannot just add people Array bc addAll() requires a Collection type
            //!! Convert the people Array to a Collection type by using Array.asList() Array utility method...since the Array is nonprimitive datatype

        System.out.println("studentsList (ArrayList) = " + studentsList);
            //studentsList (ArrayList) = [Class07_Person{name='Alpha', age=34, gender=F, dateOfBirth=1989-02-25}, Class07_Person{name='Bravo', age=51, gender=M, dateOfBirth=1972-04-07}, Class07_Person{name='Charlie', age=31, gender=M, dateOfBirth=1992-08-12}, Class07_Person{name='Delta', age=28, gender=F, dateOfBirth=1995-10-20}, Class07_Person{name='Echo', age=25, gender=M, dateOfBirth=1998-01-12}]

        //TODO
        //? Print name and DOB of each person object
        System.out.println();

        //? Remove all person objects whose age is greater than 30


        //! Use removeIf() ArrayList method


    }//main close
}//class close
