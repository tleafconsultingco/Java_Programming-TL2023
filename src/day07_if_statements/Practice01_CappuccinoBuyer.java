package day07_if_statements;

public class Practice01_CappuccinoBuyer {

    public static void main(String[] args) {

        String size = "tall";

        if (size == "tall" || size == "grande" || size == "venti")
            if (size == "tall") {
                System.out.println("Price iss $3.69. 90 calories.");
            } else if (size == "grande") {
                System.out.println("Price iss $3.99. 120 calories.");
            } else {
                System.out.println("Price iss $4.29. 150 calories.");
            }
        else {
            System.out.println("Invalid size");
        }


    }
}

/*
Create a class called CappuccinoBuyer. A variable named Size is given, write a program that can display the price and calories of cappuccino
Valid sizes are tall, grande, venti and their price & calories are: tall:
grande:
venti:
price is $3.69 90 calories
price is $3.99; 120 calories
price is $4.29 150 calories
If the size is invalid then the output should be "Invalid Size" Note: MUST use nested if
 */