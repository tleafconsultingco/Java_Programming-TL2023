package utilities;

import day27_accessModifiers.Class03_Data;
import day27_accessModifiers.Class16_AccessModifiers;

public class Day27_Class04_Test {
    public static void main(String[] args) {

        //! Import the class from a package...imports everything

        //!! You can still access the class static variables
        System.out.println(Class03_Data.d);
        System.out.println(Class03_Data.e);
        System.out.println(Class03_Data.f);

        //!! You can still access the class static methods
        Class03_Data.method3();
        Class03_Data.method4();

        //!! You can still create objects with the instance variables from the class

        Class03_Data obj = new Class03_Data();
        System.out.println(obj.a);
        System.out.println(obj.a);
        System.out.println(obj.a);

        //!! You can still use instance methods from the class
        obj.method1();
        obj.method2();


        System.out.println("-- Access modifiers --");

        //?? public access modifier
        System.out.println(Class16_AccessModifiers.publicData); //!! Public is always accessible in different packages

        //?? protected access modifier
        //System.out.println(AccessModifiers.protectedData);
        // !! protected is NOT always accessible in different packages

        //?? default access modifier
        //System.out.println(AccessModifiers.defaultData);
        //!! default is not be accessible in different packages

        //?? private access modifier
        //System.out.println(AccessModifiers.privateData);
        //!! private is not accessible in different packages

        new Class16_AccessModifiers();


        Class16_AccessModifiers.publicMethod();
        //    AccessModifiers.protectedMethod();
        //    AccessModifiers.defaultMethod();
        //    AccessModifiers.privateMethod();

    }//main


}//class
