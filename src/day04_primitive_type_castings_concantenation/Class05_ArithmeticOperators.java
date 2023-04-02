package day04_primitive_type_castings_concantenation;

public class Class05_ArithmeticOperators {
    public static void main(String[] args){

        // Addition operator only works with numbers, not strings
        System.out.println(100+200); // 300

        // Subtraction operator is only used for subtraction
        System.out.println(40-10); // 30

        // Division will return int unless double is in num/denominator
        // Division cannot have 0 as denominator
        System.out.println(20/6); // 3
        System.out.println(20.0/6); // 3.33
        System.out.println(20/6.0); // 3.33
        System.out.println(20.0/6.0); // 3.33
        System.out.println(20d / 6); // 3.33 the 20 int is converted to a double bc of the 'd'
        // what if you want to convert the double to int? Cast it!
        System.out.println((int)(2.5/0.5)); // 5

        // Multiplication is used conventionally
        System.out.println(5*4); // 20

        // Modulus divides two values and returns the remainder
        // numerator - (denominator * integer result)
        System.out.println(10%3); // 1
        System.out.println(20%6); // 2
        System.out.println(15%4); // 3
        System.out.println(100%13); // 9
        System.out.println(100%10); // 0 evenly divisible
        System.out.println(45%8); // 5


    }//main close
}//class close
