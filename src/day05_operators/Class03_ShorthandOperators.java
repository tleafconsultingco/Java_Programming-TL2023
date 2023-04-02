package day05_operators;

public class Class03_ShorthandOperators {
    public static void main(String[] args){

        // Assignment operator

        int a = 20;
        System.out.println(a); // will output 20
        System.out.println(a); // no change
        // What if after line 8 I no longer need the old value of a?

        a = 40; // I can change a declared variable
        System.out.println(a); // now will be 40

        a = 90;
        System.out.println(a);
        System.out.println();
        System.out.println("------------------");

        // Addition assignment operator

        // Example of bank balance

        double balance = 100;

        balance += 1000; // balance will be old value + added value
        System.out.println("balance = " + balance);

        balance += 500; // balance = 1100 + 500
        System.out.println("balance = " + balance);

        balance += 10_000;
        System.out.println("balance = " + balance); // 11600

        // Subtraction assignment operator

        balance -= 1000; // balance = 11600 - 1000
        System.out.println("balance = " + balance); // 10600

        balance -= 5000; // balance - 10600 - 5000
        System.out
                .println("balance = " + balance); // 5600

        System.out.println();
        System.out.println("-----------------");

        // Multiplication assignment operator

        // Salary example

        double salary = 45000;

        // after the first year your salary will double
        salary *= 2; // salary = 45000 * 2
        System.out.println("salary = " + salary); // 90000

        // now salary is tripled
        salary *=3; // 90000 * 3
        System.out.println("salary = " + salary); // 270000

        System.out.println();
        System.out.println("------------------------");

        // Eth example

        double eth = 4;

        eth *= 250; // increases by 250x
        System.out.println("eth = " + eth); // 1000

        System.out.println();
        System.out.println("---------------------");

        // Division assignment operator

        salary /=2; // salary got cut in half, 270000 / 2
        System.out.println("salary = " + salary); // 135000

        eth /= 2; // crashed by half, 1000 / 2
        System.out.println("eth = " + eth); // 500

        System.out.println();
        System.out.println("--------------------");

        // Remainder assignment variable

        int b = 39;

        b %= 7; // b = 39 % 7
        System.out.println("b = " + b); // 4


    }//main close
}//class close

