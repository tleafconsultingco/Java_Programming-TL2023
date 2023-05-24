package day34_abstraction.carTask;

public class Class05_TestCarObjects {
    public static void main(String[] args) {

        //!! cannot create object from car class because it is abstract
        // Class01_Car car1 = new Class01_Car("X6", "Red", 2020, 45000);

        Class02_Honda honda = new Class02_Honda("Honda","Pilot","Black",2019,35000);

        Class03_Audi audi = new Class03_Audi("Audi","Q6", "Silver", 2020, 36000);

        Class04_Tesla tesla = new Class04_Tesla("Tesla","Model Y", "Blue", 2022, 60000);

        System.out.println("honda = " + honda);
            //honda = Class02_Honda{model='Pilot', color='Black', year=2019, price= $35000.0}
        System.out.println("audi = " + audi);
            //audi = Class03_Audi{model='Q6', color='Silver', year=2020, price= $36000.0}
        System.out.println("tesla = " + tesla);
            //tesla = Class04_Tesla{model='Model Y', color='Blue', year=2022, price= $60000.0}

        System.out.println("-- stop method (final) --");

        honda.stop(); //Press the brake to stop Class02_Honda Pilot
        audi.stop(); //Press the brake to stop Class03_Audi Q6
        tesla.stop(); //Press the brake to stop Class04_Tesla Model Y

        System.out.println("-- start method (abstract) --");

        honda.start(); //Twist the key in ignition to start Class02_Honda Pilot
        audi.start(); //Press the start button to start Class03_Audi Q6
        tesla.start(); //Use voice control to start Class04_Tesla Model Y

        System.out.println("-- sub class methods --");
        audi.autoPark(); //Class03_Audi Q6 has auto park feature
        tesla.autoPilot(); //Class04_Tesla Model Y has auto pilot feature



    }//main
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