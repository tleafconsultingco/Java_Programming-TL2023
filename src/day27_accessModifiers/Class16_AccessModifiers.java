package day27_accessModifiers;

public class Class16_AccessModifiers {

    //- Declare 3 variables and 3 methods
    //? Test in the Class08_Test class

    public static int publicData = 200;
        //!! Accessible w/in the same class (this one)
        //!! Accessible w/in the same package (Class08_Test under day27_accessModifiers)
        //!! Accessible across packages (Day27_Class04_Test under utilities package)

    protected static int protectedData =300;
        //!! Accessible w/in the same class (this one)
        //!! Accessible w/in the same package (Class08_Test under day27_accessModifiers)
        //!! NOT accessible across packages (Day27_Class04_Test under utilities package)

    static int defaultData = 400; //!! No keyword when creating a default access modifier
        //!! Accessible w/in the same class (this one)
        //!! Accessible w/in the same package (Class08_Test under day27_accessModifiers)
        //!! NOT accessible across packages (Day27_Class04_Test under utilities package)
    private static int privateData = 500;
        //!! Accessible w/in the same class (this one)
        //!! NOT accessible w/in the same package (Class08_Test under day27_accessModifiers)
        //!! NOT accessible across packages (Day27_Class04_Test under utilities package)

    //- Constructor
    public  Class16_AccessModifiers(){

    }

    //- Static method -- public
    public static void publicMethod(){
        System.out.println("Public");
    }

    //- Static method -- protected
    protected static void protectedMethod(){
        System.out.println("Protected");
    }

    //- Static method -- default
    static void defaultMethod(){
        System.out.println("Default");
    }

    //- Static method -- private
    private static void privateMethod(){
        System.out.println("Private");
    }

    public static void main(String[] args) {

        System.out.println(publicData);  //!! public is accessible within same class
            //200
        System.out.println(protectedData); //!! protected is accessible within same class
            //300
        System.out.println(defaultData); //!! default is accessible within the same class
            //400
        System.out.println(privateData); //!! private is accessible within the same class
            //500


        new Class16_AccessModifiers();
            //!! All methods are accessible w/in this class
        publicMethod();
            //Public
        protectedMethod();
            //Protected
        defaultMethod();
            //Default
        privateMethod();
            //Private

    }//main


}//class
