package day35_polymorphism.transportationTask;

import day34_abstraction.animalTask.Interface02_Flyable;

public abstract class Class03_Plane extends Class01_Transportation implements Interface02_Flyable {

    public Class03_Plane(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }//constructor


    //- Additional methods
    public void land(){
        System.out.println("Plane "+getMake()+" "+getModel()+" is landing");
    }

    //- Override interface methods

    @Override
    public void fly() {
        System.out.println(getMake()+" "+getModel()+" is flying");
    }
}//class
/*
1. Create an abstract class named Transpotation
				Variables:
					make (final), model (final), color, year(final), price

				Encapsulate all the fields

				Add a constructor that can set all the fields

				abstract methods:
					transportPeople();
					start();

				non abstract methods:
					stop(): "Shut off the engine"
					toString()

	2. Create an interface named AutoPark

				abstract methods:
					autoPark()

	3. Create a sub interface of AutoPark named AutoPilot:

				abstract methods:
						autoPilot()

	4. Create an interface named Electric

				abstract methods:
					charge()


	5. Create an abstract sub class of Transpotation named Car

				extra methods:
					drive()


	6. Create an abstract sub class of Transpotation named Plane that implements Flyable

				non-abstract method:
					land()


	7. Create a sub class of car named Audi that implements AutoPark


	8. Create a sub class of Car named Tesla that implements AutoPark, AutoPilot and Electric

 */