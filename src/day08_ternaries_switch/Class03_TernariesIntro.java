package day08_ternaries_switch;

public class Class03_TernariesIntro {

    public static void main(String[] args) {

        int score = 85;
        String result = "";

        // Previous method, simple if...else statement

        if (score >= 60){
            result = "Passed";
        }else {
            result = "Failed";
        }

        System.out.println(result);

        System.out.println();
        System.out.println("----------");

        // using ternaries

       String result2 = (score >= 60) ? "Passed" : "Failed";

        System.out.println(result2);


        System.out.println();
        System.out.println("------------");

        int age = 34;
        String r;

        if (age >= 21){
            r = "Eligible";
        }else{
            r = "Not Eligible";
        }

        String result3 = (age >= 21)?"Eligible":"Not Eligible";

        System.out.println(result3);

    }


}
