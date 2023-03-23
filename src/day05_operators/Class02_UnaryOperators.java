package day05_operators;

public class Class02_UnaryOperators {
    public static void main(String[] args){

        // pre increment/decrement
        int x = 10;
        System.out.println(++x); // 11, this will increase the value by 1
        System.out.println(x); // 11, bc it was changed previously

        int y = 100;
        System.out.println(--y); // 99
        System.out.println(y); // 99

        System.out.println("----------------------------");
        System.out.println();

        // post increment/decrement
        int a = 50;
        System.out.println(a++); // 50, same as the old value
        System.out.println(a); // 51, now it increases by 1

        int b = 25;
        System.out.println(b--); // 25, same as the old value
        System.out.println(b); // 24

        System.out.println("---------------------------");
        int n = 30;
        int m = n++; // m = 30
        System.out.println("m = " + m);
        // moving forward it will be increased by 1
        System.out.println("n = " + n); // n = 31

        int z = 60;
        // I want to give post decrement of z to variable q
        int q = z-- ; // q = 60, then z will be 59
        System.out.println("z = " +z);
        System.out.println("q = " +q);



    }
}
