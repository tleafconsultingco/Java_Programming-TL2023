package day14_forLoop;

public class Class08_StringReverse {

    public static void main(String[] args) {


        String str = "Java";
        // index 0123

        // use loop to call out char for every index

        String reverse = ""; // storing outputs into this string


        for (int i = str.length()-1; i >=0 ; i--) {
            reverse += str.charAt(i);
        }

        System.out.println(reverse);

        String name = "abcd efghi jklmn";
        String result = reverse(name);


    }

    public static String reverse(String str){

        String reverse = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverse += str.charAt(i);
        }

        return reverse;

    }



}
