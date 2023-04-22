package week02_day04_06;

public class Class03_OperatorExamples {
    public static void main(String[]args){

        int age = 10;
        age++; // increases the value of age by 1
        System.out.println("age = " + age);

        System.out.println("(age++) = " + (age++)); // this prints age first then add 1 to the value

        int num = 5;
        System.out.println("++num = " + ++num); // 6, + 1 to the num
        System.out.println("num++ = " + num++); // 6, read num then add 1

        int x = 15;
        int y = x++;
        System.out.println("x = " + x); // 16
        System.out.println("y = " + y); // 15

        int z = 90;
        int w = --z;
        System.out.println("z = " + z); // z=90 -> 89
        System.out.println("w = " + w); // w=89

        int a = 3;
        int b = 5;
        a++;
        /*
        a==;
        int c = a + b;
        is the same as
        int c = ++a +b
         */
        int c = a + b; // 3+5

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        System.out.println();
        System.out.println("-----------------");

        // Best buy example
        System.out.println("BEST BUY EXAMPLE");
        int tvs = 50;
        System.out.println("someone comes in and buys a tv " + tvs);
        tvs -= 1;
        // other options, these all subtract 1
            // tvs = tvs -1 ;
            // tvs--;
            // --tvs;
        System.out.println("number of TVS is now: " + tvs);

        System.out.println("person 2 came in and bought a tv");
        System.out.println("number of tvs is now: " + --tvs); // 48
        System.out.println("person 3 came in and put the tv in their cart");
        System.out.println("how many tvs are still in the store: " + tvs--); // prints 48 first, then decrements, but this already accounts for 1 being subtracted
        System.out.println("they bought it, how many left in the store: " + tvs); // 47

        System.out.println("The store gets a shipment");
        tvs += 10;
        System.out.println("The store now has: " + tvs + " tvs");


    }




}
