package day26_statics;

public class Class07_TestCarObjects {

    public static void main(String[] args) {

        Class06_Car car1 = new Class06_Car("BMW");
        System.out.println("car1 = " + car1);
            //car1 = Class06_Car{make='BMW', model='null', year=0, price=0.0, color='null'}

        Class06_Car car2 = new Class06_Car("Audi", "Q4");
        System.out.println("car2 = " + car2);
            //car2 = Class06_Car{make='Audi', model='Q4', year=0, price=0.0, color='null'}

        Class06_Car car3 = new Class06_Car("Toyota", "Camry", 2021);
        System.out.println("car3 = " + car3);
            //car3 = Class06_Car{make='Toyota', model='Camry', year=2021, price=0.0, color='null'}

        Class06_Car car4 = new Class06_Car("Honda", "Accord", 2020, 30000);
        System.out.println("car4 = " + car4);
            //car4 = Class06_Car{make='Honda', model='Accord', year=2020, price=30000.0, color='null'}

        Class06_Car car5 = new Class06_Car("Lexus", "RX350", 2019, 40000, "Black");
        System.out.println("car5 = " + car5);
            //car5 = Class06_Car{make='Lexus', model='RX350', year=2019, price=40000.0, color='Black'}
    }//main


}//class
