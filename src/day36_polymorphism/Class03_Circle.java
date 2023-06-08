package day36_polymorphism;

public class Class03_Circle {

    //- Variables
    private double radius;
    public final static double PI = 3.14;

    //- Getter and setter methods
    public Class03_Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    //- Constructor
    public void setRadius(double radius) {
        this.radius = radius;
    }

    //- Additional methods
    public double area(){
        return radius * radius * PI;
    }

    public double perimeter(){
        return 2 * radius * PI;
    }

    //- toString
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + area() +
                ", perimeter=" + area() +
                '}';
    }

    //-- Override equals method from object class
    @Override
    public boolean equals(Object obj) {
        //!! original method passes the object parameter, since object is the parent class and can reference all objects
        //!! obj is the reference variable

        //!! if the specified object is not circle, then we should not compare them
        if( !(obj instanceof Class03_Circle) ){
            System.err.println("Invalid Object");
            System.exit(1);
        }//if

        //!! if the current circle's radius is equal to the given circle's radius, then two circles are equal
        if( this.radius ==  ( (Class03_Circle)obj ).radius ){ //!! cast the obj to circle in order to use radius method
            return true;
        }//if

        return false;
    }//equals method


    // .equals()

}//class
