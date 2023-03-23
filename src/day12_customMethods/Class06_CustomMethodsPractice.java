package day12_customMethods;

public class Class06_CustomMethodsPractice {

    public static void main(String[] args) {

        eligibleAlcohol(65);

        oddEvenZero(35);

        grade(65);

        maxNumber(3, 95);
        maxNumber(-100.3,68.4);

        initials("Cydeo", "School");


    }


    // method that can check if a person is eligible to buy alcohol (age)
    public static void eligibleAlcohol(int age) {

        if (age >= 21) {
            System.out.println("Age is " + age + ". You are eligible to buy alcohol.");
        } else {
            System.out.println("Age is " + age + ". You are NOT eligible to buy alcohol.");
        }

    }


    // method that can check if number is odd, even, or zero (number)
    public static void oddEvenZero(int number) {

        if (number == 0) {
            System.out.println(number + " - this number is zero.");
        } else if (number % 2 == 0) {
            System.out.println(number + " - this number is even.");
        } else {
            System.out.println(number + " - this number is odd.");

        }
    }

    // method that can calculate grade of the students (score)
    public static void grade(int score) {

        if (score >= 0 && score <= 100) {
            if (score >= 90) {
                System.out.println("Score is " + score + ". Your grade is A");
            } else if (score >= 80) {
                System.out.println("Score is " + score + ". Your grade is B");
            } else if (score >= 70) {
                System.out.println("Score is " + score + ". Your grade is C");
            } else if (score >= 60) {
                System.out.println("Score is " + score + ". Your grade is D");
            } else {
                System.out.println("Score is " + score + ". Your grade is F");
            }

        } else {
            System.out.println("Score is invalid");
        }


    }


    // create a method that can print max number between 2 numbers, if both are euqal then it prints "equal"
    public static void maxNumber(double num1, double num2) {

        if (num1 > num2) {
            System.out.println(num1 + " is the max number");
        } else if (num2 > num1) {
            System.out.println(num2 + " is the max number");
        } else {
            System.out.println("equal");
        }


    }


    // create a method that can display the initals of a person
    public static void initials(String firstName, String lastName) {

        String initials = firstName.charAt(0) + "." + lastName.charAt(0);
        System.out.println("Initials are: " + initials);

    }


}
