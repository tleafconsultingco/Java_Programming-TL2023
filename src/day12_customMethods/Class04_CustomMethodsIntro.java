package day12_customMethods;

public class Class04_CustomMethodsIntro {

    public static void main(String[] args) {
        // this method has already been created

        // calling greetings method in this body

        System.out.println("-Test started-");
        greetings(); // Java will run everything in greetings method
        System.out.println("-Test completed-");
        // this main method will print all statements from every method called in main method PLUS the print statements in main method

        System.out.println("-----------");
        displayMethod();

    }

    // creating a new method within the same class, but outside of the other method
    public static void greetings() {
        System.out.println("Hello Cydeo");
        System.out.println("How are you today?");
        System.out.println("Are you ready to learn Java?");

        // if you need to call these 2 fragments anywhere we can use this method


    }


    public static void displayMethod(){
        System.out.println("Hello World");
        System.out.println("I love Java");

    }








}
