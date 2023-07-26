package studyGroup.interfaceExamples;

public class Interface_TestExample implements Interface_Methods{
    //!! 1. Override the interface abstract method
    @Override
    public void abstractMethod() {
        System.out.println("I am the abstract method overridden in implementing class");
    }
    //!! 2. Override the interface default method
    @Override
    public void defaultMethod1() {
        //Interface_Methods.super.defaultMethod1();
        System.out.println("I am the default method overridden in implementing class");
    }
    public static void main(String[] args) {
        //!! 3. Create new object
        Interface_TestExample obj = new Interface_TestExample();
        //!! 4. Call the overridden default method
        obj.defaultMethod1();
        //!! 5. Call the interface default method (do not need to override)
        obj.defaultMethod2();
        //!! 6. Call the overridden abstract method
        obj.abstractMethod();
        //!! 7. Call the static method
        Interface_Methods.staticMethod();
        // The object cannot call the static method from interface
        //obj.staticMethod();

        /*OUTPUT:
            I am the default method overridden in implementing class
            I am the second default method from interface
            I am the abstract method overridden in implementing class
            I am the static method from interface
         */
    }
}
