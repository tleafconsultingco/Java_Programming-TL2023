package day10_string;

import java.util.Scanner;
import java.lang.String; // this is implicitly applied under lang package

public class Class04_StringIntro {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = "Java";


        System.out.println();

        input.close();

        System.out.println();
        System.out.println("---------------");
        // Creating a new string object by string literal

        String s1 = "Cat";
        String s2 = "Dog";

        String s3 = "Cat";
        String s4 = "Cat";

        // The heap holds all the variables, but only holds them once (even if used in different variables)

        System.out.println(s1 == s3); // true
        System.out.println(s1 == s4); // true
        System.out.println(s3 == s4); // true


        System.out.println();
        System.out.println("-----------");
        // Creating a new string object by new keyword


        String str1 = new String("Java"); // creates 2 objects: 1 in the string pool, and 2 in heap (outside string pool)

        String str2 = new String("Java");

        System.out.println(str1 == str2); // false

        System.out.println();
        System.out.println("-------------");

        String t1 = "Python";
        String t2 = new String("Python");
        String t3 = new String("Python");

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        // all return "Python"

        System.out.println(t1==t2); // false
        System.out.println(t2==t3); // false
        System.out.println(t1==t3); // false




    }


}
