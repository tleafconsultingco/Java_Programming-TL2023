package day32_finalKeyword.personTask;

import java.time.LocalDate;

public class Class10_Person {

    //- Instance variables
    private String name;
    private final char gender; //!! unchangeable
    private final int age;
    private final LocalDate dateOfBirth; //!! unchangeable


    //- Static variables
    public static final int numberOfHead;

    //- Static block
    static{
        numberOfHead = 1;
    }//static

    //- Constructor
    public Class10_Person(String name, char gender, LocalDate dateOfBirth) {
        setName(name);
        if( !(gender=='M' || gender == 'F')){
            System.err.println("Invalid gender: "+gender);
            System.exit(1);
        }//if
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.age = LocalDate.now().getYear() - dateOfBirth.getYear();

    }//constructor

    //- Getter methods
    //-- All can be read
    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    //- Setter method
    //-- Only 1 setter, bc the other variables have final keyword
    public void setName(String name) {
        this.name = name;
    }


    //- Methods
    public void eat(){
        System.out.println(name+" is eating");
    }

    public void drink(){
        System.out.println(name+" is drinking");
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    public final void breath(){ //!! To make sure that this implementation will not change for any sub class
        System.out.println(name +" is breathing");
    }

    //- toString
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }//toString

}//class
/*
Variables:
    name, gender, age, dateOfBirth
    numberOfHead

Methods:
    eat(), drink(), sleep()
    breath()
 */