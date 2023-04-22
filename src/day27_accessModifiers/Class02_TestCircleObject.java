package day27_accessModifiers;

public class Class02_TestCircleObject {

    public static void main(String[] args) {

        Class01_Circle circle1 = new Class01_Circle(3.5);
        Class01_Circle circle2 = new Class01_Circle(5);
        Class01_Circle circle3 = new Class01_Circle(7);

        System.out.println("circle1 = " + circle1);
            //circle1 = Class01_Circle{radius=3.5, diameter=7.0, pi=3.14, area=38.465, perimeter=21.98}
        System.out.println("circle2 = " + circle2);
            //circle2 = Class01_Circle{radius=5.0, diameter=10.0, pi=3.14, area=78.5, perimeter=31.400000000000002}
        System.out.println("circle3 = " + circle3);
            //circle3 = Class01_Circle{radius=7.0, diameter=14.0, pi=3.14, area=153.86, perimeter=43.96}

        //!! Static variables can still be called by objects, bc objects come from classes...but its not best practice to call statics through objects (call through the class)
        /*
        System.out.println(circle1.pi);
        System.out.println(circle2.pi);
        System.out.println(circle3.pi);
        */

        System.out.println("pi = "+Class01_Circle.pi); //pi = 3.14
        // System.out.println(Circle.radius);



    }//main

}//class
