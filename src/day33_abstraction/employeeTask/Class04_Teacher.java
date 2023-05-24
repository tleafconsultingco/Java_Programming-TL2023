package day33_abstraction.employeeTask;

public class Class04_Teacher extends Class03_Employee {

    public Class04_Teacher(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }//constructor

    @Override
    public void work() {
        System.out.println(getName() + " is teaching");
    }

}//class
