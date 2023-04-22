package day26_statics.studentTask;

public class Class01_Student {

    //? Create instance variables
    public String name;
    public int age;
    public char gender;
    public String id;

    public Class01_Student(String name, int age, char gender, String id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
    }//Class01_Student

    public void study(){
        System.out.println( name + " is studying");
    }//study

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                '}';
    }//toString()

}//class close
/*
1. Create a custom class named Student
            Attributes:
                name, age, gender, id
            Add a constructor that can set all the fields
            Methods:
                study()
                toString()
 */