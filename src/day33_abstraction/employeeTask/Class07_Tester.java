package day33_abstraction.employeeTask;

public class Class07_Tester extends Class03_Employee {

    public Class07_Tester(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }


    public void work(){
        System.out.println(getName()+" is testing the application");
    }
}//class
