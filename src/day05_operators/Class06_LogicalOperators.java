package day05_operators;

public class Class06_LogicalOperators {
    public static void main(String[] args) {

        // Logical AND

        double salary = 90_000;
        int creditScore = 500;
        int age = 25;

        boolean eligibleForLoan = salary >= 30_000 && creditScore >= 650;
        //                        true                false              = false

        System.out.println("eligibleForLoan = " + eligibleForLoan);

        boolean eligibleForLoan2 = salary >= 30_000 && creditScore >= 650 && age >= 18;
        //                        true                false                 true      = false

        System.out.println("eligibleForLoan2 = " + eligibleForLoan2);

        System.out.println("--------------------------------");

        age = 18;
        String country = "Japan";

        boolean eligibleToVote = age >= 18 && country == "USA";
        System.out.println("eligibleToVote = " + eligibleToVote);


        System.out.println();
        System.out.println("----------------------------");

        String answer = "yes";

        // boolean validAnswer = answer == "yes" && answer == "no"; // this expression is not possible

        boolean validAnswer = answer == "yes" || answer == "no";
        //                    true               false          = true
        System.out.println("validAnswer = " + validAnswer);

        System.out.println("-----------------");

        char grade = 'B';

        boolean passedExam = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D';
        System.out.println("passedExam = " + passedExam);

        // boolean passedExam = grade == 'A' && grade == 'B' && grade == 'C' && grade && 'D'; // logical && does NOT work


        System.out.println();
        System.out.println("---------------------------");

        // Logical NOT operator

        System.out.println(true); // true
        System.out.println(!true); // false

        String a = "yes";

        boolean yes = a == "yes"; // true
        boolean no = !yes; // false

        System.out.println("yes = " + yes);
        System.out.println("no = " + no);

        String b = "happy";
        boolean isHappy = b == "happy"; // true
        boolean isNotHappy = !isHappy; // false

        System.out.println("isHappy = " + isHappy);
        System.out.println("isNotHappy = " + isNotHappy);

        System.out.println("-------------------------");

        int score = 64;

        boolean passed = score >= 65;
        boolean failed = !passed;

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);

        System.out.println();
        System.out.println("---------------------------");

        System.out.println(true == !false && false == !true && true != !true); // true
        //                      true              true              true




    }//main close
}//class close
