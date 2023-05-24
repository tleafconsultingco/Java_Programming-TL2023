package day32_finalKeyword.carTask;

import java.util.ArrayList;
import java.util.Arrays;

public final class Class06_Tesla extends Class01_Car { //!! make this subclass final so it cannot be inherited

    public Class06_Tesla(String model, String color, int year, double price) {
        super(model, color, year, price);
    }//constructor

    //- Method
    public final  void autoPilot(){
        System.out.println(getMake()+" "+getModel()+" is in self-driving mode");
    }

    //- Override start method
    @Override
    public void start() {
        System.out.println("Say \"Start\" to start " +getMake()+" "+getModel());
    }//start method

    //- Override setModel method
    @Override
    public void setModel(String model) {
        /* Array is an option, but ArrayList is better since it can directly use contains method
        //!! Create Array with the models as elements
        String[] modelsArray = {"Model S", "Model Y", "Model X", "Model 3"};
        //!! Convert Array to Collections type using asList() so you can use contains()
        //!! Create condition to print error if the incorrect model is entered
                if(!Arrays.asList(modelsArray).contains(model)){
                    System.err.println("Invalid Tesla model: "+model);
                    System.exit(1);
                }
                super.setModel(model); // this.model = model;
*/

        //!! Create ArrayList with the models using addAll()
        ArrayList<String> models = new ArrayList<>();
        models.addAll(Arrays.asList("Model S", "Model Y", "Model X", "Model 3"));
        //!! Create condition to print error if the incorrect model is entered
        if(!models.contains(model)){ //!! if specified model is not valid model
            System.err.println("Invalid Tesla Model: "+model);
            System.exit(1); //!! terminate program
        }//if

        super.setModel(model); // this.model = model;
    }//setModel method

    //- Override setColor method
    @Override
    public void setColor(String color) {
        ArrayList<String> colors = new ArrayList<>();
        colors.addAll(Arrays.asList("White", "Red", "Black", "Silver", "Blue", "Brown", "Green"));

        if(!colors.contains(color)){
            System.err.println("Invalid Tesla Color: "+color);
            System.exit(1);
        }//if

        super.setColor(color); // this.color = color;
    }//setColor method


    //- Override setYear method
    @Override
    public void setYear(int year) {

        if(year < 2008){
            System.err.println("Invalid year of Tesla car: "+year);
            System.exit(1);
        }//if

        super.setYear(year);
    }//setYear


    //- Override setPrice method
    @Override
    public void setPrice(double price) {

        if(price < 50000){
            System.err.println("Invalid price for tesla car: "+price);
            System.exit(1);
        }//if

        super.setPrice(price);
    }//setPrice method

}//class
/*
2. Create the following subclasses and override the start() method if needed:

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