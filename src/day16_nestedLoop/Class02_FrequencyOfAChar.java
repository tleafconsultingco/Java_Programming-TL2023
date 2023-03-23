package day16_nestedLoop;

public class Class02_FrequencyOfAChar {
    public static void main(String[] args) {

        // What approach can we take? Need to count every character in the string

        String str = "accccaabbbbccccc";
        char ch = 'c';
        // need a variable to contain the final result
        int count = 0;

        // need every single character of the string, by using the for loop for charAt()
        for (int i = 0; i < str.length(); i++) { // i: index numbers of str

            if(str.charAt(i) == ch){ // if the character to the string is equal to the given character, then it means the given character has appeared in the string
                count++; // this count will be increased every time the character matches the str
            }


        }


        System.out.println(count);


    }
}
/*
write a program that can return the frequency of a
character from a string
Ex:
ch = 'c'
str = "aaabbbbccccc"
output: 5
 */