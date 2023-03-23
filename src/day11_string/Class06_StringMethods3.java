package day11_string;

public class Class06_StringMethods3 {
    public static void main(String[] args) {

        // IS EMPTY and IS BLANK

        String word = "Java";

        boolean r1 = word.isEmpty();
        System.out.println(r1); // false

        String str = "       ";
        boolean r2 = str.isEmpty();
        boolean r3 = str.isBlank();

        System.out.println("r2 = " + r2); // false, spaces are characters
        System.out.println("r3 = " + r3); // true

        System.out.println();
        System.out.println("-------------");
        // IS EQUAL

        String str1 = "Cydeo";
        String str2 = new String("Cydeo");
        // these are not the same objects
        System.out.println(str1 == str2); // false, these are separate even though they say the same thing

        System.out.println(str1.equals(str2)); // true based on the text alone, not bc they are objects. it doesn't ignore case sensitivity

        String str3 = new String("cydeo");
        System.out.println(str2.equals(str3)); // false bc of case sensitivity

        System.out.println();
        System.out.println("----------");
        // EQUAL IGNORE CASE

        String s1 = "JAVA";
        String s2 = "java";
        System.out.println(s1.equals(s2)); // false
        System.out.println(s1.equalsIgnoreCase(s2)); // true

        System.out.println();
        System.out.println("-------------");
        // CONTAINS

        String students = "Hasan Naran Sumey Natalia";

        boolean hasAhmed = students.contains("Ahmed");
        System.out.println("hasAhmed = " + hasAhmed); // false

        String sentence = "My favorite programming language is JAVA";

        boolean hasJava = sentence.contains("Java");
        System.out.println(hasJava); // false, this is case sensitive
        // to ignore case sensitivity
        // boolean hasJava = sentence.toLowerCase().contains("java");

        System.out.println();
        System.out.println("-------------");
        // STARTS WITH

        String name = "Michael";

        boolean l = name.startsWith("Da");
        System.out.println(l); // false

        String url = "www.cydeo.com";

        boolean isValid = url.startsWith("www.");
        System.out.println(isValid); // true



        System.out.println();
        System.out.println("------------");
        // ENDS WITH

        boolean t = url.endsWith(".com");
        System.out.println(t); // true

        String email = "CydeoSchool@gmail.com";

        boolean isGmail = email.endsWith("gmail.com");
        System.out.println(isGmail); // true

        boolean isYahoo = email.endsWith("yahoo.com");
        System.out.println(isYahoo); // false



    }
}
