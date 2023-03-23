package day16_nestedLoop;

public class Class03_FrequencyOfAWord {
    public static void main(String[] args) {
        // using while loop

        String sentence ="java JAVA jAvA JAva";
        String word = "Java";

        // ignore case sensitivity
        sentence = sentence.toLowerCase();
        word = word.toLowerCase();

        int count = 0; // this variable needs to contain the frequency of the word Java

        while(sentence.contains(word)){
            count++;
            sentence = sentence.replaceFirst(word,""); // this will take out the first/present word in the string as the loop continues to run

            /*
            "Java Java Java Java"; count = 0;
            " Java Java Java" // count = 1
            " Java Java" // count = 2
            " Java" // count = 3
            " " // count = 4
             */
        }

        System.out.println(count);


    }
}
/*
Write a program that can return the frequency of the word

java from a sentence
Ex:
sentence = "java JAVA jAvA JAva"
output:
4
 */