package day15_whileLoop;
import java.util.Scanner;

public class Class04_MaxAndMinNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int max = -2147483648; // smallest integer in Java bc then all your inputs will be greater than this and be reassigned to variable max
        int min = 2147483647; // largest integer in Java bc then all your inputs will be less than this and be reassigned to variable min


        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Number");
            int num = input.nextInt();

            // 2 separate if statements for max and min
            if(num > max){
                max = num;
            }

            if (num < min){
                min = num;
            }


        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        input.close();

    }





}
