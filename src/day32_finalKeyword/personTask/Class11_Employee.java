package day32_finalKeyword.personTask;

import java.time.LocalDate;

public class Class11_Employee extends Class10_Person {

    //- Instance variables
    private String jobTitle;
    private double salary;

    //- Constructor
    public Class11_Employee(String name, char gender, LocalDate dateOfBirth, String jobTitle, double salary) {
        super(name, gender, dateOfBirth);
        setJobTitle(jobTitle);
        setSalary(salary);
    }//constructor

    //- Getter methods
    public String getJobTitle() {
        return jobTitle;
    }
    public double getSalary() {
        return salary;
    }

    //- Setter methods
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //- Methods
    public void work(){
        System.out.println(getName() +" is working");
    }

    //- toString
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", dateOfBirth=" +getDateOfBirth() +
                "jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }//toString
}//class
