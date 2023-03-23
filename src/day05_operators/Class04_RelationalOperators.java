package day05_operators;

public class Class04_RelationalOperators {
    public static void main(String[] args){

        // Greater than operator
        int a = 1000;
        int b = 200;

        System.out.println(a>b); // true
        System.out.println(b>a); // false

        // System.out.println(a>b);
        boolean aIsGreater = a>b;

        System.out.println(aIsGreater); // true

        System.out.println();
        System.out.println("------------------------");
        // Greater than or equal operator

        int score = 50;
        boolean passed = score >= 60; // as long as score is 60 or greater it will return true
        System.out.println("passed = " + passed);

        System.out.println("------------------------");

        int age= 21;
        boolean eligibleToBuyAlcohol = age >=21;
        System.out.println("eligibleToBuyAlcohol = " + eligibleToBuyAlcohol);

        boolean eligibleToVote = age >=18;
        System.out.println("eligibleToVote = " + eligibleToVote);


        System.out.println("---------------");
        System.out.println(100 > 100); // false
        System.out.println(100 >= 100); // true
        System.out.println(100 >= 185); // false

        System.out.println();
        System.out.println("------------");

        // Less than operator

        score = 48;

        boolean failed = score < 65;
        System.out.println("failed = " + failed);

        System.out.println("------------------");

        System.out.println(100 < 2000); // true
        System.out.println(100 < 20); // false


        System.out.println();
        System.out.println("------------------");
        // Less than or equal operator

        System.out.println(95 <=100); // true
        System.out.println(100 <= 100); // true
        System.out.println(10 <= 5); // false

        System.out.println("-----------------------");

        System.out.println('a' > 'b'); // false
        // char works because every character has a value based on ASCII, the number of the character is used
        // a = 65, b = 66

        // System.out.println("Java" <= "C#"); // compiler error bc relational operators are only applicable to numbers




    }

}
