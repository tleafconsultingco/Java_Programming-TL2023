package day10_string;

import java.util.Scanner;

public class Class02_EmployeeInfo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullName = input.nextLine();

        System.out.println("Enter your age");
        byte age = input.nextByte();

        System.out.println("Enter your gender");
        char gender = input.next().charAt(0);

        input.nextLine();

        System.out.println("Enter your company name");
        String companyName = input.nextLine();

        System.out.println("Enter your job title");
        String jobTitle = input.nextLine();

        System.out.println("Enter your salary");
        double salary = input.nextDouble();

        input.close();


        System.out.println("Employee's Name: " + fullName);
        System.out.println("Employee's Age: " + age);
        System.out.println("Employee's Gender: " + gender);
        System.out.println("Company Name: " + companyName);
        System.out.println("Employee's Job Title: " + jobTitle);
        System.out.println("Employee's Salary: $ " + salary);

    }


}
/*
Create a class named EmployeeInfo and Ask the user to:
2.1 Enter your full name ( nextLine() )
2.2 Enter your age ( nextByte())
2.3 Enter your gender ( next().charAt(0) )
2.4 Enter your company name ( nextLine() )
2.5 Enter your job title ( nextLine() )
2.6 Enter your salary (nextDouble() )
Display:
Employee's name
EMployee's age
Employee's gender
Company name
Employee's job title
Employee's salary
 */