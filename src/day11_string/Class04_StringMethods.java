package day11_string;

public class Class04_StringMethods {

    public static void main(String[] args) {

        String str1 = "CYDEO SCHOOL";

        // TO LOWER CASE
        str1.toLowerCase(); // will return all the uppercase to lowercase, but does not change original variable


        System.out.println(str1); // will still return original, it cannot change the variable bc strings are immutable

        // how can I update the original variable to modified one? assign new value

        str1 = str1.toLowerCase();

        System.out.println(str1);

        System.out.println();
        System.out.println("-----------");
        // TO UPPER CASE

        String str2 = "java programming";

        str2.toUpperCase();

        // to change the variable you need to reassign

        str2 = str2.toUpperCase();
        // if you don't want to change value of this variable you can create a new variable

        String str3 = str2.toUpperCase();

        System.out.println(str2);
        System.out.println(str3);

        System.out.println();
        System.out.println("----------");
        // UPPER AND LOWER CASE

        String word = "Wooden Spoon";

        word.toUpperCase(); // new string is created "WOODEN SPOON"

        word.toLowerCase(); // new string is created "wooden spoon"

        // 3 total string objects have been created

        // when printed, it will still print the original object bc the other ones have not been assigned to the original variable

        word = word.toUpperCase(); // will reassign Wooden Spoon to "WOODEN SPOON"

        word = word.toLowerCase(); // will reassign WOODEN SPOON to "wooden spoon"

        System.out.println();
        System.out.println("-----------");
        // TRIM

        String str4 = "      Cydeo School";

        str4.trim(); // "Cydeo School", but will still return original str4 with spaces, you need to reassign string

        str4 = str4.trim();

        System.out.println(str4);

        System.out.println();
        System.out.println("-------------");
        // INDEX OF

        String sentence1 = "Today is Sunday, and we have Java Class";

        int index1 = sentence1.indexOf('w'); // will look for character from left to right

        System.out.println(index1); // 21


        String s1 = "I love Java Programming";

        int firstA = s1.indexOf('a');

        System.out.println(firstA);

        // what if I want to find the second a?
        int secondA = s1.indexOf("a "); // this will check all the characters in the string


        String s2 = "Java Python JavaScript Cydeo Python";

        int a1 = s2.indexOf('a');
        System.out.println(a1); // 1

        int a2 = s2.indexOf("a Python");
        System.out.println(a2); // 3

        int a3 = s2.indexOf("avaS");

        int a4 = s2.indexOf("aS");

        System.out.println();
        System.out.println("-------------");
        // LAST INDEX OF

        String w = "Java";

        System.out.println(w.indexOf('a')); // 1

        // what about the last a?
        System.out.println(w.lastIndexOf('a')); // 3, will start from right to left

        String w2 = "Java Python JavaScript Cydeo Python";

        System.out.println(w2.lastIndexOf('a')); // 15
        System.out.println(w2.lastIndexOf('P')); // 29






    }




}
