package day17_customClass;

public class Class07_Employee {

    // create instance variables (attributes)
    public String name;
    public int age;
    public char gender;
    public String jobTitle;
    public double salary;
    public String id;

    // create custom method to easily use instance variables in objects
    public void setInfo(String name, int age, char gender, String jobTitle, double salary, String id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.id = id;
    }

    // to be able to print the values assigned to the instance variables when you create objects you need to include a toString() method
    public String toString() {
        return "Class07_TestEmployeeObjects{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", id='" + id + '\'' +
                '}';
    }

    // create instance methods
    public void work(){
        System.out.println(name +" is working.");
    }
    public void onVacation(){
        System.out.println(name +" is on vacation.");
    }



} // Class close
