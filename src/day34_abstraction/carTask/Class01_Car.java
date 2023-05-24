package day34_abstraction.carTask;

public abstract class Class01_Car { //!! meant to be inherited, and cannot be instantiated

    //- Variables
    private final String make;
    private final String model;
    private String color;
    private final int year;
    private double price;

    //- Constructor
    public Class01_Car(String make, String model, String color, int year, double price) {
        this.make = getClass().getSimpleName(); //!! instead of asking for the argument "make" you can assign the class name to the instance variable "make"
        this.model = model;
        this.color = color; //!! use setter method
        this.year = year;
            if(year<1886){
                System.err.println("Invalid year: "+year);
                System.exit(1);
            }//if
        this.price = price; //!! use setter method
    }//constructor

    //- Getter and setter methods

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <= 0);{
            System.err.println("Invalid price: "+price);
            System.exit(1);
        }//if
    }

    //- Methods
    protected final void stop(){ //!! use protected access modifier bc you need to be able to inherit, but keep it restricted so that non-subclasses outside the package cannot access this method
        System.out.println("Press the brake to stop "+make+" "+model);
    }

    protected abstract void start(); //!! NO METHOD BODY, meant to be overridden

    //- toString
    /*
    public String toString() {
        return "Class01_Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
     */

    @Override
    public String toString() {
        return make+"{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price= $" + price +
                '}';
    }//toString


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