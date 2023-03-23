package day08_ternaries_switch;

public class Class04_TernariesIntro2 {
    public static void main(String[] args) {

         int number = 100;

         // need to get pos, neg, or zero (3 conditions). all will be string

        // Previously....
        /*

        String result = "";
        if (number > 0){
            result = "Positive";
        } else if (number <0) {
            result = "Negative";
        }else {
            result = "Zero";
        }
*/

        String result = (number > 0) ? "Positive" :(number < 0)? "Negative" : "Zero";
        //              if block                  else if block             else block


        System.out.println();
        System.out.println("--------------");

        int n = 1;

        // multibranch if
        /*

        String day = "";
        if (n==1){
            day = "Monday";
        } else if (n == 2) {
            day = "Tuesday";
        }else if (n == 3) {
            day = "Wednesday";
        }else if (n == 4) {
            day = "Thursday";
        }else if (n == 5) {
            day = "Friday";
        }else if (n == 6) {
            day = "Saturday";
        }else{
            day = "Sunday";
        }
*/

        // ternary

        String day = (n==1)? "Monday" :(n==2)? "Tuesday" :(n==3)? "Wednesday":(n==4)? "Thursday":(n==5)? "Friday":(n==6)? "Saturday": "Sunday";

        System.out.println(day);

        System.out.println();
        System.out.println("-----------------");

        int num = 10; // 1~12

        String month = (num == 1)? "Jan" :(num ==2)? "Feb":(num == 3)?"Mar":(num==4)? "Apr":(num ==5)? "May":(num ==6)? "Jun":(num == 7)? "Jul":(num==8)?"Aug":(num==9)?"Sep":(num==10)?"Oct":(num==11)?"Nov": "Dec";

        System.out.println(month);




    }



}
