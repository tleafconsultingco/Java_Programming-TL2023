package studyGroup.constructor_0425t;

public class Q10_Test {

    //?? Output = Developer

    public Q10_Test(){ //!! 2. No-arg constructor
        System.out.println("Developer"); //!! 3. Print Developer
    }//no-arg constructor

    //-- This is a basic custom method and would need to be called by the object, see 4.
    public void Q10_Test(){ //&& NOTE that this method name should not be the same as the class name (constructors are named after the class, so using it for a custom method is confusing)
        System.out.println("SDET");
    }//custom method

    public static void main(String[] args) {
        Q10_Test obj = new Q10_Test();
        //!! 1. Create new object calling no-arg constructor
        /*
        OUTPUT
        Developer
         */

        //!! 4. Calling the Q10_Test custom method
        obj.Q10_Test();
        /*
        OUTPUT
        Developr
        SDET
         */


    }//main


}//class
