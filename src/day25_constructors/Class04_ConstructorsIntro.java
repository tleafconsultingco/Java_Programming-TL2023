package day25_constructors;

public class Class04_ConstructorsIntro {

    //- Defining a constructor
    public Class04_ConstructorsIntro(){
        //!! Constructor name is the same as the Class name
        //!! There is no return type

        System.out.println("Object is created by using no argument constructor");
        //!! Every time you use this constructor to create an object, this statement will print
    }

    public Class04_ConstructorsIntro(int a){
        //!! This constructor is parameterized
        System.out.println("Object is created by using int argument constructor");
    }




    //- Defining a method
    public static void add(){
        //!! Can use any name to name the method
        //!! Has a return type

    }


    public static void main(String[] args) {


        //? We can create objects using this constructor
        new Class04_ConstructorsIntro();

        Class04_ConstructorsIntro  obj1 = new Class04_ConstructorsIntro(10);
            //Object is created by using int argument constructor

        Class04_ConstructorsIntro  obj2 = new Class04_ConstructorsIntro();
            //Object is created by using no argument constructor

        //!! Cannot use this constructor for String bc we didn't create a constructor for String
        // Class04_ConstructorsIntro obj3 = new Class04_ConstructorsIntro("Java");



    }//main
}//class
