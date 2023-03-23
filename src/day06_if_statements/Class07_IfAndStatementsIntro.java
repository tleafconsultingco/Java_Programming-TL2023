package day06_if_statements;

public class Class07_IfAndStatementsIntro {
    public static void main(String[] args){

        // Is person eligible to buy alcohol?

        // ...using single if. This requires 2 independent if statements, and those statements will be checked separately
        int age = 20;

        if(age >= 21){
            System.out.println(age + " is eligible");
        }

        if(age <= 21){
            System.out.println(age + " is not eligible");
        }

        System.out.println("----------------------------");
        //...instead you can use if else statement to check conditions together

        if(age >= 21){
            System.out.println(age + " is eligible");
        }else{ // means otherwise
            System.out.println(age + " is not eligible");
        }

        System.out.println();
        System.out.println("-------------------");



    }




}
