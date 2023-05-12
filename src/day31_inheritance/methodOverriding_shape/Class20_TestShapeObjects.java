package day31_inheritance.methodOverriding_shape;

public class Class20_TestShapeObjects {

    public static void main(String[] args) {

        Class18_Square square = new Class18_Square(5);

        System.out.println("square = " + square);
            //square = Class18_Square{side=5.0}

        square.draw();
        //Drawing a Class18_Square:
        //	* * * * * *
        //	*         *
        //	*         *
        //	*         *
        //	*         *
        //	* * * * * *

        System.out.println("----------------------------");

        Class19_Circle circle = new Class19_Circle(3.5);

        System.out.println("circle = " + circle);
                //circle = Class19_Circle{name='Class19_Circle', radius='3.5', area='38.465', perimeter='21.98'}

    }//main

}//class
