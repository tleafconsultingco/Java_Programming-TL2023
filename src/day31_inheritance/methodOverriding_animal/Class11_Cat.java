package day31_inheritance.methodOverriding_animal;

public class Class11_Cat extends Class10_Animal {

    public Class11_Cat(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }//constructor

    //- Override the eat and sleep methods
    @Override
    public void eat(){
        System.out.println("Cat "+getName()+" is eating cat food");
    }//eat

    @Override
    public void sleep(){
        System.out.println("Cat "+getName()+" sleeps 12 hours in a day");
    }//sleep

    //- Methods
    public void scratch(){
        System.out.println("Cat "+getName()+" is scratching");
    }//scratch


}//subclass
