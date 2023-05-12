package day29_inheritance;

public class Class03_Animal {


    //- Private instance variables
    private String name, breed, size, color;
    private char gender;
    private int age;

    //- Static variables
    public static boolean isAnimal;

    //-- Static block for initializing static variable
    static {
        isAnimal = true;
    }//static

    //- setInfo (instead of constructor)
    public void setInfo(String name, String breed, char gender, int age, String size, String color){
        setName(name);
        setBreed(breed);
        setGender(gender);
        setAge(age);
        setSize(size);
        setColor(color);
        //!!use set...() instead of this. bc it will only set with valid conditions
    }//setInfo


    //- Methods
    public void eat(){
        System.out.println(name+" is eating");
    }//eat
    public void drink(){
        System.out.println(name+" is drinking water");
    }//eat
    public void sleep(){
        System.out.println(name+" is sleeping");
    }//eat

    //- Getter and setter methods
    public String getName(){
        return name;
    }//getName
    public void setName(String name){
        this.name = name;
    }//setName
    public String getBreed(){
        return breed;
    }//getBreed
    public void setBreed(String breed){
        this.breed = breed;
    }//setBreed
    public char getGender(){
        return gender;
    }//getGender
    public void setGender(char gender){
        this.gender = gender;
    }//setGender
    public int getAge(){
        return age;
    }//getAge
    public void setAge(int age){
        this.age = age;
    }//setAge
    public String getSize(){
        return size;
    }//getSize
    public void setSize(String size){
        this.size = size;
    }//setSize
    public String getColor(){
        return color;
    }//getColor
    public void setColor(String color){
        this.color = color;
    }//setColor


    //- toString
    public String toString() {
        return getClass().getSimpleName()+"{" + //!! Change from "Class03_AnimalTask" to the name of the subclass
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }//toString


}//class
/*
0. Animal
			attributes:
					name, breed, gender, size, color, age
			methods:
				setInfo(), eat(), sleep(), drink(), toString()
 */