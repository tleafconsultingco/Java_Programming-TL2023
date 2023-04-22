package day26_statics;

public class Class08_IPhone {


    //- Variables

    //!! Brand == static
    //!! Model == instance
    //!! Color == instance
    //!! Price == instance
    //!! OS == static
    //!! madeIn == static
    //!! hasBattery == static
    //!! isTouchScreen == static
    //!! isExpensiveToFix == static


    public static String brand = "Apple"; //!! "Apple" is the brand of all the iphone objects

    public String model; //!! different models for iphone objects

    public String color;

    public double price;

    public static String OS = "iOS"; //!! operating system is same fro all the iphone objects

    public static String madeIn = "China";

    public static boolean hasBattery = true;

    public static boolean isTouchScreen = true;

    public static boolean isExpensiveToFix = true;



    //- Initialize constructor
    public Class08_IPhone(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    //- Methods
    /*
    public static void printPhoneInfo(){
    //!! static only accepts statics
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
    }
    */

    //!! instance methods accepts both static and none static
    //!! In order to use this method you need to create objects
    public void printPhoneInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
    }


    //!! static method can only be used with static variables
    //!! making this an instance method is possible, but you can only use it after being called by an object...not best practice unless you include instance variables
    public static void printOperatingSystem(){
        System.out.println("Operating System: " + OS);
    }



}//class
/*
Attributes:
    brand, model, color, price, OS, madeIn, hasBattery, isTouchScreen, isExpensiveToFix
 */