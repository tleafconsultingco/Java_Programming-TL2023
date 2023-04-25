package studyGroup.constructor_0425t;

public class Example_ConstructorChaining {

    //- Constructor chaining

    public Example_ConstructorChaining(){ //!! 2. No-arg constructor
        this(10.5); //!! 3. Calls the double constructor
        System.out.println("no-arg constructor"); //!! 9. Print no-arg constructor
    }//no-arg constructor

    public Example_ConstructorChaining(int a){
        System.out.println("int constructor");
    }//int constructor

    public Example_ConstructorChaining(String b){ //!! 6. String constructor
        System.out.println("String constructor"); //!! 7. Print String constructor
    }//string constructor

    public Example_ConstructorChaining(double c){ //!! 4. double constructor
       this("hello"); //!! 5. Calls the String constructor
        System.out.println("double constructor"); //!! 8. Print double constructor
    }//double constructor

    public static void main(String[] args) {
        Example_ConstructorChaining obj = new Example_ConstructorChaining();
        //!! 1. New object created calling no-arg constructor

        /*
        OUTPUT
        String constructor
        double constructor
        no-arg constructor
         */

    }
}
