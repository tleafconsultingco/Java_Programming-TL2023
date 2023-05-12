package day31_inheritance.methodOverriding_shape;

public class Class18_Square extends Class17_Shape{

    private double side;

    //- Constructor
    public Class18_Square(double side) {
        setSide(side);
    }//constructor

    //- Getter and setter method
    public double getSide() {
        return side;
    }//getSide

    public void setSide(double side) {
        this.side = side;
    }//setSide

    //- Override methods
    @Override
    public double area(){
        return side*side;
    }//area

    @Override
    public double perimeter(){
        return side*4;
    }//perimeter

    @Override
    public void draw(){
        super.draw();
        System.out.println("\t* * * * * *");
        for (int i = 0; i < 4; i++) {
            System.out.println("\t*         *");
        }//for loop
        System.out.println("\t* * * * * *");
    }//draw

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + getName() + '\'' +
                ", side='" + side + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }//toString

}//subsclass
