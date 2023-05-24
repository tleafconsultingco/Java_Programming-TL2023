package day32_finalKeyword.personTask;

import java.time.LocalDate;

public class Class12_TestPersonObject {
    public static void main(String[] args) {

        Class10_Person person = new Class10_Person("Daniel", 'M', LocalDate.of(1991,1,25));

        System.out.println(person);
            //Person{name='Daniel', gender=M, age=32, dateOfBirth=1991-01-25}

        person.breath(); //Daniel is breathing

        System.out.println("----------------------------");

        Class11_Employee employee = new Class11_Employee("Emily", 'F', LocalDate.of(1989, 2, 5), "Accountant", 100000);

        System.out.println(employee);
            //Employee{name='Emily', gender=F, age=34, dateOfBirth=1989-02-05jobTitle='Accountant', salary=100000.0}

        employee.breath(); //Emily is breathing



    }//main
}//class
