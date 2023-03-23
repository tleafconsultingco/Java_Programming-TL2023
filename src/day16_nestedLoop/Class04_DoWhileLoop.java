package day16_nestedLoop;

public class Class04_DoWhileLoop {
    public static void main(String[] args) {

        boolean condition = false;

        for(;condition;){
            System.out.println("Hello Cydeo -- for loop"); // will never run since condition is false
        }

        System.out.println("--------");

        while(condition){
            System.out.println("Hello Cydeo -- while loop"); // will never run since condition is false
        }

        System.out.println("-------");
        do{
            System.out.println("Hello Cydeo -- do...while loop");
        }while(condition); // runs 1 time bc it will run the statement at least once since the condition is false

    }
}
