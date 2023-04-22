package day27_accessModifiers;

public class Class13_StaticBlock_vs_InstanceBlock_vs_Constructor {

    //- Constructor
    public Class13_StaticBlock_vs_InstanceBlock_vs_Constructor(){
        System.out.println("Constructor");
    }//constructor

    //- Instance block
    {
        System.out.println("Instance Block");
    }//instance block

    //- Static block
    static{
        System.out.println("Static Block");
    }//static block

    //? Difference
        //?? Constructor takes arguments
        //?? Instance/static blocks do not take arguments, you have to initialize the value
        //?? Static block only executes once, but does not depend on an object
        //?? Instance block depends on the object, executed for each
        //?? Constructor depends on the object, executed for each
        //?? Instance block is executed first



    public static void main(String[] args) {

        System.out.println("Main Method");

        new Class13_StaticBlock_vs_InstanceBlock_vs_Constructor();
        new Class13_StaticBlock_vs_InstanceBlock_vs_Constructor();

    }


}//class
