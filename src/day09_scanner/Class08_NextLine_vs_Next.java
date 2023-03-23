package day09_scanner;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Class08_NextLine_vs_Next {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = input.nextInt(); // ex: 45\n only reads this to the last digit, still need to add Enter. Enter key is placed in scanner's memory

        // need to take out the Enter key that is left in the scanner's memory, you need to call it out
        input.nextLine(); // this will take out the Enter key

        System.out.println("Enter your full name: ");
        String name = input.nextLine(); // this does not allow you to provide an input


        input.close();

        System.out.println("age = " + age);
        System.out.println("name = " + name);








    }
}
