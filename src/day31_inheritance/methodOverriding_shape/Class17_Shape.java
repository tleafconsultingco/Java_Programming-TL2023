package day31_inheritance.methodOverriding_shape;

public class Class17_Shape {

    private String name;

    //- Constructor to set name of the shape
    public Class17_Shape(){
        setName(getClass().getSimpleName()); //!! set name of shape to the sub class name
    }//constructor

    public String getName() {
        return name;
    }//getName

    public void setName(String name) {
        this.name = name;
    }//setName


    public double area(){
        return 0; //!! set to 0 bc it will be overridden in sub classes
    }//area

    public double perimeter(){
        return 0; //!! set to 0 bc it will be overridden in sub classes
    }//perimeter

    public void draw(){
        System.out.println("Drawing a "+getClass().getSimpleName()+": ");
    }//draw

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }//toString



}//class
