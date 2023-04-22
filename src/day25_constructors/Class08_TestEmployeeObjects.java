package day25_constructors;

import java.time.LocalDate;

public class Class08_TestEmployeeObjects {
    public static void main(String[] args) {

        Class07_Employee e1 = new Class07_Employee("Khashayar", 32, 'M', "Java Developer", 95000, LocalDate.of(2022, 12, 2));

        Class07_Employee e2 = new Class07_Employee("Mohammad", 31, 'M', "Project Manager", 120000, LocalDate.of(2021, 5, 1));


        System.out.println("e1 = " + e1);
            //e1 = Class07_Employee{name='Khashayar', age=32, gender=M, jobTitle='Java Developer', salary=95000.0, hired_date=December/02/2022}
        System.out.println("e2 = " + e2);
            //e2 = Class07_Employee{name='Mohammad', age=31, gender=M, jobTitle='Project Manager', salary=120000.0, hired_date=May/01/2021}



    }//main
}//class
