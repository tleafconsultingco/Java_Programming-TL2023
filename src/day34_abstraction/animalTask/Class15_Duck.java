package day34_abstraction.animalTask;

public class Class15_Duck extends Class06_Animal implements Interface01_Playable, Interface03_Swimmable, Interface02_Flyable{

    public Class15_Duck(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }//constructor

    //- Override abstract methods

    @Override
    public void eat() {
        System.out.println("Duck "+getName()+" is eating worms");
    }


    //- Override interface methods

    @Override
    public void play() {
        System.out.println("Duck "+getName()+" is playing");
    }

    @Override
    public void fly() {
        System.out.println("Duck "+getName()+" is flying");
    }

    @Override
    public void swim() {
        System.out.println("Duck "+getName()+" is swimming");
    }
}//class
/*
Animal task:
	interface Swimmable
		swim()

	interface Flyable
			fly();

	interface Wild:
			hunt();

	interface Plyable
			play();


	abstractClass Animal:
		eat();
		drink();



	Dog extend Animal implements Plyable, Swimmable

	Cat extend Animal implements Plyable

	Cow extend Animal implements Plyable

	Horse extend Animal implements Plyable

	Parrot extend Animal implements Plyable, Flyable

	Eagle extend Animal implements Wild, Flyable

	Tiger extend Animal implements Wild

	Lion extend Animal implements Wild

	Falcon extend Animal implements Wild, Flyable

	Shark extend Animal implements Wild, Swimmable

	Dolphin extend Animal implements Plyable, Swimmable

	Duck extend Animal implements Plyable, Swimmable, Flyable

	Java extend Animal implements Plyable, Swimmable, Flyable, Wild



Person implement Swimmable, Playable

Boat implement Swimmable

Airpalne implements Flyable

CydeoCar implement Swimmable, Flyable

PlayStation implements Playable
 */