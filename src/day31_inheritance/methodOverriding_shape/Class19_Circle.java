package day31_inheritance.methodOverriding_shape;

public class Class19_Circle extends Class17_Shape {

    private double radius;

    public Class19_Circle(double radius) {
        setRadius(radius);
    }//constructor

    public double getRadius() {
        return radius;
    }//getRadius

    public void setRadius(double radius) {
        this.radius = radius;
    }//setRadius


    @Override
    public double area() {
        return radius * radius * 3.14;
    }//area

    @Override
    public double perimeter() {
        return 6.28 * radius;
    }//perimeter

    @Override
    public void draw() {
        super.draw();
        // code fragments that can draw a circle
    }//draw

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + getName() + '\'' +
                ", radius='" + radius + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }//toString


}//subclass
