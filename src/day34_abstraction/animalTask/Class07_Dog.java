package day34_abstraction.animalTask;

public class Class07_Dog extends Class06_Animal implements Interface01_Playable, Interface03_Swimmable {

    public Class07_Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }//constructor


    //- Override abstract method

    @Override
    public void eat() {
        System.out.println("Dog "+getName()+" is eating dog food");
    }

    //- Override interface methods

    @Override
    public void play() {
        System.out.println("Dog "+getName()+" is playing");
    }

    @Override
    public void swim() {
        System.out.println("Dog "+getName()+" is swimming");
    }

    //- Additional method

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