package day33_abstraction.employeeTask;

public abstract class Class03_Employee { //!! include abstract keyword to make this an abstract class, otherwise the abstract methods cannot be created

    //- Instance variables
    private String name;
    private int age;
    private char gender;
    private String id;
    private String jobTitle;
    private double salary;

    //- Constructor

    public Class03_Employee(String name, int age, char gender, String id, String jobTitle, double salary) {
        setName(name);
        setAge(age);
        setGender(gender);
        setId(id);
        setJobTitle(jobTitle);
        setSalary(salary);
    }


    //- Getter and setter methods

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getId (String id){
        return id;
    }

    public void setId(String id){
        this.id = id;
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
        return getClass().getSimpleName()+"{" + //!! change from class name to getClass().getSimpleName()
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}//class
/*
Employee:
		Variables:
			name, age, gender, id, jobTitle, salary ....

		Methods:
		  abstract work();


    Teacher:
    	work(){ teaching }


	Developer:
		work() { coding }

	Tester:
		work(){ testing }

	Driver:
		work() { driving }

 */