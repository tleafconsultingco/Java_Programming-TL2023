package day14_forLoop;

public class Practice03_CalculateSum {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 50; i++) {
            sum += i;
        }
        System.out.println(sum);

    }

}
/*
write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275
 */