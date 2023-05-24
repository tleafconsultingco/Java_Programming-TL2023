package day33_abstraction;

import java.time.LocalDate;

public class Class02_TestCydeoDevStudentObject {

    public static void main(String[] args) {

        Class01_CydeoDevStudent student1 = new Class01_CydeoDevStudent("Daniel", 'M', LocalDate.of(1989,11,1), "A1", "zero to hero", 2);

        System.out.println(student1);
            //CydeoDevStudent{name='Daniel', gender=M, age=34, dateOfBirth=1989-11-01, id='A1', batchName='zero to hero', batchNumber=2}

        student1.eat(); //Daniel is eating Java
        student1.drink(); //Daniel is drinking Java
        student1.sleep(); //Daniel does not need to sleep
        student1.breath(); //Daniel is breathing

    }//main
}//class
