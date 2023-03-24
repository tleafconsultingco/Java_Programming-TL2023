package day18_garbageCollection;

public class Class01_Pizza {

    // 1. create INSTANCE VARIABLES
    public char size;
    public int numberOfCheeseTopping,
            numberOfPepperoniTopping;


    // 2. create INSTANCE METHODS
    // This method calculates the total price of the pizza, and returns it as a double
    public double calcCost() {
        double totalPrice = 0;
        // 2a. need to determine cost based on size
        switch (size) {
            case 'S':
            case 's':
                totalPrice = 10 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
                break;
            case 'M':
            case 'm':
                totalPrice = 12 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
                break;
            case 'L':
            case 'l':
                totalPrice = 14 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
                break;
            default:
                System.err.println("Invalid size: " + size);
                break;
        } // close switch
        return totalPrice;
    } // close calcCost()

    // 3. toString()
    // This method is used for displaying information about the object when it is created and printed
    public String toString() {
        return "Class01_Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                // manually add the custom method calcCost
                ", totalPrice=" + calcCost() +
                '}';
    }


    // 4. create custom method with instance variables to make it easier when creating objects
    public void setInfo(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }


} // class close
/*
Create a class named Pizza:
Attributes:
1. size
2. numberOfCheeseTopping
3. numberOfPepperoniTopping
Actions:
calcCost(): returns the total cost of the pizza
toString(): returns a String containing the pizza size, quantity of
each topping, and the pizza cost as calculated by calcCost()
Pizza cost is determined by:
S: $10 + $2 per topping M: $12 + $2 per topping
L: $14 + $2 per topping
 */