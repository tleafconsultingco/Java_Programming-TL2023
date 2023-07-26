package day29_inheritance.encapsulation;

public class Class02_TestStudentObjects {

    public static void main(String[] args) {

        Class01_Student student1 = new Class01_Student("Hamza", 26, 'M', 'A', "MIT");

        Class01_Student student2 = new Class01_Student("Test",21,'F','A',"Cydeo");

        System.out.println(student1);
            //Class01_Student{name='Hamza', schoolName='MIT', age=26, gender=M, grade=A}
        System.out.println(student2);

        //!! Change name and grade
        student1.setSchoolName("Harvard");
        student1.setGrade('B');

        System.out.println(student1);
            //Class01_Student{name='Hamza', schoolName='Harvard', age=26, gender=M, grade=B}



    }

}
