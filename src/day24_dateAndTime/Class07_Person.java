package day24_dateAndTime;

import java.time.LocalDate;

public class Class07_Person {

    //- Create instance variables to set all the attributes

    public String name;
    public int age;
    public char gender;
    public LocalDate dateOfBirth;

    //? Create custom method only using name, gender, and dateOfBirth to find age
        //?? Use shortcut: right-click >> Generate >> Constructor

    public void setInfo(String name, char gender, LocalDate dateOfBirth) {
        //!! Convert the constructor (Class07_Person) to void setInfo
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        //!! Set the age using dateOfBirth
        age = LocalDate.now().getYear() - dateOfBirth.getYear();
            //?? You don't need to include this. since the instance variable age is not included in the method parameters
    }//Person setInfo method close

    //? You need to include the toString method in order to print
            //?? Use shortcut: right-click >> Generate >> toString()
    public String toString() {
        return "Class07_Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }//toString close

}//class
