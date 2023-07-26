package studyGroup.polymorphism;

public class Developer extends Employee{

    //- Constructor
    public Developer(String name, String jobTitle, double salary, String programmingLanguage) {
        super(name, jobTitle, salary);
        setProgrammingLanguage(programmingLanguage);
    }

    //- Additional variables
    private String programmingLanguage;

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
}
