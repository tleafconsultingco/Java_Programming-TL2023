package day11_string;

public class Class05_StringMethods2 {
    public static void main(String[] args) {

        // REPLACE
        String sentence = "I love Python, Python is the best programming language, and Python is in high demand";

        sentence.replace("Python", "Java");

        System.out.println(sentence); // Python, still references old object bc the reference variable is attached to the original variable
        // to print the replacement you need to reassign

        sentence = sentence.replace("Python", "Java");
        System.out.println(sentence); // Java

        String word = "java";

        word = word.replace('a','e'); // reassign the variable word
        System.out.println(word); // jeve

        System.out.println();
        System.out.println("-------------");
        // REPLACE FIRST

        String sentence2 = "I love Java, and Java is cool";
        // if I only wanted to replace the first Java with Python, but not the second

        // sentence2 = sentence2.replace("Java", "Python");
        // System.out.println(sentence2); // will replace all the Java with Python

        sentence2 = sentence2.replaceFirst("Java","Python");
        System.out.println(sentence2); // "I love Python, and Java is cool"

        // replacing a variable that is not the first one

        String sentence3 = "Java is fun, Java is cool, Java is amazing";

        // sentence3 = sentence3.replace("Java","Python")
        // System.out.println(sentence3); // this won't work bc it will replace all the Java with Python

        sentence3 = sentence3.replaceFirst(", Java",", Python"); // making this unique will accomplish goal!
        System.out.println(sentence3); // "Java is fun, Python is cool, Java is amazing"

        System.out.println();
        System.out.println("--------");
        // SUBSTRING

        String sentence4 = "I love Java Programming";
        // index            012345... J = 7, a = 10

        String languageName = sentence4.substring(7,10);
        System.out.println(languageName); // "Jav"

        // need to add another index to include the last character
        languageName = sentence4.substring(7,10+1);
        System.out.println(languageName); // "Java"

        String sentence5 = "Today is Sunday, Tomorrow is Monday";
        // index            0123456789... S = 9 y =14

        String today = sentence5.substring(9,15);
        System.out.println(today); // "Sunday"

        // ------ using indexOf()

        // create substring of email domain
        String email = "CydeoSchoolJavaProgramming@gmail.com";

        // find index number of the @ sign

        int beginning = email.indexOf('@') + 1; // this will give the first character after @ sign
        int ending = email.indexOf('.'); // will return the character before the dot bc the last character is not included

        String domain = email.substring(beginning, ending);
        System.out.println(domain); // "gmail"

        System.out.println();
        System.out.println("---------");
        // SUBSTRING without using ending index

        String sentence6 = "I love Java Programming";

        // String r1 = sentence6.substring(7, sentence6.length()-1 +1); // the ending cancels out so you can just use the beginning character

        System.out.println(sentence6); // "Java Programming"

        String sentence7 = "Today is Sunday, Tomorrow is Monday";

        String tomorrow = sentence7.substring(sentence7.lastIndexOf(' ') +1); // finds the last space (from right to left) and the +1 includes M
        System.out.println(tomorrow);

        String sentence8 = "I study at Cydeo School";

        String schoolName = sentence8.substring(11);
        System.out.println(schoolName); // "Cydeo School"


        System.out.println();
        System.out.println("----------");
        // REPEAT

        String str = "Python";

        String result = str.repeat(10);
        System.out.println(result); // will repeat "Python" 10x w/o spaces

        result = (str+"\n").repeat(10);
        System.out.println(result); // will create 10 lines of "Python"

        System.out.println();
        System.out.println("------------");









    }
}
