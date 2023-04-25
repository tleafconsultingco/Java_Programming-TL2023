package studyGroup.constructor_0425t;

public class Q08_Test {

    //?? Output = A C B
        // This involves a series of "nested" constructors. Recall that constructors can only call one constructor, so in order to utilize multiple constructors you need to chain them.

    public Q08_Test(){ //!! 6. no-argument constructor
        System.out.println("A"); //!! 6. Print A
    }//no arg constructor

    public Q08_Test (int a){ //!! 2. int constructor
        this(2.5); //!! 3. Calls the double constructor
        System.out.println("B"); //!! 8. Print B
    }//int constructor

    public Q08_Test (double c){ //!! 4. double constructor
        this(); //!! 5. Calls the no-arg constructor
        System.out.println("C"); //!! 7. Print C
    }//double constructor

    public static void main(String[] args) {
        Q08_Test obj = new Q08_Test(100); //!! 1. When creating a new object we provide an int argument constructor
            /*
             OUTPUT
             C
             B
             A
             */


    }//main

}//class
