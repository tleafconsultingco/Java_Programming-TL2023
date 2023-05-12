package day29_inheritance;

public class Class04_Dog extends Class03_Animal { //!! Dog is an animal and will pull attributes from Animal class

    /*
    //!! Not required to declare these again, since they are inherited from parent class
    public void method(){
        System.out.println(name);
        System.out.println(breed);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(size);
        System.out.println(color);
        System.out.println(isAnimal);
        setInfo();
        eat();
        drink();
        sleep();
        toString();
        bark();
    }
    */

    //- Methods specific for the dog subclass
    public void bark(){
        System.out.println(getName()+" is barking");
    }//bark


}//subclass
/*
7 variables
5 methods
 */