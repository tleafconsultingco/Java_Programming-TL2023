package day29_inheritance;

public class Class05_Cat extends Class03_Animal {

    //- Methods specific for the cat subclass
    public void meow(){
        System.out.println(getName() +" is meowing");
    }//meow

    public void scratch(){
        System.out.println(getName()+" is scratching");
    }//scratch

}//subclass
