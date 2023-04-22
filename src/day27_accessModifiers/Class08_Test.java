package day27_accessModifiers;

public class Class08_Test {

    //? Will the variables under the static block (from Class07_StaticInitializationBlock) be executed first?

    public static void main(String[] args) {

        System.out.println(Class07_StaticInitializationBlock.a); //100
        System.out.println(Class07_StaticInitializationBlock.b); //20.5
        System.out.println(Class07_StaticInitializationBlock.c); //Java

        System.out.println("-----");

        System.out.println(Class16_AccessModifiers.publicData); //!! public is accessible within same package
            //200

        System.out.println(Class16_AccessModifiers.protectedData); //!! protected is accessible within same package
            //300

        System.out.println(Class16_AccessModifiers.defaultData); //!! default is accessible within same package
            //400

        //System.out.println(AccessModifiers.privateData);
        // !! private is not accessible within same package

        new Class16_AccessModifiers();

        //!! only public, protected, and default are accessible w/in packages
        Class16_AccessModifiers.publicMethod();
            //Public
        Class16_AccessModifiers.protectedMethod();
            //Protected
        Class16_AccessModifiers.defaultMethod();
            //Default
        //Class16_AccessModifiers.privateMethod();


    }//main
}//class
