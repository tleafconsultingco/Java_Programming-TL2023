package day27_accessModifiers;

public class Class09_CydeoStudent {

    //!! Instance variables
    public String name;
    public int age;
    public char gender;

    //!! Static variables
    public static String schoolName;
    public static String secretCode;


    //! Set instance variables seperately with constructor
    public Class09_CydeoStudent(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
        //!! 1. You don't need to include static variables w/in constructor bc it will only need to be initialized once
        //schoolName = "Cydeo School";
        //secretCode = "Wooden Sppon";
    }//constructor

    //!! 2. Instead, initialize them in a static block
    //?? This means that all the student objects share the same static variables
    static{
        schoolName = "Cydeo School";
        secretCode = "Wooden Spoon";
    }//static

    //! toString() for printing

    public String toString() {
        return "Class09_CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}//class
