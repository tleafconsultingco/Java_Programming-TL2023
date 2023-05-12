package day31_inheritance.vehicleTask;

public class Class03_Bike extends Class01_Vehicle{

    public Class03_Bike(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }//constructor

    public void ride(){
        System.out.println("Riding "+getBrand()+" "+getModel());
    }//ride

}//subclass
/*
 3. Create a sub class of Vehicle named Bike
                         Extra methods:
                                  ride()
 */
