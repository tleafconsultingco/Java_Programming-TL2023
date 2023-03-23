package day03_variables;

public class Class02_PrimitiveDataTypesIntro {
    public static void main(String[] args) {
        // Syntax, to declare a variable data type
        // DataType  variableName = Data;

        // byte a; can only store integer values (-128 - 127)
        // byte a = "Java"; will create a compiler error (not integer)
        // byte a = 20.5; will create a compiler error (decimal)
        // byte a = 2000; will create a complier error (out of range)
        // byte a = 20; // acceptable because it's an integer w/in range

        // EXAMPLE: price of the care is $17,500 will need to use short
        short p = 17500; // now we can just call this variable instead of the number value
        System.out.println("p"); // this will run "p" as text and not as the variable p
        System.out.println(p);

        // EXAMPLE: salary is $95,000 will need to use int
        int s = 95000;
        System.out.println(s);

        // int n = 9999999999; will result in a compiler error
        long n = 9999999999L; // adding l or L will accept the value as long and not int (int is preferred)
        System.out.println(n);

        // EXAMPLE: gpa is 3.5
        double gpa = 3.5;
        System.out.println(gpa); // preferred primitive type

        // float gpa2 = 3.5; will result in compiler error because it prefers double if the value is w/in range
        float gpa2 = 3.5F; // adding f or F will accept the value as float and not double (double is preferred)


    }

    }
