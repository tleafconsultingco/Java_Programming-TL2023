package day27_accessModifiers;

public class Class14_Car { //!! Outer class

    //- Instance variables
    public String make, model, color;
    public int year;
    public double price;

    //- Static variables
    public static int wheels = 4;

    //- Inner class
    public class CarEngine{ //!! Inner class
        //!! Can access any of the outer classes members

        //-- method with members of the outer class
        public void method(){
            System.out.println(make);
            System.out.println(wheels);
        }//method

    }//inner class

    //- Inner class, static
    public static class StaticInnerClass{ //!! Inner class
        //!! Can access any of the outer classes members
        //!! Only accepts static

        //-- method with members of the outer class
        public void method(){
            //  System.out.println(make);
            System.out.println(wheels);
        }

    }//inner class

}//outer class
