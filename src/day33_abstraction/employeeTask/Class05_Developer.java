package day33_abstraction.employeeTask;

public class Class05_Developer extends Class03_Employee {

    //- Additional variables
    private String programmingLanguage;

    //- Constructor

    public Class05_Developer(String name, int age, char gender, String id, String jobTitle, double salary, String programmingLanguage) {
        super(name, age, gender, id, jobTitle, salary);
        // !! change from this to setter
        // this.programmingLanguage = programmingLanguage;
        setProgrammingLanguage(programmingLanguage);

    }//constructor


    //- Getter and setter methods

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    //- Override methods
    @Override
    public void work() {
        System.out.println(getName() + " is developing");
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") + //!! if you want to include new variables you can call the parent class toString method, then replace the final curly brace, then add the new variable
                ", programming language=" + programmingLanguage + "}";

    }
}//class
