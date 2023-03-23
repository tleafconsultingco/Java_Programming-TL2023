package day12_customMethods;

public class Class07_WithoutCustomMethod {
    public static void main(String[] args) {

        // you will need to use the same code fragment for every single varible you need to check. this takes too long and is inefficient. if you used custom method you can just call the custom method to complete each task
        int num1 = 100;
        if (num1 % 2 == 0) {
            System.out.println(num1 + " is even number");
        } else {
            System.out.println(num1 + " is odd number");
        }


        int num2 = 35;
        if (num2 % 2 == 0) {
            System.out.println(num2 + " is even number");
        } else {
            System.out.println(num2 + " is odd number");
        }


        int num3 = 79;
        if (num3 % 2 == 0) {
            System.out.println(num3 + " is even number");
        } else {
            System.out.println(num3 + " is odd number");
        }


        int num4 = 39;
        if (num3 % 2 == 0) {
            System.out.println(num4 + " is even number");
        } else {
            System.out.println(num4 + " is odd number");
        }


        // using custom method from below

        int n1 = 100;
        oddOrEven(n1);

        int n2 = 35;
        oddOrEven(n2);

        int n3 = 79;
        oddOrEven(n3);

        int n4 = 39;
        oddOrEven(n4);
    }

        public static void oddOrEven(int number){
            if(number%2==0){
                System.out.println(number + " is even number");
            }else{
                System.out.println(number + " is odd number");
            }

        }



    }

