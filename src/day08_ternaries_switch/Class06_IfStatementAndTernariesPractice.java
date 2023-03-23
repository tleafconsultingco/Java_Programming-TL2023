package day08_ternaries_switch;

public class Class06_IfStatementAndTernariesPractice {
    public static void main (String[]args){

        int score = 90;


        String result = "";

        if(score >=0 && score <= 100){

             result = (score >= 90)? "A" :(score >= 80)? "B":(score >=70)?"C":(score>=60)? "D":"F"; // ternary within if statement

        }else{
            result = "Invalid score";
        }

        System.out.println(result);

        System.out.println();
        System.out.println("----------");
        // using only ternary, but not that readable

        String result2 = (score>=0&&score<=100)?
                (score >= 90)? "A" :(score >= 80)? "B":(score >=70)?"C":(score>=60)? "D":"F"
                : "Invalid score";

        System.out.println(result2);








    }








}
