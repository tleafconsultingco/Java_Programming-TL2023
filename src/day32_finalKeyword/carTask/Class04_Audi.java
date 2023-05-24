package day32_finalKeyword.carTask;

public class Class04_Audi extends Class01_Car {

    public Class04_Audi(String model, String color, int year, double price) {
        super(model, color, year, price);
    }//constructor

    //- Override start method
    @Override
    public void start(){
        System.out.println("Press the start button to start "+getMake()+" "+getModel());
    }//start method
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