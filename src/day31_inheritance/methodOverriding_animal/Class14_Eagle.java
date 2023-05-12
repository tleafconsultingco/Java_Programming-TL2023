package day31_inheritance.methodOverriding_animal;

public class Class14_Eagle extends Class10_Animal{

    public Class14_Eagle(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }//constructor

    @Override
    public void eat(){
        System.out.println("Eagle "+getName()+" is eating snake");
    }//eat

}//subclass
