package day30_inheritance;

import java.util.Arrays;

public class Class01_Phone {

    //- Private instance variables
    private String brand, model, size, color;
    private double price;

    //- Constructor
    public Class01_Phone(String brand, String model, String size, String color, double price) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setColor(color);
        setPrice(price);
    }//constructor

    //- Encapsulate fields
    public String getBrand(){
        return brand;
    }//getBrand

    public void setBrand(String brand){
        this.brand = brand;
    }//setBrand

    public String getModel(){
        return model;
    }//getModel

    public void setModel(String model){
        this.model = model;
    }//setModel

    public String getSize(){
        return size;
    }//getSize

    public void setSize(String size){
        this.size = size;
    }//setSize

    public double getPrice(){
        return price;
    }//getPrice

    public void setPrice(double price){
        if (price <= 0){
            System.err.println("Price cannot be less than or equal to 0");
            System.exit(1);
        }//if
        this.price = price;
    }//setPrice

    public String getColor(){
        return color;
    }//getColor

    public void setColor(String color) {
        String[] colors = {"Black", "White", "Silver", "Gold", "Pink", "Blue","Red","Gray"}; //!! make a String array with valid colors
        //!! Color can only be set if it complies with if condition
        if (Arrays.asList(colors).contains(color)) { //!! Convert String array to Collection type, then use contains()
            this.color = color;
        } else {
            System.err.println("Invalid color: " + color + "\n color can only be: " + Arrays.toString(colors));
            System.exit(1);
        }//if-else
    }//setColor

    //- Methods
    public void call(long phoneNumber){
        System.out.println(getModel()+" is calling "+phoneNumber);
    }//call

    public void text(long phoneNumber){
        System.out.println(getModel()+" is texting "+phoneNumber);
    }//text

    //- toString
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }//toString


}//class
/*
1. Create a named Phone:
				Variables:
					brand, model, size, price, color

				Encapsulate all the fields
					Conditions:
						1. price can not be zero or negative
						2. color can only be set to:
								{"Black", "White", "Silver", "Gold", "Pink"}

				Add a constructor that can set all the fields

				Methods:
					call(long phoneNumber)
					text(long phoneNumber)
					toString()

	2. Create the following sub classes of Phone:

			2.1 Iphone:
					Extra methods:
						faceTime(phoneNumber)
						faceTile(email)

			2.2 Samsung:
					Extra methods:
						freeze()

			2.3 Nokia:
					Extra methods:
						selfDefense()
 */