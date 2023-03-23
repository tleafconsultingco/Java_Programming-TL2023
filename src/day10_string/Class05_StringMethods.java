package day10_string;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Class05_StringMethods {

    public static void main(String[] args) {


        // char method
        String str = "Cydeo";
        // index: 01234

        char firstChar = str.charAt(0);
        System.out.println("firstChar = " + firstChar);

        char secondChar = str.charAt(1);
        System.out.println("secondChar = " + secondChar);

        char thirdChar = str.charAt(2);
        System.out.println("thirdChar = " + thirdChar);

        char fourthChar = str.charAt(3);
        System.out.println("fourthChar = " + fourthChar);

        char fifthChar = str.charAt(4);
        System.out.println("fifthChar = " + fifthChar);

        System.out.println();
        System.out.println("--------");
        // Length method

        String sentence = "Java Programming Language"; // I don't want to count how many index numbers so I can use length function

        int length = sentence.length();

        System.out.println(length); // 25

        int lastIndex = length - 1;

        System.out.println(lastIndex);

        System.out.println();
        System.out.println("-----------");

        String s1 = "Wooden Spoon";

        char first = str.charAt(0); // first character

        int lastIndexNum = s1.length()-1; // these two lines will get you the last character no matter what the input is
        char last = s1.charAt(lastIndexNum);

        System.out.println(first+" "+last);


        System.out.println();
        System.out.println("------------");
        // Equals method

        String name1 = "Umran"; // this string object goes to the string pool
        String name2 = new String("Umran"); // this string object goes to the string heap

        System.out.println(name1 == name2); // false, but this is not the right way to see if the objects are the same

        // instead use this

        System.out.println(name1.equals(name2)); // true, they are the same but from different places

        System.out.println();

        String r1 = "Java";
        String r2 = "Java";
        String r3 = new String("Java");

        System.out.println(r1==r2); // true, r1 and r2 are the same object
        System.out.println(r1==r3); // false since the objects are different
        System.out.println(r2==r3); // false since the objects are different

        System.out.println(r1.equals(r2)); // true since the text is the same
        System.out.println(r1.equals(r3)); // true
        System.out.println(r2.equals(r3)); // true

        System.out.println();
        System.out.println("-------------");

        Scanner input = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = input.nextInt();

        System.out.println("Are you a US citizen? Yes/No");
        String answer = input.next();

        // if(age >=21 && answer == "yes"){ // this does not work bc it's seeing if it's the same object, not text
             // instead use...
            if(age >=21 && answer.equals("yes")){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible to vote");
        }

            input.close();

    }


}
