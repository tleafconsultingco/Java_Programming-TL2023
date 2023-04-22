package day26_statics;

public class Class09_TestIphoneObjects {


    public static void main(String[] args) {

        Class08_IPhone iPhone = new Class08_IPhone("iPhone12", "Black", 1000);

        System.out.println("iPhone model: "+iPhone.model);
        System.out.println("iPhone color: "+iPhone.color);
        System.out.println("iPhone price: "+iPhone.price);
            //iPhone model: iPhone12
            //iPhone color: Black
            //iPhone price: 1000.0

        iPhone.printPhoneInfo(); //!! instance method
            //Brand: Apple
            //Model: iPhone12
            //Color: Black
            //Price: 1000.0

        /*
        //!! These static variables can be called through the object...but it's not best practice, you don't need the object to print static members
        System.out.println( iPhone.brand );
        System.out.println( iPhone.OS );
        iPhone.printOperatingSystem();
        */

       //!! call static members through class name
        System.out.println(Class08_IPhone.brand);
        System.out.println(Class08_IPhone.OS);
        Class08_IPhone.printOperatingSystem();
            //Apple
            //iOS
            //Operating System: iOS



    }//main
}//class
