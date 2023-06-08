package day35_polymorphism;

import day34_abstraction.animalTask.*;
import day35_polymorphism.transportationTask.*;

public class Class07_PolymorphismPractice {

    public static void main(String[] args) {

        Class06_Animal tiger = new Class11_Tiger("Sher Khan", "Bengal", 'M', 5, "Large", "Orange");

        tiger.eat(); //Tiger Sher Khan is eating a deer
        tiger.drink(); //Sher Khan is drinking water
        tiger.sleep(); //Sher Khan sleeps 8 hours
        // tiger.hunt();
        //!! Can't use this method since the reference type is Animal and not Tiger

        Class06_Animal animal = new Class10_Eagle("John", "American Eagle", 'M', 3, "Small", "Black & White");
        // animal.fly();
        animal.eat(); //Eagle John is eating a snake
        animal.sleep(); //John sleeps 8 hours
        animal.drink(); //John is drinking water


        Interface02_Flyable obj1 = new Class10_Eagle("John", "American Eagle", 'M', 3, "Small", "Black & White");

        /*
        !! These methods are not in the Flyable interface
        obj1.eat();
        obj1.drink();
        obj1.sleep();
         */

        obj1.fly(); //Eagle John is flying
        System.out.println(obj1.canFly); //true


        Class12_Lion lion = null;

        Class09_Parrot parrot = null;

        Class13_Shark shark = null;

        Class14_Dolphin dolphin = null;

        Class10_Eagle eagle = null;

        Class15_Duck duck = null;

        Class07_Dog dog = null;

        Class08_Cat cat = null;

        //Class08_CydeoCar cydeoCar = null;

        Interface02_Flyable[] birds = {parrot, eagle, duck};

        Interface03_Swimmable[] fishes = {dolphin, shark, duck};

        Interface01_Playable[] friendlyAnimals = {dog, cat, duck};

        System.out.println("-- instance of --");

        boolean isAnimal = dog instanceof Class06_Animal;
        System.out.println(isAnimal); //false

        // boolean carIsAnimal = Class05_Tesla instanceof Class06_Animal;
        //System.out.println(carIsAnimal); //false

        Class02_Car car = new Class05_Tesla("Tesla", "Model Y", "White", 2020, 55000);

        boolean isTesla = car instanceof Class05_Tesla;
        boolean isAudi = car instanceof Class04_Audi;
        boolean isElectricCar = car instanceof Interface03_Electric;
        boolean hasAutoPark = car instanceof Interface01_Autopark;
        boolean hasAutoPilot = car instanceof Interface02_Autopilot;

        System.out.println("isTesla = " + isTesla); //isTesla = true
        System.out.println("isAudi = " + isAudi); //isAudi = false
        System.out.println("isElectricCar = " + isElectricCar); //isElectricCar = true
        System.out.println("hasAutoPark = " + hasAutoPark); //hasAutoPark = true
        System.out.println("hasAutoPilot = " + hasAutoPilot); //hasAutoPilot = true

        System.out.println("------------------------------------------------");
    }



}//class
