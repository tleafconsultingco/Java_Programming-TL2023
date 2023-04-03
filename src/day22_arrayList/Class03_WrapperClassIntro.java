package day22_arrayList;

public class Class03_WrapperClassIntro {
    public static void main(String[] args) {

        //!! Demonstrating an implicit import for String class
        String str = "Java";

        //? What is the benefit of using a wrapper class?
        int a1 = 10; //?? This is primitive
            //!! This will not be supported in collections or maps data structures
        Integer a2 = 10; //?? This is a wrapper class

        System.out.println("----------- Autoboxing ----------");

        int b1 = 100; // primitive value

        //?? If I need to convert this primitive to an object, I can only convert it to its wrapper class object

        //! Autoboxing
        Integer b2 = b1; //!! Assign the primitive to wrapper class


        //!! There is no compiler error bc it's being implicitly cast to a larger primitive type
        double c1 = b1; //
        long c2 = b1;

        //!! However, you CANNOT use the wrong wrapper class
        // Long b3 = (long)b1; // compiler error since it's not the dedicated wrapper class for int
        // Double b4 = b1; // compiler error since it's not the dedicated wrapper class for int


        char ch = 'A';
        Character ch2 = ch; //!! autoboxing

        double d1 = 5.5;
        Double d2 = d1; //!! autoboxing

        System.out.println("--------- Unboxing --------------");
        //! Unboxing

        Integer n1 = 20;
        int n2 = n1;  //!! unboxing
        // long n3 = n1;
        // double n4 =n1;

        Character e1 = 'Z';
        char e2 = e1; //!! unboxing
        //!! Don't use other primitive data types, just the primitive that matches the wrapper class
        // int e3 = e1;
        // long e4 = e1;


    }//main close
}//class close
