package day30_inheritance;

public class Class02_IPhone extends Class01_Phone { //IPhone is a phone

    public static boolean hasApplePay = true;

    //- Calling constructor from super class
    public Class02_IPhone(String model, String size, String color, double price) {
        super("Apple", model, size, color, price); //!! super calls the parent class constructor
    }

    //- Additional methods
    public void faceTime(long phoneNumber){
        System.out.println(getModel()+" is facetiming with "+phoneNumber);
    }//facetime

    public void faceTime(String email){
        System.out.println(getModel()+" is facetiming with "+email);
    }//facetime


}//subclass
/*
2.1 Iphone:
					Extra methods:
						faceTime(phoneNumber)
						faceTile(email)
 */