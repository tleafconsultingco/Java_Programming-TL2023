package utilities;//import day27_accessModifiers.Class03_Data;

//import static day27_accessModifiers.Class03_Data.d;
//!! Will only import the static variable d, now the class name is not necessary
//import static day27_accessModifiers.Class03_Data.method3;
//!! Will only import the static method3, now the class name is not necessary

//!! To access all the static members, apply the wild import
import static day27_accessModifiers.Class03_Data.*;
public class Day27_Class05_Test {
    public static void main(String[] args) {

        System.out.println(d); //!! Since I imported the static member directly, I don't need to call the class

        method3();

        System.out.println(e);
        System.out.println(f);

        method4();

        //!! Will not be able to use instance variables and methods
        /*
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        method1();
        method2();
        */



    }//main
}//class
