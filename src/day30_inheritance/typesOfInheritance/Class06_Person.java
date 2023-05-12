package day30_inheritance.typesOfInheritance;

import java.time.LocalDate;

public class Class06_Person {

    //- Private instance variables
    private String name;
    private int age;
    private char gender;
    private LocalDate DOB;

    //- Constructor
    public Class06_Person(String name, char gender, LocalDate DOB) {
        setName(name);
        setGender(gender);
        setDOB(DOB);
        setAge( LocalDate.now().getYear() - DOB.getYear()); //!! Use age based on DOB -- from current year minus DOB year
    }//constructor

    //- Getter and setter methods
    public String getName() {
        return name;
    }//getName

    public void setName(String name) {
        this.name = name;
    }//setName

    public int getAge() {
        return age;
    }//getAge

    public void setAge(int age) {

        if(age<= 0){
            System.err.println("Age can not be negative or zero");
            System.exit(1);
        }//if

        this.age = age;
    }//setAge

    public char getGender() {
        return gender;
    }//getGender

    public void setGender(char gender) {
        this.gender = gender;
    }//setGender

    public LocalDate getDOB() {
        return DOB;
    }//getDOB

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }//setDOB

    //- Methods
    public void eat(String food){
        System.out.println(name +" is eating "+ food);
    }//eat

    public void drink(String drink){
        System.out.println(name+" is drinking "+drink);
    }//drinks

    //toString
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", DOB=" + DOB +
                '}';
    }//toString

}//class
