package day29_inheritance.encapsulation;

public class Class01_Student {

    //- Private instance variables
    private String name, schoolName;
    private int age;
    private char gender, grade;

    Class01_Student(String name, int age, char gender, char grade, String schoolName){
        setName(name);
        setAge(age);
        setGender(gender);
        setGrade(grade);
        setSchoolName(schoolName);
    }//constructor

    public String getName(){
        if (name == null){
            name = "Unknown";
        }//if
        return name;
    }//getName

    public void setName(String name){
        if (name.isEmpty() || name.isBlank()){
            System.err.println("Name cannot be empty or blank");
            System.exit(1);
        }//if
        this.name = name;
    }//setName

    public int getAge(){
        return age;
    }//getAge

    public void setAge(int age){
        if (age <0){
            System.err.println("Age cannot be less than 0");
            System.exit(1);
        }//if
        if (age <5 || age >90){
            System.err.println("Invalid student age: "+age);
            System.exit(1);
        }//if
        this.age = age;
    }//setAge

    public char getGender(){
        return gender;
    }//getGender

    public void setGender(char gender){
        if (gender == 'M' || gender == 'F'){
            this.gender = gender;
        }else{
            System.err.println("Invalid gender: "+gender);
            System.exit(1);
        }//if-else
    }//setGender

    public char getGrade(){
        return grade;
    }//getGrade

    public void setGrade(char grade){
        boolean isValid = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F';

        if(isValid) {
            this.grade = grade;
        }else{
            System.err.println("Invalid grade: "+grade);
            System.exit(1);
        }//if-else

        /*
        //!! Alternative way
        if (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F'){
            this.grade = grade;
        }else{
            System.err.println("Invalid grade: "+grade);
            System.exit(1);
        }//if-else
         */

    }//setGrade

    public String getSchoolName(String schoolName){
        if (schoolName == null){
            schoolName = "Unknown";
        }//if
        return schoolName;
    }//getSchoolName

    public void setSchoolName(String schoolName){
        this.schoolName = schoolName;
    }//setSchoolName

    public void study(){
        System.out.println(name+" is studying at "+schoolName);
    }//study

    @Override
    public String toString() {
        return "Class01_Student{" +
                "name='" + name + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                '}';
    }//toString



}//class
/*
    1. Create a class named Student:
            private variables:
                name, age, gender, grade, schoolName

            Encapsulate all the fileds (at leat encapsulate two fields manually)
                    requirments:
                        1. age can not be less than 5 or greater than 90
                        2. gender should not be set to any chanarcter other than: 'M' and 'F'
                        3. grade should not be set to any chanacters other than: 'A', 'B', 'C', 'D', and 'F'

            Add a constructor that can set all teh fields when the object is created
                        (requirments of fileds in the above must be applied)


            Methods:
                study()
                toString()
 */