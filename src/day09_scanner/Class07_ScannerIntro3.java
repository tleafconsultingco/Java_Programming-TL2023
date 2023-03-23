package day09_scanner;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Class07_ScannerIntro3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char ch = input.next().charAt(0); // Scanner does not have a method to get to char, but you can use the String method to get char

        System.out.println("You entered: "+ch);

        System.out.println("Would you like to continue?"); // expecting a yes/no answer
        String answer = input.next(); // will only read one word (until it reaches a space)

        System.out.println("You entered: "+answer);


        System.out.println("What are you struggling with? ");
        String answer2 = input.nextLine(); // this causes an issue if you run it after using next(), it does not allow you to provide input w/o executing next line of code

        System.out.println("You entered: "+answer2);


        input.close();






    }
}
