package day31_inheritance.methodOverriding_animal;

public class Class12_Dog extends Class10_Animal{

    public Class12_Dog(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }//constructor

    //- modify eat method
    @Override
    public void eat(){
        System.out.println("Dog "+getName()+" is eating dog food");
    }//eat


    //- method
    public void bark(){
        System.out.println("Dog "+getName()+" is barking");
    }//bark

}//subclass
