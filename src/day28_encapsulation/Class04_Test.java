package day28_encapsulation;

public class Class04_Test {

    public static void main(String[] args) {

        Class03_Student student = new Class03_Student();

        // !! this has a private access modifier
        //student.age = -200;
        //System.out.println( student.age );

        //!! Using the setAge setter instance void method
        student.setAge(25);

        System.out.println( student.getAge());

        // !! this has a private access modifier
        //student.name = "Aaron";
        //student.setName("Aaron");

        System.out.println(student.getName());





    }//main


}//class
