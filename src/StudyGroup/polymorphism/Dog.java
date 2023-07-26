package studyGroup.polymorphism;

public class Dog extends Animal{

    public void bark(){
        System.out.println("dog barks");
    }

    void eats() {
        System.out.println(name+" eats dog food");
    }

    public static void main(String[] args) {
        Animal animal1 = new Dog();
       // animal1.eats(); //Doggy eats dog food


        Animal animal2 = new Dog();
        //animal2.bark(); //&& compile error

        Animal animal3 = new Dog();
        Dog dog = (Dog)animal3;
            //@@ downcasting opt 1
        dog.bark(); //Doggy barks

        Animal animal4 = new Dog();
            //@@ downcasting opt 2
        ((Dog)animal4).bark(); //Doggy barks


    }
}
