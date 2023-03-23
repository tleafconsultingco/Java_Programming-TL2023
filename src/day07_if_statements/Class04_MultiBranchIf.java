package day07_if_statements;

public class Class04_MultiBranchIf {
    public static void main(String[]arags){

        int num = 100;

        String result = "";

        // using 3 single if. Every single condition of each statement will be checked.
        if (num > 0){
            result = "Positive"; // true, but the others will also be checked even though it's true
        }
        if (num < 0){
            result = "Negative";
        }
        if (num == 0){
            result = "Zero";
        }

        System.out.println(result);

        System.out.println();
        System.out.println("----------------");

        // using 1 multibranch if

        String result2 = "";

        if (num > 0){
            result2 = "Positive";
        }else if (num < 0){
            result2 = "Negative";
        }else {
            result2 = "Zero";
        }


        System.out.println(result2);





    }




}
