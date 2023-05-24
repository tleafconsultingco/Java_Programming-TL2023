package day32_finalKeyword.carTask;

public class Class07_TestCarObject {
    public static void main(String[] args) {

        Class02_Toyota toyota = new Class02_Toyota("Camry", "Blue", 2020, 25000);

        Class03_Honda honda = new Class03_Honda("Accord", "Gray", 2019, 24000);

        Class04_Audi audi = new Class04_Audi("Q6", "Silver", 2021, 50000);

        Class05_BMW bmw = new Class05_BMW("X6", "Black", 2017, 45000);

        Class06_Tesla tesla = new Class06_Tesla("Model 3", "White", 2022, 65000);

        System.out.println("toyota = " + toyota);
        System.out.println("honda = " + honda);
        System.out.println("audi = " + audi);
        System.out.println("bmw = " + bmw);
        System.out.println("tesla = " + tesla);

        /*
        toyota = Class02_Toyota{model='Camry', color='Blue', year=2020, price=25000.0, wheels=4}
        honda = Class03_Honda{model='Accord', color='Gray', year=2019, price=24000.0, wheels=4}
        audi = Class04_Audi{model='Q6', color='Silver', year=2021, price=50000.0, wheels=4}
        bmw = Class05_BMW{model='X6', color='Black', year=2017, price=45000.0, wheels=4}
        tesla = Class06_Tesla{model='Model 3', color='White', year=2022, price=65000.0, wheels=4}
         */


        System.out.println("-- start methods --");
        //!! Same method with different implementations

        toyota.start(); //Press the brake and twist the key to ignition to start Class02_Toyota Camry
        honda.start(); //Press the brake and twist the key to ignition to start Class02_Toyota Camry
        audi.start(); //Press the start button to start Class04_Audi Q6
        bmw.start(); //Call the mechanic or jump start Class05_BMW X6
        tesla.start(); //Say "Start" to start Class06_Tesla Model 3

        System.out.println("-- Overridden methods for tesla --");

        tesla.setPrice(30000); //!! Cannot be <50000
            //Invalid price for tesla car: 30000.0

        System.out.println(tesla); //Class06_Tesla{model='Model 3', color='White', year=2022, price=65000.0, wheels=4}

    }//main


}//class
/*
2. Create the following sub classes and override the start() method if needed:

            1. Toyota
                	start(): "Press the brake and twist the key to ignition"

            2. Honda
                    start(): "Press the brake and twist the key to ignition"

            3. Audi
                	start(): "Press the start button"

            4. BMW
                	start(): "Call the mechanic or jump start "

            5. Tesla
               		start(): "Say \"Start\""

	                Extra method:
	                	  autoPilot()


	                Extra Conditions for the variables:
	                    1. Model of tesla can only be set to one of the followings:
	                        {"Model S", "Model Y", "Model x", "Model 3" };
	                    2. color of tesla can only be set to one of the followings:
	                        {"White", "Red", "Black", "Silver", "Blue", "Brown", "Green"}
	                    3. year of the tesla can not be less than 2008
	                    4. price of tesla can not be less than 50k
 */