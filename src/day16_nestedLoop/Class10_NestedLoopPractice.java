package day16_nestedLoop;

public class Class10_NestedLoopPractice {
    public static void main(String[] args) {
        // finding frequency of character for all characters

        String str = "aaaabbcccccdddeeff";

        // display characters whose frequency is 2
        String result = ""; // "bef"

        for (int j = 0; j < str.length(); j++) { // 6.

            // this is the code fragment that will find frequency of all characters
            // 1. find first character
            char ch = str.charAt(j);
            // how many times does this character appear in the string?
            int count = 0; // 2. declare count as a generic value

            // 3. next use a for loop to find out how many times the first character appears in the string
            for (int i = 0; i < str.length(); i++) { // responsible for comparing ch to each character of str and return the frequency of ch
                // start at first index
                // go until last index number by using length()
                if (str.charAt(i) == ch) { // 4. if the character at index matches, then...
                    count++; // ...add to count
                }
            }

            if (count == 2 && !result.contains(""+ch)){ // if the frequency is 2, then it will add that character to result, but only if result does not already have that character
                result+=ch;
            }

        }


        System.out.println(result);

        // now we need to repeat the statement starting on line 14, create a loop at beginning


    }
}
