package day30_inheritance.typesOfInheritance;

import java.time.LocalDate;

public class Class11_TestPersonObjects {
    public static void main(String[] args) {

        Class07_Student student = new Class07_Student("Lucy", 'F', LocalDate.of(1990, 5, 16), 'A', "A01");

        Class09_President president = new Class09_President("Daniel", 'M', LocalDate.of(1980, 12, 1),LocalDate.of(2020, 1, 1));

        Class10_Teacher teacher = new Class10_Teacher("Emily", 'F', LocalDate.of(1985, 11, 1), "Math Teacher", "C1", 95000);


        System.out.println("student = " + student);
        System.out.println("president = " + president);
        System.out.println("teacher = " + teacher);

        student.study(); //Lucy is studying
        teacher.teach(); //Emily is teaching
        president.lie(); //Daniel is lying

        System.out.println("---------------------------------------------------");

        student.eat("Baklava"); //Lucy is eating Baklava
        teacher.eat("Kebab"); //Emily is eating Kebab
        president.eat("Donut"); //Daniel is eating Donut

        student.drink("Milk"); //Lucy is drinking Milk
        teacher.drink("Tea"); //Emily is drinking Tea
        president.drink("Coffee"); //Daniel is drinking Coffee

    }//main
}//class
