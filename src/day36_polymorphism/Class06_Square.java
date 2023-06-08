package day36_polymorphism;

public class Class06_Square {

    private double side;

    public Class06_Square(double side) {
        this.side = side;
    }


    @Override
    public boolean equals(Object obj) {

        if( !(obj instanceof Class06_Square) ){
            System.err.println("Invalid Object, Object must be square");
            System.exit(1);
        }


        if(side ==  ( (Class06_Square)obj ).side ){
            return true;
        }

        return false;
    }

}//class
