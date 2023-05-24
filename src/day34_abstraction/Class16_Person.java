package day34_abstraction;

import day34_abstraction.animalTask.Interface01_Playable;
import day34_abstraction.animalTask.Interface03_Swimmable;

public class Class16_Person implements Interface01_Playable, Interface03_Swimmable {

    //!! This class is able to inherit the methods from interface


    @Override
    public void play() {
        System.out.println("Person is playing");
    }

    @Override
    public void swim() {
        System.out.println("Person is swimming");
    }
}//class
