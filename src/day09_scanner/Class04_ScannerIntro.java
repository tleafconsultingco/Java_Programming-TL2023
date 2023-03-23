package day09_scanner;

import java.sql.SQLOutput;
import java.util.Scanner; // java is package, util is subpackage, Scanner is class
// java.util.*; // this will import everything from java.util package

// both can import scanner, but it's better to go with the regular import bc it will only give you scanner as opposed to wild import that will give you everything in the package

public class Class04_ScannerIntro {

    public static void main(String[] args) {

        // declare Scanner


        Scanner input = new Scanner(System.in); // for reading user inputs
        System.out.println("Enter your first number: ");
        byte num1 = input.nextByte(); // store into container so you can use it again
        // the next line won't be executed until you enter an input in the console

        System.out.println("Enter your second number: ");

        short num2 = input.nextShort();

        System.out.println("Enter your third number: ");

        int num3 = input.nextInt();

        System.out.println("Enter your fourth number: ");

        long num4 = input.nextLong();
        // int num4 = (int) input.nextLong(); // you can explicitly cast

        // you can close the scanner here
        input.close(); // scanner is closed, cannot use it to get user inputs again

        /*
        System.out.println("Enter your fifth number: "); // compiler error bc this will not be viable since we closed scanner
        int num5 = input.nextInt();
*/

        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        System.out.println("Third number: " + num3);
        System.out.println("Fourth number: " + num4);
        // System.out.println("Fifth number: " + num5);


    }

}
