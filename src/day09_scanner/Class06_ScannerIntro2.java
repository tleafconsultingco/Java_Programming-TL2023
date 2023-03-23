package day09_scanner;
import java.util.Scanner;

public class Class06_ScannerIntro2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first decimal number: ");
        float num1 = input.nextFloat();

        System.out.println("Enter your second decimal number: ");
        double num2 = input.nextDouble();
        // remember you can input an integer even though you are calling float and double, bc it can be implicitly cast, but the output will be in a decimal

        System.out.println("Enter true or false: ");
        boolean r = input.nextBoolean();

        input.close();

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("r = " + r);







        




    }







}
