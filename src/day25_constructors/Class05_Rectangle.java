package day25_constructors;

public class Class05_Rectangle {

    //? When creating a custom class for rectangles, what do we need?
        //?? Instance variables -- length, width
        //?? Instance methods -- calc area
        //?? Ability to print

    public double length, width;
   /*
    public void setInfo(double length, double width){
        this.length = length;
        this.width = width;
    }//setInfo
*/
    public double area(){
        return length*width;
    }//area

    public String toString() {
        return "Class05_Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + area() +
                '}';
    }//toString


    //- Create a constructor

    public Class05_Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }//constructor

}//class
