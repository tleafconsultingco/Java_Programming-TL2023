package utilities;

public class StringUtility {

    // Reverses string
    public static String reverse(String str) {
        String reverse = ""; //!! declare this variable to contain all the characters of the given string in reverse order

        for (int i = str.length() - 1; i >= 0; i--) { //!! i: index number of the given string starting from last index to index 0
            reverse += str.charAt(i); //! use charAt() to get each character of the string starting from last index to index 0
        }
        return reverse;
    }


    // Counts the frequency of a word in a given string
    public static int frequency(String sentence, String word){

        int count = 0;

        while(sentence.contains(word)){
            sentence = sentence.replaceFirst(word, "");
            count++;
        }

        return count;
    }



    // Counts the frequency of a character in a given string
    public static int frequency(String str, char ch){
        int count =0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch){
                count++;
            }
        }

        return count;

    }



    // Removes duplicates in a given string
    public static String removeDup(String str){
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if(!result.contains(""+each)) {
                result += each;
            }

        }

        return result;
    }


} // class close
