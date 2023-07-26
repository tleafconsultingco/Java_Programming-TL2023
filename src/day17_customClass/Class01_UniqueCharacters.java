package day17_customClass;

public class Class01_UniqueCharacters {

    public static void main(String[] args) {

        String str = "aabcccd";
        String unique = "";

        for (int j = 0; j < str.length(); j++) {
            //the following code needs to be inside a loop so it can check every index number
            // find frequency of character to see if it's equal to 1 (this means it will be unique)
            char ch = str.charAt(j); // will verify if first character of str to see if it's unique
            // index 0 is a, it will move to next character and if it's the same then it will add to the frequency value
            int frequency = 0; // default value so that it can be updated
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) { // this will check char at i (as it changes and gets checked) to see if it is the same as ch
                    frequency++;
                }
            }
            // this is outside of the loop
            // you could change frequency to account for tasks that ask for frequency of char
            if (frequency == 1) { // if frequency is 1 it means it's unique and the char will be added to the string unique
                unique += ch;
            }
        }

        System.out.println(unique);




    // end of main
    }
}
/*
Write a program that can find the unique characters from a String
			Ex:
				str = "aabcccd"

				output:
					bd
 */