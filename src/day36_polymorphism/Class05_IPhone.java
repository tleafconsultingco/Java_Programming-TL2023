package day36_polymorphism;

import java.util.Arrays;

public class Class05_IPhone {


    //- Variables
    private String brand, model, size, color;
    private double price;

    //- Constructor
    public Class05_IPhone(String brand, String model, String size, String color, double price) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setColor(color);
        setPrice(price);
    }

    //- Getter and setter methods
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if( price <= 0){
            System.err.println("Invalid price: " + price);
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        String[] colors = {"Black", "White", "Silver", "Gold", "Pink", "Blue", "Red", "Gray"};
        if( Arrays.asList(colors).contains(color) ) {
            this.color = color;
        }else{
            System.err.println("Invalid color: "+color+"\n color of the can only be : "+ Arrays.toString(colors));
            System.exit(1);
        }

    }

    //- Additional methods
    public void call(long phoneNumber){
        System.out.println(getModel()+" is calling "+phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(getModel()+" is texting to "+phoneNumber);
    }


    //- toString
    public String toString() {
        return  getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }


    //- Override equals() method
    @Override
    public boolean equals(Object obj) {

        if( !(obj instanceof Class05_IPhone)){ //!! if the given object is not Iphone
            System.err.println("Invalid object, Object must be Iphone");
            System.exit(1);
        }


        if( model.equals(  ( (Class05_IPhone)obj ).model ) ){ //!! if the model of the Iphone is equal to the given Iphone's model

          /*
            if(color.equals( ( (IPhone)obj ).color  )   ){
            //!! if the color of the Iphone is equal to the given iphone's color
                return true;
            }

           */

            return true;
        }


        return false;
    }

}//class
