package day27_accessModifiers;

public class Class01_Circle {

    //-- Instance variables
    public double radius, diameter;
    public static double pi = 3.14;

    //-- Constructor for setting radius and diameter
    public Class01_Circle(double radius){ //!! If you know the radius you can get the diameter...not required to include it bc its not necessary for other variables and methods
        this.radius = radius; //!! assign local variable to the instance variable

        diameter = radius*2; //!! don't need to use this keyword bc it's not in the parameter
    }

    //!! can't be static method bc static methods only accept static variables
    /*
    public static double calcArea(){ // static only accepts statics
        return radius * radius * pi;
    }
    */

    //-- Instance method
    public double calcArea(){
        return radius*radius*pi; //!! necessary to include make this as a return (vs void) method bc it will be called later
    }

    public double calcPerimeter(){
        return 2*radius*pi;
    }

    public static void printPi(){
        System.out.println("Pi's value is: "+pi);
    }

    public String toString() {
        return "Class01_Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", pi=" + pi +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}//class
/*
 Create a class named Circle:

		Attributes:
			radius, diameter, pi

		Add a constructor that can set All the fields (instances)

		Actions:
			calcArea(): returns the area of Circle
			calcPerimeter(): returns the perimeter of Circle
			printPi(): displays PI value
			toString(): displays the radius, diameter, pi, area and perimeter of the circle when the object of circle is passed in the print statement


 */