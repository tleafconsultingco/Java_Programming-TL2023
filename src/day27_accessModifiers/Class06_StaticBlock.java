package day27_accessModifiers;

public class Class06_StaticBlock {

    //- Constructor with static block
        //-- Executed each time a new object is created
    public Class06_StaticBlock(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Main method");

        //!! Still only runs once even when multiple objects are created
        new Class06_StaticBlock();
        new Class06_StaticBlock();
        new Class06_StaticBlock();


    }//main

    //- Static block
    static{
        System.out.println("Static Block");
    }//static

    //@@ Static block runs FIRST, and is only executed ONCE



}//class
