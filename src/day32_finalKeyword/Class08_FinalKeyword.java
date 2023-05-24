package day32_finalKeyword;

import java.time.LocalDate;

class Student{
    public final void language(){
        System.out.println("Java Programming");
    }//method


}//class
public final class Class08_FinalKeyword extends Student { //!! Child class can be final


    /*
    public void language(){ //!! final methods can never be overridden
        System.out.println("Python Programming");
    }
     */

    //- Constructor
    public Class08_FinalKeyword() { //final method not applicable
    }//constructor

    public static void main(String[] args){

            final char gender = 'M';
            System.out.println(gender); //M

            //  gender = 'F';
            System.out.println(gender); //M


            final LocalDate dateOfBirth = LocalDate.now();
            System.out.println(dateOfBirth); //2023-05-12

            //  dateOfBirth = dateOfBirth.plusYears(1);
            System.out.println(dateOfBirth); //2023-05-12


            new Student().language(); //Java Programming
            new Class08_FinalKeyword().language(); //Java Programming


            final String name = "James";
            // name = null;
            // name = "Daniel";
            //!! if this variable did not have final keyword, this reassignment would make "James" eligible for garbage collection...but since the variable is final it will always be "James"
            System.out.println(name); //James


        }//main
    }//class
