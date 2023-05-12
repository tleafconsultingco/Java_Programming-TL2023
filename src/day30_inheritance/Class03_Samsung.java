package day30_inheritance;

public class Class03_Samsung extends Class01_Phone{

    //- Calling constructor from super class
    public Class03_Samsung(String model, String size, String color, double price) {
        super("Samsung", model, size, color, price);
    }//constructor

    //- Additional methods
    public void freeze(){
        System.out.println(getBrand()+" "+getModel()+" freezes a lot");
    }//freeze

}//subclass
/*
2.2 Samsung:
					Extra methods:
						freeze()
 */