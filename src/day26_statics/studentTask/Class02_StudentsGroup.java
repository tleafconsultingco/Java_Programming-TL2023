package day26_statics.studentTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Class02_StudentsGroup { // StudentsGroup HAS a Student
    public String groupName;
    public int groupId;
    public ArrayList<Class01_Student> students = new ArrayList<>();
        //!! Better to use ArrayList so that we can have a dynamic size
        //!! Datatype of the ArrayList needs to be the Class01_Student class
        //!! Instance variables named students
        //!! Directly initialize the new ArrayList, or you can generate the constructor


    //- Creates the StudentsGroup object by setting the groupName and groupId
    public Class02_StudentsGroup(String groupName, int groupId) {
        this.groupName = groupName;
        this.groupId = groupId;
        //!! Using a constructor
            // students = new ArrayList<>(); // size : 0
    }

    //- Takes one student object, and adds it to the arraylist of students
    public void addStudent(Class01_Student student){
        students.add(student);
    }//addStudent


    //- Takes one array of students, and adds the array of students to the arraylist of students
    public void addStudent(Class01_Student[] students){
        this.students.addAll(Arrays.asList(students));
    } //addStudent


    //- takes name, age, gender, id of student info, creates student object by using the given info, then adds the student object to the arraylist of students
    public void addStudent(String name, int age, char gender, String id){
        //  Student student = new Student(name, age, gender, id);
        students.add( new Class01_Student(name, age, gender, id) );
    }//addStudent


    //- Takes the id and then removes the student object with the specified id from arraylist of students
    public void removeStudent(String id){
        students.removeIf( p -> p.id.equals(id) );
    }//removeStudent


    public String toString() {
        return "StudentsGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupId=" + groupId +
                ", number of students=" + students.size() +
                '}';
    }//toString()

}//class
/*
Create a custom class named StudentsGroup
	            Attributes:
	                groupName, groupId, students (ArrayList<Students>)

	            Add a constructor that can set the groupId and groupName
	                    initialize students arraylist in the constrcutor's body

	            Methods:
	                addStudent(Student): adds the specified student to the students arrayList

	                removeStudent(id): removes the student with the specified id from the students arraylist

	                toString(): displays the groupName, groupId and total number of students when a group object is passed in the print statement
 */