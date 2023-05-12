package utilities;

import day31_inheritance.Class09_ProtectedAccessModifier;

public class Day31_Class09_Test extends Class09_ProtectedAccessModifier {

    //? Accessing variables and methods with protected access modifier

    public static void main(String[] args) {

        //!! Not accessible variable and methods bc they are from another package
        //System.out.println(Class09_ProtectedAccessModifier.a);
        //Class09_ProtectedAccessModifier.method1());

        //! But when we make this class a subclass, then we can access the protected data

    }//main
}//class
