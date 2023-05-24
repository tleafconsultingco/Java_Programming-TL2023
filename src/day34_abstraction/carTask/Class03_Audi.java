package day34_abstraction.carTask;

public class Class03_Audi extends Class01_Car{

    public Class03_Audi(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }//constructor

    @Override
    public void start() { //!! change from protected to public so it can be accessed across packages without inheritance
        System.out.println("Press the start button to start "+getMake()+" "+getModel());
    }//start method

    public void autoPark(){
        System.out.println(getMake()+" "+getModel()+" has auto park feature");
    }


}//class
/*
1. Create an abstract class named Car
			variables:
				make (final), model (final), color, year (final), price

			Encapsulate all the fields
				Conditions:
					1. year can not be less than 1886
					2. price can not be less than negative or zero

			Add a constructor that can set all the fields
				Note: Class name can be set to the make of the car

			Methods:
				stop() (final): prints "Presse the brake"

				start() (abstract)

				toString(): prints the given car info when a car object is passed in the print statement

	2. Create the following sub classes of Car
			1. Honda
			2. Audi
					extra methods:
						autoPark()
			3. Tesla
					extra methods:
						autoPilot()

 */