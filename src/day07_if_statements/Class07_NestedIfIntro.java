package day07_if_statements;

public class Class07_NestedIfIntro {

    public static void main(String[]args){

        // we have 2 conditions, but they depend on a precondition
        int score = 95;


        if (score >= 0 && score <= 100){ //! precondition. if the score is valid

            if (score >= 60){ //!! this if statement is executed within another if statement. if the score is greater or equal to 60
                System.out.println("Passed");
            } else{ // if the score is less than 60
                System.out.println("Failed");
            }


        }else{ // opposite of precondition, executed if the score is not valid
            System.out.println("Invalid Score");
        }

        System.out.println();
        System.out.println("-------------");

        int age = 32;

        if (age >= 1 && age <= 150){

            if (age >= 21){
                System.out.println("Eligible");
            } else {
                System.out.println("Not Eligible");
            }

        }else{
            System.out.println("Invalid Age");
        }


        System.out.println();
        System.out.println("----------");
        // if using multibranch, although it's not the best practice/optimal

        // for example if someone uses 100, java will execute the code from top to bottom, which will take time during the run by going through every single condition until it finds a false
        int day = 5;

        if (day == 1){
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5){
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid Number");
        }

        // would be better to use the nested if

        if (day >= 1 && day <= 7){

            if (day == 1){
                System.out.println("Monday");
            } else if (day == 2) {
                System.out.println("Tuesday");
            } else if (day == 3) {
                System.out.println("Wednesday");
            } else if (day == 4) {
                System.out.println("Thursday");
            } else if (day == 5){
                System.out.println("Friday");
            } else if (day == 6) {
                System.out.println("Saturday");
            } else {
                System.out.println("Sunday");
            }


        }else{System.out.println("Invalid number");
        }


    }


}
