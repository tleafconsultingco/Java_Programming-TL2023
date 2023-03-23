package day16_nestedLoop;

public class Practice07_FrequencyCharacterOfFromString {
    public static void main(String[] args) {
        String str = "aabcccd"; // 1. declare string
        String result = ""; // 2. create string variable for final result


        for (int j = 0; j < str.length(); j++) { // 8. the first for loop is nested w/in another for loop, so that it can run code on each character (to be compared with every other character)
            char ch = str.charAt(j); // 3. start with finding each character at index
            int count = 0; // 4. if the character is the same, then add to the count

            // 5. create a loop to continually check each index number (^^ at first the lines of code only check at a specified index number
            for (int i = 0; i < str.length(); i++) { // 5a. checks first character with each character in the string
                if(str.charAt(i)==ch){ // 6. if the following characters are the same as the character that is being checked, then...
                    count++; // 7. ...adds to count
                }
            }

            if(result.contains(""+ch)){ // 9. this eliminates the duplicates by...
                continue; // 10. ...skipping the duplicate characters
            }

            result = ""+ch+count; // 11. concatenates the character and the count for each character (add "" to make this a string value)

            System.out.print(result);

        }







    } // main close
} // Class close
/*
Write a program that can find the frequency of the characters from
a string
                         Ex:
                        str = "aabcccd";
                        output:
                                a2b1c3d1
            Hint: if you find out how to find the frequency of one
character, then repeat it for all the remaining characters
 */