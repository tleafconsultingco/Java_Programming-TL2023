package studyGroup.polymorphism;

abstract public class Employee {

    //- Instance variables
    private String name;
    private String jobTitle;
    private double salary;

    //- Constructor

    public Employee(String name, String jobTitle, double salary) {
        setName(name);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    //- Getter and setter methods

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    //- Methods
    public abstract void work(); //!! abstract method (incomplete method)

    //- toString
    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" + //!! change from class name to getClass().getSimpleName()
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
