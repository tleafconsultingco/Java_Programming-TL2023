package studyGroup;

public class Week01_DM_CreateCustomMethods {

    /* ? METHOD NOTES
        ?? Methods are created to increase efficiency. It allows you to run a task without writing the code over and over for every task you wish to test.

    ?? 1. It is important to know what the method will be used for.
        Will it return a value? Will it perform calculations?

    ?? 2. Will it be used across classes and packages?
        You need to consider the access modifier
        Providing an access modifier is NOT required, but if you do not provide one it will be DEFAULT

        !! Access modifiers are the "privacy/restrictions" on "who" can access the data from a file.
            1. Public -- most access (can be accessed across classes and packages)
            2. Protected -- access across classes, within the same package, and across packages (if there is an inheritance)
            3. Default -- "more protected" (can be accessed across classes in the same package)
            4. Private -- least access/most restrictive (can only be accessed within the same class)

    ?? 3. What are the parameters?
        What type of arguments will the method pass?
        Not always required, but consider what is the purpose of the method

        !! For example: if you create a method to perform a calculation with numbers, you need to pass int arguments

        !! the parameters are int num1 and int num2
        public static int addition(int num1, int num2){
        return num1+num2;
        }

        public static void main(String[] args) {
            System.out.println(addition(1,2));
            System.out.println(addition(10,20));
            System.out.println(1+2);
            System.out.println(10+20);
        }

    ?? 4. Method name
        Always required

    ?? 5. Parentheses
        Always required, but you don't always need to provide parameters within the parentheses

    ?? 6. Method body
        This is where all the code will be written
        This is USUALLY always required

        !! The exception where you DO NOT provide a method body is if the method is ABSTRACT

    ?? 7. Where can methods be created?
        Methods are created in a CLASS
        Methods are always created OUTSIDE of the main method
        Methods can NEVER be created within another method

     */

    /* @ IF statements notes
        @@ Evaluates a condition. A condition are ALWAYS REQUIRED

    @@ 1. To create an If statement, we need to determine what condition we are evaluating

        !! For example: A custom method that identifies if a given number is even or odd...
            !! We need to determine "what does it mean to be even?" and "what does it mean to be odd?"
            !! EVEN means == the number can be divided by 2, with no remainder (result is a whole number)
                    10 / 2 = 5
            !! ODD means == when the number is divided by 2, there is a remainder (result is not a whole number)
                    11 / 2 = 5.5

    @@ 2. Creating the if statement
        Type in: if
        Add parentheses. This is where you will write in your CONDITION
        Add curly braces. This is what will execute if the condition evaluates to TRUE.

            if(condition) {
                then...
            }

    @@ 3. If the condition is TRUE, then the code block in the curly braces will execute

    @@ 4. If-Else statements can be used when there are 2 possible outcomes
        If the first condition (in the If block) evaluates to FALSE, then the code in the Else block will execute




     */


    //- Method for adding 2 numbers
    public static int addition(int num1, int num2){
        return num1+num2;

    }

    //- Main method (runs code)
    public static void main(String[] args) {

        // Testing the method
        System.out.println(addition(1,2));
        addition(10,20);
        System.out.println(1+2);
        System.out.println(10+20);

        // If statements

        int number =11;

        /*
        //!! single If statement for even numbers
        if(number%2==0){
            System.out.println(number+" is EVEN");
        }

        //!! single If statement for odd numbers
        if(number%2!=0){
            System.out.println(number+" is ODD");
        }
*/

        //!! COMBINE the single If statements into an If-Else statement
        if(number%2==0){ //code in the curly braces is like "then this happens"
            System.out.println(number+" is EVEN");
        }else{ //else statement is used when the If condition is FALSE
            System.out.println(number+" is ODD");
        }

    }





}
/*
Write a method which can identify if a given number is even or odd
EX:
identify(5) --> "Odd"
identify(6) --> "Even"
 */