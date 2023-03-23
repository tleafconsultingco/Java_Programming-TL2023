package day14_forLoop;

public class Class06_ForLoopPractice1 {

    public static void main(String[] args) {

    for(int i=5; i <=10; i++){ // decrement operator cannot bring the value greater than 10, indefinite printing

        System.out.println("Hello Cydeo"+i); // this will be infinite
    }

        System.out.println("Hello World"); // this will never be run until after Hello Cydeo is printed infinite time


        for(int i=10;i>=5;i--){ // i:10, 9, 8, 7, 6, 5
            System.out.println("Hello"); // printed 6 times
        }

        System.out.println();
        System.out.println("------------");

        // sum of all numbers 1-100

        int sum = 0; // adding any number to 0 will give you the same number
        for(int i=1;i<=100;i++){
           sum += i;
        }
        System.out.println(sum); // print after loop since it does not need to be repeated

        System.out.println();
        System.out.println("--------");

        // print all alphabet letters A-Z

        for(char i='A';i<='Z';i++){
            System.out.print(i+" ");
        }

        System.out.println();

        System.out.println();
        System.out.println("--------");
        // print all alphabet letters A-Z backwards

        for(char i='Z';i>='A';i--){
            System.out.print(i+" ");
        }
        System.out.println();

    }

}
