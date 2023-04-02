package day03_variables;

public class Class04_VariableNamingRules {

    public static void main(String[] args) {

        // EXAMPLE
        // age of student is 20
        // salary is $10,000

        int age = 28;
        int salary = 10000;
        // int age = 32; compiler error bc variable name age has already been used

        System.out.println(age);
        System.out.println(salary);

        int phoneNumber = 1234567; // camel case

        double salaryBeforeTax = 100000.5; // camel case

        double salary_after_tax = 80000.5; // underscore

        double salary_after_tax$ = 80000.5; // dollar sign is an acceptable character
        System.out.println("-----------------------------------------------");

        int number1 = 10;
        // int number1 = 20; compiler error bc number1 is already used
        // int 3number = 30; compiler error bc cannot start with number

        // double abstract = 5.5; variable cannot be one of the java reserved words
        System.out.println("--------------------------------------");

        System.out.println("NON-PRIMITIVE: STRING");
        System.out.println();

        // gender is male
        String gender = "Male";

        String fullName = "Cydeo School";

        System.out.println(gender);
        System.out.println(fullName);









    }//main close
}//class close
