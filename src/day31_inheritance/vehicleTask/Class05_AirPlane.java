package day31_inheritance.vehicleTask;

public class Class05_AirPlane extends Class01_Vehicle{

    public Class05_AirPlane(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }//constructor

    public void fly(){
        System.out.println(getBrand()+" "+getModel()+" "+ " is flying");
    }//fly

}//subclass
/*
  5. Create a sub class of Vehicle named AirPlane
                         Extra methods:
                                  fly()
 */