package day04_primitive_type_castings_concantenation;

public class Class04_Concatenation_vs_Addition {
    public static void main(String[] args){

        System.out.println("32" + 1); // 32 is treated as a string of text, you will get 321 not 33 bc it's concatenated

        System.out.println(7 + "1"); // 71 not 8

        System.out.println("13"+"2"); // 132 not 15

        System.out.println("-------------------");

        System.out.println(12+2.5); // 14.5 bc these are numbers on both right and left of + sign, not strings

        System.out.println("------------------");

        System.out.println("The value is " + true);

    }//main close
}//class close
