package day28_encapsulation;

public class Class05_Employee {


    //- Instance variables
    private String name;
    private int age;
    private String jobTitle;
    private double salary;

    //- Constructor
    public Class05_Employee(String name, int age, String jobTitle, double salary) {
        setName(name);
        setAge(age);
        setJobTitle(jobTitle);
        setSalary(salary);
        //!! Better to use the setter methods instead of this keyword bc the methods don't directly assign the argument to the instance variable...it first checks the condition that are outlined in this setter method if conditions
    }//constructor

    //- Getters and setters
    public int getAge() {
        return age;
    }//getAge

    public void setAge(int age) {

        if(age < 16){
            System.err.println("Invalid age: "+age);
            System.exit(1);
        }//if

        this.age = age;
    }//setAge

    public String getJobTitle() {
        return jobTitle;
    }//getJobTitle

    public void setJobTitle(String jobTitle) {

        if(jobTitle.isEmpty() || jobTitle.isBlank()){
            System.err.println("Job title of the employee can not be empty or blank");
            System.exit(1);
        }//if

        this.jobTitle = jobTitle;
    }//setJobTitle


    public String getName() {

        if(name == null){
            return "Unknown";
        }//if

        return name;
    }//getName

    public void setName(String name) {

        if(name.isEmpty() || name.isBlank()){
            System.err.println("Employee name can not empty or blank");
            System.exit(1);
        }//if

        this.name = name;
    }//setName

    public double getSalary() { //!! READ
        return salary;
    }//getSalary

    public void setSalary(double salary) { //!! WRITE

        if(salary < 0){
            System.err.println("Salary can not be negative: "+salary);
            System.exit(1);
        }//if

        this.salary = salary;
    }//setSalary


    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", jobTitle='" + getJobTitle() + '\'' +
                ", salary=" + getSalary() +
                '}';
    }//toString


}//class
