package day36_polymorphism;

import day30_inheritance.Class02_IPhone;

public class Class04_TestEqualMethods {


    public static void main(String[] args) {

        Class03_Circle circle1 = new Class03_Circle(5);
        Class03_Circle circle2 = new Class03_Circle(5);
        Class03_Circle circle3 = new Class03_Circle(15);

        //!! this evaluates if the memory allocation is the same
        System.out.println(circle1 == circle2); //false

        //!! this equals method is overridden in the Circle class, it will provide the implementation from that class
            //?? based on the overridden method, it will first check if obj is an instance of Circle class...since it is not, it will go to next if statement to compare radius
        System.out.println( circle1.equals(circle2) ); //true
        System.out.println (circle1.equals(circle3) );  //false


        System.out.println("----------------------------------------------------------");

        Class05_IPhone iphone1 = new Class05_IPhone("Apple", "Iphone 12", "Medium", "Black", 900);
        Class05_IPhone iphone2 = new Class05_IPhone("Apple", "Iphone 12", "Medium", "White", 900);

        System.out.println( iphone1.equals(iphone2) ); //true





    }
}//class
