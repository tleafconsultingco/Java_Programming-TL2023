package day06_if_statements;

public class Class03_EvenlyDivisible {
    public static void main(String[] args){

        int number = 65;

        boolean divisibleBy2 = number % 2 == 0;
        // if the remainder of number divided by 2 is equal to zero, then it's equally divisible by 2
        boolean divisibleBy3 = number % 3 == 0;
        // if the remainder of number divided by 3 is equal to zero, then it's equally divisible by 3
        boolean divisibleBy5 = number % 5 == 0;
        // if the remainder of number divided by 5 is equal to zero, then it's equally divisible by 5

        System.out.println(number + " is divisible by 2: " + divisibleBy2); // false
        System.out.println(number + " is divisible by 3: " + divisibleBy3); // false
        System.out.println(number + " is divisible by 5: " + divisibleBy5); // true



    }//main close
}//class close
/*
3. Create a class named EvenlyDivisible, and write a program that can check if a number is evenly divisible by 2, 3, 5
            Ex:
                number = 65;

            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true

            Evenly Divisible ==> remainder is zero



Single If Statement: can be used for crreating condition for one possible output

 */
