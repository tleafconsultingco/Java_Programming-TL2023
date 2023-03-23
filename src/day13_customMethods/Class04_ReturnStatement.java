package day13_customMethods;

public class Class04_ReturnStatement {
    public static void main(String[] args) {

        eligible(23); // this will make the first statement false and it will execute remaining code fragment
        System.out.println(multiplication(2,10));

        System.out.println("---------------");

        System.out.println("Test started");
        boolean exit = true;;
        if(exit){
            return; // main method will be terminated
        }
        // these will not run bc return statement will exit the method
        System.out.println("Test1 completed");
        System.out.println("Test2 started");








    }


    public static void eligible(int age){

        if(age<0 || age >150){
            System.out.println("Invalid age: "+age);
            return; // exits the method
            // if age is invalid, then this gets terminated
        }

        // this if statement will not run if the above statement is true (invalid age)
        if(age>=21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }



    }

    // if you want to return a value

    public static int multiplication(int n1, int n2){
        // you must use return statement to return a value

        return n1*n2;



    }


}
