package day34_abstraction.animalTask;

public interface Interface01_Playable {

    //- Variable
    boolean isFriendly = true; //!! public, static, and final

    //-- Proof for static and final
    private static void main(String[] args) {
        System.out.println(isFriendly); //!! If this was not static, I wouldn't be able to call it
        //!! Try to reassign (prove it's final)
        // isFriendly = false; // compile error
    }

    //- Method
    //-- Proof you can't create an instance method

    /*
    public void method1(){ //!! compiler error

    }
     */

    //-- Can create a default method that acts as an instance method in sub class
    default void method1(){
        System.out.println("test default method");
    }

    void play(); //!! abstract method (public and abstract are not required, they are by default)



}//interface
