package day35_polymorphism.transportationTask;

public class Class05_Tesla extends Class02_Car implements Interface01_Autopark, Interface02_Autopilot, Interface03_Electric{

    public Class05_Tesla(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }//constructor

    //- Override abstract methods
    @Override
    public void transportPeople() {
        System.out.println(getMake()+" "+getModel()+" can transport people");
    }
    @Override
    public void start() {
        System.out.println(getMake()+" "+getModel()+" starts with voice command");
    }


    //- Override interface methods
    @Override
    public void autopark() {
        System.out.println(getMake()+" "+getModel()+" has autopark");
    }
    @Override
    public void selfDrive() {
        System.out.println(getMake()+" "+getModel()+" can self drive");
    }
    @Override
    public void charge() {
        System.out.println(getMake()+" "+getModel()+" charges");
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