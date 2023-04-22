package day26_statics;

public class Class04_ConstructorCalls {

    //- Create constructor
    public Class04_ConstructorCalls(){
        // this(9);
        System.out.println("Default constructor");
    }//constructor close

    public Class04_ConstructorCalls(int a){
        this();
        System.out.println("Constructor with int argument");
        //  this();
            //!! Constructor call has to be at the first step
    }//constructor close


    public Class04_ConstructorCalls(double b){
        System.out.println("Constructor with double argument");
    }//constructor close


    public Class04_ConstructorCalls(String c){
        this(2.5);
        // this();
            //!! Cannot call more than constructor w/in a constructor
        System.out.println("Constructor with String argument");
    }//constructor close


    public static void main(String[] args) {

        method1();
            //!! Will print "Method 1"

        method2();
            //!! Will execute method2(), then method1()
            //Method 2
            //Method 1

    }


    public static void method1(){
        // ConstructorCalls();
            //!! You cannot call constructor in this method
        // this();
            //!! You cannot use this(); keyword in the method bc constructors can only be called by constructors
        System.out.println("Method 1");
    }

    public static void method2(){
        System.out.println("Method 2");
        method1();
        // method2();
    }

}//class
