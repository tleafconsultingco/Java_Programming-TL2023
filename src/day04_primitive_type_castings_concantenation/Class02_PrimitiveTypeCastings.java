package day04_primitive_type_castings_concantenation;

public class Class02_PrimitiveTypeCastings {
    public static void main(String[] args) {
        // ---------- Implicit Casting ------------------

        byte a = 15;

        short b = a; // implicit casting example
        // since it is a smaller primitive type going to large you don't need () before 'a'
        // short b = (short)a;

        System.out.println(b);

        int c = a; // implicit casting example

        long d = 3000L; // add L to indicate that it's a long variable and not int variable

        float f = d; // float can hold value of long, implicit casting


        // ----------- Explicit Casting -----------------

        int x = 100;
        // needs to be assigned to another variable, x
        // byte y = x; // compiler error bc byte is smaller than int
        // byte y = (short)x; // compiler error bc short is still larger than byte
        byte y = (byte) x; // best to use the same type of variable for the operator


        // float z = 20.8; // compiler error bc it is double by default and that range is larger than float
        // how do we make sure compiler takes this as a float?
        float z = 20.8F; // add F to value to keep it as a float

        // short q = z; // compiler error bc float can't be directly assigned to short bc it's larger than short
        // short q = (int)z; // compiler error bc int is still larger than short
        short q = (short) z; // even though float value is cast to short, the value will remain the same
        // the value of variable q will have to be an integer, it will be changed to 20 (integer result)

        System.out.println(q);

        double n1 = 2.5;
        // double can only be implicitly cast to itself, it's the largest
        // byte n2 = n1; // compiler error bc double is larger than byte
        byte n2 = (byte) n1; // if n1 = 2.5, when cast to byte it will be 2 bc bytes only accept integers
        System.out.println(n2);

        // what if there is an int value that is greater than byte's max value?

        int num = 500;
        // byte result = num; // compiler error
        // byte can't contain the value of 500, so it will result in a neg number -12 (based on calculation)

        int r = 50_000; // this is out of short's range
        // short t = (short)r; the value is not equivalent to int bc it exceeds short's range

        double u = 3000.5;
        // int p = u; // double is larger than double
        int p = (int) u; // explicit casting

        System.out.println(p);

        int o = 100;
        double d1 = o;
        System.out.println(d1);


    }//main close
}//class close
