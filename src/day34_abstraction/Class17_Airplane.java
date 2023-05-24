package day34_abstraction;

import day34_abstraction.animalTask.Interface02_Flyable;

public class Class17_Airplane implements Interface02_Flyable {


    @Override
    public void fly() {
        System.out.println("Airplane is flying");
    }
}//class
