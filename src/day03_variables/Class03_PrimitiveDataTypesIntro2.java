package day03_variables;

public class Class03_PrimitiveDataTypesIntro2 {

    public static void main(String[] args) {
        // DataType  variableName = Data;
        System.out.println("CHAR VARIABLE");
        System.out.println();
        char a = '@';
        System.out.println(a);
        char b = '!';
        System.out.println(b);

        // char ab = 'ab'; will result in compiler error because there are 2 characters
        System.out.println("----------------------------");
        char ch1 = 'A';
        System.out.println(ch1);

        char ch2 = 65; // this is result in "A"
        System.out.println(ch2);

        System.out.println("----------------------");

        char ch3 = 40000;
        System.out.println(ch3);

        System.out.println("------------------------");

        int sum = 'A' + 'B';
        System.out.println(sum); // will give you the sum of A and B
        // A is 65 and B is 66

        // char ch4 = -100; will result in a compiler error because it is out of range

        System.out.println("------------------------------");
        System.out.println();
        System.out.println("BOOLEAN VARIABLE");
        System.out.println();
        // boolean r1 = 123; compiler error bc it does not register integers
        // boolean r2 = 0.5; compiler error bc it does not register decimals
        // boolean r3 = "Java"; compiler error bc it does not register text

        boolean r4 = true;
        boolean r5 = false;

        boolean r6 = 100 > 1; // true
        boolean r7 = 0 < -1; // false

        System.out.println(r6);
        System.out.println(r7);






    }
}
