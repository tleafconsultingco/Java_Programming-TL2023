package day25_constructors;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Class07_Employee {

    //- Create new constructor

    //!! Instance variables
    public String name;
    public int age;
    public char gender;
    public String jobTitle;
    public double salary;
    public LocalDate hired_date;

    //!! Constructor that allows us to set all of the instance variables of the object as soon as the object is created
    public Class07_Employee(String name, int age, char gender, String jobTitle, double salary, LocalDate hired_date) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hired_date = hired_date;
    }//constructor Class07_Employee

    //!! toString() allows us to print the object when it's passed in the print statement
    public String toString() {
        return "Class07_Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", hired_date=" + hired_date.format(DateTimeFormatter.ofPattern("MMMM/dd/y")) +
                '}';
    }//setInfo


}//class
/*
name
age
gender
jobTitle
salary
hired date
 */