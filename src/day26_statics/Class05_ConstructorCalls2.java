package day26_statics;

public class Class05_ConstructorCalls2 {


    public Class05_ConstructorCalls2(){ // Default
        //?? This constructor can no longer call the overloaded int constructor since the int constructor calls this constructor (violates rule 5)
        System.out.println("Default");
    }//constructor

    public Class05_ConstructorCalls2(int a){  // Default, int arg
        this(); //!! calling the default constructor
        System.out.println("int arg");

    }//constructor

    public Class05_ConstructorCalls2(String a){ // Default, int arg, string arg
        this(10); //!! calling the constructor with int arg (that also calls the default)
        System.out.println("String arg");

    }//constructor

    public static void main(String[] args) {

        //- Create objects with constructors


        Class05_ConstructorCalls2 obj1 = new Class05_ConstructorCalls2();
            //Default

        Class05_ConstructorCalls2 obj2 = new Class05_ConstructorCalls2(10);
            //Default
            //int arg

        Class05_ConstructorCalls2 obj3 = new Class05_ConstructorCalls2("Java");
            //Default
            //int arg
            //String arg
    }//main


}//class
