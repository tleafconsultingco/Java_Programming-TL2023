package day30_inheritance;

public class Class04_Nokia extends Class01_Phone {

    //- Calling constructor from super class
    public Class04_Nokia(String model, String size, String color, double price) {
        super("Nokia", model, size, color, price);
    }//constructor

    //- Additional methods
    public void selfDefense(){
        System.out.println(getBrand()+" "+getModel()+" can be used for self defense");
    }//selfDefense

}//subclass
/*
2.3 Nokia:
					Extra methods:
						selfDefense()
 */