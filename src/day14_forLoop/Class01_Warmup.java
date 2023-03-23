package day14_forLoop;

public class Class01_Warmup {
    public static void main(String[] args) {

        String str3 = combine("one", "eight");
        System.out.println(str3);

        int sum = sum2Numbers(2,3);
        System.out.println(sum);

        int sum3 = sum3Numbers(2,3,5);
        System.out.println(sum3);

        int sum4 = sum4Numbers(2,3,5,10);
        System.out.println(sum4);

    }


    public static String combine(String str1, String str2) {

        String result;

        // create condition to check if ending of first string is the same as first character of second string

        // using endsWith
        /* if (str1.endsWith("" + str2.charAt(0))) {// charAt returns char, so you need to convert char to string by adding ""
            result = str1 + str2.substring(1);
        } else {
            result = str1 + str2;
        }
        return result;
        */

        // using length
        if(str1.charAt(str1.length()-1) == str2.charAt(0)){ // if the last char in the first string is equal to the first char of the second string

            return str1+str2.substring(1); // first character of the second string should be excluded in concatenation
        }else{
            return str1+str2;
        }



    }

    public static int sum2Numbers(int num1, int num2) {
        return num1 + num2;

    }

    public static int sum3Numbers(int num1, int num2, int num3){
        //   return  n1 + n2 + n3;
        return sum2Numbers(num1,num2)+num3;

    }

    public static int sum4Numbers(int num1, int num2, int num3, int num4){
        // return n1 + n2 + n3 + n4;
        //  return sum3Numbers(n1, n2, n3) + n4;
        //  return sum2Numbers(n1, n2) + sum2Numbers(n3, n4);
        //  return  sum2Numbers(   sum3Numbers(n1, n2, n3)  ,   n4 );
        return  sum3Numbers(   sum2Numbers(num1, num2)  ,  num3 ,  num4  );
    }



}
/*
Task1:
	    Create a method named combine that can take two string and hen add them together and returns it.
        	But if the last letter of the first word and the first letter of the last letter are the same, return that character once.

	        combine("one", "eight")  ==> oneight

	Task 2:
	    1. create a method that can find the sum of two integer numbers
	                method name: sumOf2Numbers

	    2. create a method that can find the sum of three integer numbers
	                method name: sumOf3Numbers

	    3. create a method that can find the sum of four integer numbers
	                method name: sumOf4Numbers
 */