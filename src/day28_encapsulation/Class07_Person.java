package day28_encapsulation;

import java.time.LocalDate;

public class Class07_Person {

    private String name;
    private int age;
    private char gender;
    private LocalDate dateOfBirth;


    public Class07_Person(String name, int age, char gender, LocalDate dateOfBirth) {
        setName(name);
        setAge(age);
        setGender(gender);
        setDateOfBirth(dateOfBirth);
    }

    //-- Name
    public String getName(){
        if (name == null || name.isBlank() || name.isEmpty()){
            return "Unknown";
        }//if
        return name;
    }//getName
    public void setName(String name){
        if (name == null || name.isBlank() || name.isEmpty()){
            System.err.println("Name canoot be blank or empty");
            System.exit(1);
        }//if
        this.name = name;
    }//setName

    //-- Age
    public int getAge(){
        return age;
    }//getAge

    public void setAge(int age){
        if (age <0 || age >120){
            System.err.println("Invalid age: "+age);
            System.exit(1);
        }//if
        this.age = age;
    }//setAge

    //-- Gender
    public char getGender(){
        return gender;
    }//getGender

    public void setGender(char gender){
        if (gender != 'M' || gender != 'F'){
            System.err.println("Gender must be M or F");
            System.exit(1);
        }//if
        this.gender = gender;
    }//setGender

    //-- Date of Birth
    public LocalDate getDateOfBirth(){
        return dateOfBirth;
    }//getDateOfBirth

    public void setDateOfBirth(LocalDate dateOfBirth){
        if (dateOfBirth.isAfter(LocalDate.of(2023,04,22))){
            System.err.println("Date of birth cannot be in the future");
            System.exit(1);
        }//if
        this.dateOfBirth = dateOfBirth;
    }//setDateOfBirth

    public String toString() {
        return "Class07_Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}//class
/*
Variables:
    name, age, gender, dateOfBirth
        name:
            Write: can not be null/empty/blank
            Read: if name is not, return "Unknown" instead
        age:
            Write: age can not be less than zero or greater than 120
        gender:
            Write: gender can only be 'M' or 'F'
        dateOfBirth:
            Write:  can not be after today's date
    Add a constructor that can set all the fields
    Add toString()
 */
