package day33_abstraction.employeeTask;

public class Class06_Driver extends Class03_Employee{

    public Class06_Driver(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }//constructor


    public void work(){
        System.out.println(getName()+" is driving");
    }
}//class
