package day25_constructors;

public class Class06_TestRectangleObjects {
    public static void main(String[] args) {

        //? Create objects using the Rectangle constructor
            //?? Constructor is executed for each object separately
        Class05_Rectangle rectangle1 = new Class05_Rectangle(3,4);
        Class05_Rectangle rectangle2 = new Class05_Rectangle(4,5);
        Class05_Rectangle rectangle3 = new Class05_Rectangle(5,6);
        Class05_Rectangle rectangle4 = new Class05_Rectangle(6,7);
        Class05_Rectangle rectangle5 = new Class05_Rectangle(7,8);

        System.out.println("rectangle1 = " + rectangle1);
        System.out.println("rectangle2 = " + rectangle2);
        System.out.println("rectangle3 = " + rectangle3);
        System.out.println("rectangle4 = " + rectangle4);
        System.out.println("rectangle5 = " + rectangle5);
            //rectangle1 = Class05_Rectangle{length=3.0, width=4.0, area=12.0}
            //rectangle2 = Class05_Rectangle{length=4.0, width=5.0, area=20.0}
            //rectangle3 = Class05_Rectangle{length=5.0, width=6.0, area=30.0}
            //rectangle4 = Class05_Rectangle{length=6.0, width=7.0, area=42.0}
            //rectangle5 = Class05_Rectangle{length=7.0, width=8.0, area=56.0}




        /*
        //? Create object using the custom class Rectangle
        
        Class05_Rectangle rectangle1 = new Class05_Rectangle(); //!! Default constructor
        System.out.println("rectangle1 = " + rectangle1);
            //rectangle1 = Class05_Rectangle{length=0.0, width=0.0, area=0.0}
        
        //?? The object did not pass any arguments...we didn't call the setInfo() method
        rectangle1.setInfo(3,4);
        System.out.println("rectangle1 = " + rectangle1);
            //rectangle1 = Class05_Rectangle{length=3.0, width=4.0, area=12.0}

        Class05_Rectangle rectangle2 = new Class05_Rectangle();
        Class05_Rectangle rectangle3 = new Class05_Rectangle();
        Class05_Rectangle rectangle4 = new Class05_Rectangle();
        Class05_Rectangle rectangle5 = new Class05_Rectangle();

        System.out.println("rectangle2 = " + rectangle2);
        System.out.println("rectangle3 = " + rectangle3);
        System.out.println("rectangle4 = " + rectangle4);
        System.out.println("rectangle5 = " + rectangle5);
            //rectangle2 = Class05_Rectangle{length=0.0, width=0.0, area=0.0}
            //rectangle3 = Class05_Rectangle{length=0.0, width=0.0, area=0.0}
            //rectangle4 = Class05_Rectangle{length=0.0, width=0.0, area=0.0}
            //rectangle5 = Class05_Rectangle{length=0.0, width=0.0, area=0.0}

        rectangle2.setInfo(4,5);
        rectangle3.setInfo(5,6);
        rectangle4.setInfo(6,7);
        rectangle5.setInfo(7,8);

        System.out.println("rectangle2 = " + rectangle2);
        System.out.println("rectangle3 = " + rectangle3);
        System.out.println("rectangle4 = " + rectangle4);
        System.out.println("rectangle5 = " + rectangle5);
            //rectangle2 = Class05_Rectangle{length=4.0, width=5.0, area=20.0}
            //rectangle3 = Class05_Rectangle{length=5.0, width=6.0, area=30.0}
            //rectangle4 = Class05_Rectangle{length=6.0, width=7.0, area=42.0}
            //rectangle5 = Class05_Rectangle{length=7.0, width=8.0, area=56.0}

        //?? setInfo() method is required for every single object...better to create a constructor!
*/


    }//main
}//class
