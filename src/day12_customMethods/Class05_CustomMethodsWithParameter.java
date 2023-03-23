package day12_customMethods;

public class Class05_CustomMethodsWithParameter {

    public static void main(String[] args) {

        oddOrEven(100);
        System.out.println("------");
        oddOrEven(1000);


    }

    // create method to evaluate number as even or odd
    // this method takes an argument number and verifies if the number is odd or even number
    public static void oddOrEven(int number){ // with no parameters we can't verify the number, we need to include int and variable

        if(number%2==0){
            System.out.println(number + " is even number");
        }else{
            System.out.println(number + " is odd number");
        }

    }


}
