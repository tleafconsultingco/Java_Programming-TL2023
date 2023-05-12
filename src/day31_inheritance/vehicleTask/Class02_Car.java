package day31_inheritance.vehicleTask;

public class Class02_Car extends Class01_Vehicle{

    public Class02_Car(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }//constructor

    public void drive(){
        System.out.println("Driving "+getBrand()+" "+getModel());
    }//drive


}//subclass
/*
 2. Create a sub class of Vehicle named Car
                         Extra methods:
                                  drive()
 */