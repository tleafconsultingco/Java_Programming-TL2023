package utilities;

public class StringUtility {

    public static String reverse(String str) {
        String reverse = ""; // declare this variable to contain all the characters of the given string in reverse order

        for (int i = str.length() - 1; i >= 0; i--) { // i: index number of the given string starting from last index to index 0
            reverse += str.charAt(i); // use charAt() to get each character of the string starting from last index to index 0
        }
        return reverse;
    } // main close


} // class close
