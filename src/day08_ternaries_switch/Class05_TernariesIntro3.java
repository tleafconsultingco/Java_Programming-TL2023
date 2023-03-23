package day08_ternaries_switch;

public class Class05_TernariesIntro3 {
    public static void main(String[] args) {

        int score = 95;

        /*

        // nested if, generally easier to read than ternary

        String result = "";

        if(score >= 1 && score <= 100){
            if(score >= 60){
                result = "Passed";
            }else{
                result = "Failed";
            }
            System.out.println(result);
        }else {
            result = "Invalid";
        }
        */

        // nested ternary

        String result = (score >= 0 && score <= 100)?
                (score >= 60)? "Passed" : "Failed"
                : "Invalid";

        System.out.println(result);

        System.out.println();
        System.out.println("--------------");

        int n = 5;

        String day = (n >= 1 && n <= 7)?
                (n ==1)? "Mon":(n==2)?"Tue":(n==3)?"Wed":(n==4)?"Thu":(n==5)?"Fri":(n==6)?"Sat":"Sun"
                : "Invalid";

        System.out.println(day);









    }
}
