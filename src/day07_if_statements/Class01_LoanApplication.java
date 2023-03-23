package day07_if_statements;

public class Class01_LoanApplication {

    public static void main(String[] args) {

        int salary = 50_000,
                creditScore = 680;

        if(salary >= 45_000 && creditScore >= 700){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");
        }


        System.out.println("---------------------");
        // Make this code better!

        String result = ""; // just assign a temporary value bc you need to assign some value otherwise you'll get error, it will be updated within if statement

        if(salary >= 45_000 && creditScore >= 700){
            result = "Eligible";
        }else{
            result = "You are not eligible";
        }

        System.out.println(result);






    }



}

/*
1. Create a class named LoanApplication. two variables named salary and createdScore are
declared and given, write a program that can check if the person is eligible to apply for a loan Note:In order to be eligible for a loan:
1. salary: at least 45K
2. credit score: at least 700
 */