package day31_inheritance.vehicleTask;

public class Class01_Vehicle {

    //- Private instance variables
    private String brand, model, color;
    private int year;
    private double price;

    //- Constructor
    public Class01_Vehicle(String brand, String model, String color, int year, double price) {
        setBrand(brand);
        setModel(model);
        setColor(color);
        setYear(year);
        setPrice(price);
    }//constructor


    //- Getter and setter methods
    public String getBrand() {
        return brand;
    }//getBrand

    public void setBrand(String brand) {
        this.brand = brand;
    }//setBrand

    public String getModel() {
        return model;
    }//getModel

    public void setModel(String model) {
        this.model = model;
    }//setModel

    public String getColor() {
        return color;
    }//getColor

    public void setColor(String color) {
        this.color = color;
    }//setColor

    public int getYear() {
        return year;
    }//getYear

    public void setYear(int year) {
        this.year = year;
    }//setYear

    public double getPrice() {
        return price;
    }//getPrice

    public void setPrice(double price) {
        this.price = price;
    }//setPrice


    //- toString
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }//toString

}//class
/*
1. Create a class named Vehicle
                         Variables:
                                  brand, model, year, color, price
                         Encapsulate all the fields
                         Add a constructor that can set all the fields
                         Methods:
                                  toString()
        2. Create a sub class of Vehicle named Car
                         Extra methods:
                                  drive()
        3. Create a sub class of Vehicle named Bike
                         Extra methods:
                                  ride()
        4. Create a sub class of Vehicle named Boat
                         Extra methods:
                                  sail()
        5. Create a sub class of Vehicle named AirPlane
                         Extra methods:
                                  fly()

 */
