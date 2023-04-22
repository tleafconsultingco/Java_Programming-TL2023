package day26_statics.studentTask;

public class Class03_TestObjects {
    public static void main(String[] args) {

        Class01_Student student1 = new Class01_Student("Yusuf", 21, 'M', "A16");

        Class01_Student student2 = new Class01_Student("Glenio", 24, 'M', "B34");
        Class01_Student student3 = new Class01_Student("Sumeyye", 22, 'F', "C56");
        Class01_Student student4 = new Class01_Student("Mehmet", 25, 'M', "D43");
        Class01_Student student5 = new Class01_Student("Sebastian", 23, 'M', "E27");

        Class01_Student[] students = {student2, student3, student4, student5};


        Class02_StudentsGroup group1 = new Class02_StudentsGroup("Java Turtles",  1);

        group1.addStudent(student1);

        group1.addStudent(students);

        group1.addStudent("Khashayar", 34, 'M', "F35");

        System.out.println("group1 = " + group1);

        group1.removeStudent("D43");
        group1.removeStudent("E27");

        System.out.println("group1 = " + group1);


        for (Class01_Student each : group1.students) {
            System.out.println(each.name +" : " + each.id);
        }

        System.out.println("------------------------------------------");

        Class02_StudentsGroup group2 = new Class02_StudentsGroup("Java Turtles",  1);

        Class02_StudentsGroup group3 = new Class02_StudentsGroup("Java Turtles",  1);

        Class02_StudentsGroup group4 = new Class02_StudentsGroup("Java Turtles",  1);

        Class02_StudentsGroup[] groups = {group1, group2, group3, group4};




    }




}//class
/*
Create a class named TestObjects
	            3.1 Create 5 Student objects
	            3.2 Create a StudentGroup object
	            3.3 Add all the student objets to the StudentsGroup object' students list
 */