package day08_ternaries_switch;

public class Class07_SwitchIntro {

    public static void main(String[] args) {

        char grade = 'A'; // need to compare with other values

        /*
        Need to compare grade with values like
        A: Excellent
        B: Great
        C: Good
        D: Passed
        F: Failed

        // previous task, multibranch if

        char grade = 'B';
        String result = "";

        if (grade == 'A'){
            result = "Excellent";
        } else if (grade == 'B') {
            result = "Great job";
        } else if (grade == 'C') {
            result = "Good";
        } else if (grade == 'D'){
            result = "Passed";
        } else {
            result = "Failed";
        }

         */

        switch (grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Great");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Passed");
                break;
            case 'F':
                System.out.println("Failed");
                break;
            default:
                System.out.println("Invalid");
        }










    }
}
