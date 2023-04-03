package day17_customClass;

public class Class05_Dog {
    // do not create main method

    // what kind of information do we want to collect?

    // INSTANCE VARIABLES (all objects will have these variables)
    // these are the attributes
    public String name; // cannot assign value to the variable name, it will be set when called w/in the object
    public String breed;
    public String size;
    public char gender;
    public int age;
    public String color;

    //! Create a custom method for INSTANCE VARIABLES
    //!! So you don't need to type out all the instance variables when used for objects
    public void setInfo(String name, String breed, String size, char gender, int age, String color){ //?? these are local variables in the signature
        //-- you need to assign the argument to the instance variable, by default it will call the local variable, but we need to set it to the instance name. Need to force compiler to call the instance variable name by using (this.)
        this.name = name;
        this.breed = breed;
        this.size = size;
        this.gender = gender;
        this.age = age;
        this.color = color;
    }//custom class close

    //! INSTANCE METHODS (all objects will have these variables)
    //!! these are the actions
    public void eat(){
        System.out.println(name+" is eating dog food");
    }
    public void drinking(){
        System.out.println(name+" is drinking water");
    }
    public void play(){
        System.out.println(name+" is playing");
    }

    //! toString() method required to be able to print object when it's called in a main method
    public String toString() { //?? to avoid getting hashcode when trying to print object
        return "Class05_Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }//custom method close


    // create 2 dog objects


}
