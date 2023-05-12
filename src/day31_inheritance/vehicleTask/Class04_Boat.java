package day31_inheritance.vehicleTask;

public class Class04_Boat extends Class01_Vehicle{

    public Class04_Boat(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }//constructor

    public void sail(){
        System.out.println(getBrand()+" "+getModel()+" is sailing");
    }//sail

}//subclass
/*
  4. Create a sub class of Vehicle named Boat
                         Extra methods:
                                  sail()
 */