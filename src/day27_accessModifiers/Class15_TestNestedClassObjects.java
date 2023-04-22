package day27_accessModifiers;

public class Class15_TestNestedClassObjects {

    //- Testing Car class and CarEngine inner class
    public static void main(String[] args) {

        Class14_Car obj1 = new Class14_Car(); // Car object
        Class14_Car.CarEngine obj2 = obj1.new CarEngine(); //!! CarEngine object
            //!! Need to call the class (Class14_Car) before calling the inner class (CarEngine)

        //?? Inner classes can be static
        Class14_Car.StaticInnerClass obj3 =  new Class14_Car.StaticInnerClass();



    }//main
}//class
