package day30_inheritance.typesOfInheritance;

import java.time.LocalDate;

public class Class08_Employee extends Class06_Person{

    //- Private instance variables
    private String jobTitle;
    private String employeeId;
    private double salary;

    //- Constructor
    public Class08_Employee(String name, char gender, LocalDate DOB, String jobTitle, String employeeId, double salary) {
        super(name, gender, DOB);
        setJobTitle(jobTitle);
        setEmployeeId(employeeId);
        setSalary(salary);
    }//constructor

    //- Getter and setter methods
    public String getJobTitle() {
        return jobTitle;
    }//getJobTitle

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }//setJobTitle

    public String getEmployeeId() {
        return employeeId;
    }//getEmployeeId

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }//setEmployeeId

    public double getSalary() {
        return salary;
    }//getSalary

    public void setSalary(double salary) {
        this.salary = salary;
    }//setSalary

    //- Methods
    public void work(){
        System.out.println(getName()+" is working"); //!! use getName method bc the name variable is private but the getName method is public
    }//work

}//subclass
