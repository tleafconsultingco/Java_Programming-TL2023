package day27_accessModifiers;

public class Class11_InstanceBlock {

    //- Instance block
    {
        System.out.println("Instance block");
    }

    //- Constructor
    public Class11_InstanceBlock(){
        System.out.println("Constructor");
    }

    //- Creating objects
    public static void main(String[] args) {

        new Class11_InstanceBlock();
            //Instance block
            //Constructor
        new Class11_InstanceBlock();
            //Instance block
            //Constructor
        new Class11_InstanceBlock();
            //Instance block
            //Constructor
    }//main


}//class
