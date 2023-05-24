package day32_finalKeyword.carTask;

public class Class01_Car {

    //- Instance variables
    private String make, model, color;
    private int year;
    private double price;

    //- Static variables
    public static int numberOfWheels;
    public static boolean hasBattery;

    //- Constructor
    public Class01_Car(String model, String color, int year, double price) {
        setMake( getClass().getSimpleName() ); //!! setting the class name to the make of the car
        setModel(model);
        setColor(color);
        setYear(year);
        setPrice(price);
    }//constructor

    //- static block
    static{
        numberOfWheels = 4;
        hasBattery = true;
    }//static block

    //- Getter and setter instance methods
    public String getMake() {
        return make;
    }//getMake method

    public void setMake(String make) {
        this.make = make;
    }//setMake method

    public String getModel() {
        return model;
    }//getModel method

    public void setModel(String model) {
        this.model = model;
    }//setModel method

    public String getColor() {
        return color;
    }//getColor method

    public void setColor(String color) {
        this.color = color;
    }//setColor method

    public int getYear() {
        return year;
    }//getYear method

    public void setYear(int year) {
        if(year <= 0 ){ //!! if specified year is negative or zero
            System.err.println("Invalid year: "+year);
            System.exit(1); //!! terminates the program
        }//if
        this.year = year;
    }//setYear method with conditions

    public double getPrice() {
        return price;
    }//getPrice method

    public void setPrice(double price) {
        if(price <= 0){ //!! if specified price is negative or zero
            System.err.println("Invalid price: "+price);
            System.exit(1); //!! terminates the program
        }//if
        this.price = price;
    }//setPrice method with conditions


    //- Method
    public void start(){
        System.out.println("Press the brake and twist the key to ignition to start "+make+" "+model);
    }//start method

    //- toString
    @Override
    public String toString() {
        return make+"{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", wheels=" + numberOfWheels +
                '}';
    }//toString

}//class
/*
1. Create a class named Car
            Variables:
                make, model, color, year, price, numberOfWheels (static), hasBattery (static)

            Encapsulate all the fields
                    Condition:
                        1. year can not be negative or zero
                        2. price can not be negative or zero

            Add a constructor that can set all the fields
                    note: make of the car can be set to the class name

            Methods:
                start(): "Press the brake and twist the key to ignition"

                toString()
 */