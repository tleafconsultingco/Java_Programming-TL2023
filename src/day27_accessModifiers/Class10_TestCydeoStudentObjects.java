package day27_accessModifiers;

public class Class10_TestCydeoStudentObjects {

    public static void main(String[] args) {



        //!! Use constructor to create new objects
        Class09_CydeoStudent student1 = new Class09_CydeoStudent("Ekaterina", 29, 'F');
        Class09_CydeoStudent student2 = new Class09_CydeoStudent("Alena", 28, 'F');

        System.out.println("student1 = " + student1);
            //student1 = Class09_CydeoStudent{name='Ekaterina', age=29, gender=F}
        System.out.println("student2 = " + student2);
            //student2 = Class09_CydeoStudent{name='Alena', age=28, gender=F}

        //!! You can call the static variables through the objects...but it's better to call them through the class
/*
        System.out.println(student1.schoolName);
        System.out.println(student2.schoolName);
        System.out.println(student1.secretCode);
        System.out.println(student2.secretCode);
*/

        //!! Call the static variables through the class (are executed through the static block)
        System.out.println(Class09_CydeoStudent.schoolName); //Cydeo School
        System.out.println(Class09_CydeoStudent.secretCode); //Wooden Spoon

    }//main
}//class
