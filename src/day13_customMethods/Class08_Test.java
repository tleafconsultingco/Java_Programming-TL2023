package day13_customMethods;

import java.util.Scanner;

public class Class08_Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt(); // this takes input AND returns value
        input.close(); // return type is void since it is closing statement, cannot be assigned to any datatype since it does not return a value

        System.out.println(); // return type is void, cannot be assigned to a datatype, the method doesn't give you data, it just prints


        String str = "Java"; //
        str.toUpperCase(); //return value is string



    }

}
