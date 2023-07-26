package studyGroup.interfaceExamples;

public interface Interface_Methods {
    //?? Abstract method
    void abstractMethod();

    //?? Default method
    default void defaultMethod1() {
        System.out.println("I am the first default method from interface");
    }
    //?? Default method
    default void defaultMethod2() {
        System.out.println("I am the second default method from interface");
    }
    //?? Static method
    static void staticMethod(){
        System.out.println("I am the static method from interface");
    }
}
