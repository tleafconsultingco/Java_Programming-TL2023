package day07_if_statements;

public class Class02_Grade {

    public static void main(String[] args) {

        // using multiple single if statements

        char grade = 'B';

        // to be able to print one statement
        String result = "";


        if (grade == 'A'){
            result = "Excellent";
        }
        if (grade == 'B'){
            result = "Great job";
        }
        if (grade == 'C'){
            result = "Good";
        }
        if (grade == 'D'){
            result = "Passed";
        }
        if (grade == 'F'){
            result = "Failed";
        }


        System.out.println(result); // "Great job"

    }


}
/*
2. Create a class named Grade, a char variable named grade is given. write a program to print the following messages:
'A': Excellent 'B': Great job 'C': Good 'D': Passed 'F': Failed
Note: Do not use more than one print statement

 */