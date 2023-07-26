package studyGroup;

import static java.lang.Integer.parseInt;

public class SumOfAllDigits {

    public static void main(String[] args) {

        String str = "12 java 5 apple 3";

        //int sum = parseInt(str);

        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                sum += str.charAt(i)-'0';
            }

        }

        System.out.println(sum);
    }
}


