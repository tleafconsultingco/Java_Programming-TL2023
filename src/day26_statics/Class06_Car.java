package day26_statics;

public class Class06_Car {

    //- Creates instance variables
    public String make, model;
    public int year;
    public double price;
    public String color;

    public Class06_Car(String make) {
        this.make = make;
    }

    public Class06_Car(String make, String model) {
        this(make);
            //!! call the constructor instead of naming the variable
                //this.make = make;
        this.model = model;
    }


    public Class06_Car(String make, String model, int year) {
        this(make, model);
        this.year = year;
    }


    public Class06_Car(String make, String model, int year, double price) {
        this(make, model, year);
        this.price = price;
    }


    public Class06_Car(String make, String model, int year, double price, String color) {
        this(make, model, year, price);
        this.color = color;
    }


    public String toString() {
        return "Class06_Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }//toString




}//class
/*
class name: Car
		 instance variables:
		 		make, model, year, price, color
	 		1st constructor: initializes the make ONLY
	 		2nd constructor: initializes make & model
	 				(MUST use constructor call to set the make)
			3rd constructor: initializes make, model, year
					(MUST use constructor call to set the make, model)
			4th constructor: initializes make, model, year, price
					(MUST use constructor call to set the make, model, year)
			5th Constructor: initializes all the instances
					(MUST use constructor call to set the make, mode, year, price, color)
		instance methods: toString
 */