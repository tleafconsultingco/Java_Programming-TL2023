package day30_inheritance.typesOfInheritance;

import java.time.LocalDate;

public class Class10_Teacher extends Class08_Employee {

    //- Constructor
    public Class10_Teacher(String name, char gender, LocalDate DOB, String jobTitle, String employeeId, double salary) {
        super(name, gender, DOB, jobTitle, employeeId, salary);
    }//constructor

    //- Method
    public void teach(){
        System.out.println(getName() + " is teaching");
    }//teach

}//subclass
