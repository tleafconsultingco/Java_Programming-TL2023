package day20_forEach;

public class Practice03_Palindromes {
    public static void main(String[] args) {

        String[] array = {"anna", "level", "Java"};

        // 1. Initialize variable for counting palindromes
        int palindromeCount = 0;

        // 2. Use For-Each loop
        for (String each : array) {
            // 3. Initialize variable for reverse string to compare to element
            String reverse = "";
            // 4. Create For loop to create the reverse string starting from last index
            for (int i = each.length()-1; i >= 0; i--) {
                reverse += each.charAt(i);
            }
            // 5. Create if statement to compare array element to the reverse string
            if (each.equalsIgnoreCase(reverse)){
                palindromeCount++;
            }
        }

        // 6. Print
        System.out.println("palindromeCount = " + palindromeCount);
            //palindromeCount = 2





    }// main close
} //class close
/*
write a program that can count how many palindromes in an array of string Ex:
{"anna", "level", "Java"};
output: 2
 */