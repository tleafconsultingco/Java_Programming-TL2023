package day30_inheritance.typesOfInheritance;

import java.time.LocalDate;

public class Class07_Student extends Class06_Person{

    //- Private instance variables
    private char grade;
    private String studentId;

    //- Constructor
    public Class07_Student(String name, char gender, LocalDate DOB, char grade, String studentId) {
        super(name, gender, DOB);
        setGrade(grade);
        setStudentId(studentId);
    }//constructor

    //- Getter and setter methods
    public char getGrade(){
        return grade;
    }//getGrade

    public void setGrade(char grade){
        this.grade = grade;
    }//setGrade

    public String getStudentId(){
        return studentId;
    }//getStudentId

    public void setStudentId(String studentId){
        this.studentId = studentId;
    }//setStudentId

    public void study(){
        System.out.println(getName()+" is studying");
    }//study
}//subclass
