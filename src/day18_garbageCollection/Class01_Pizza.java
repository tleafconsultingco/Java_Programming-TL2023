package day18_garbageCollection;

public class Class01_Pizza {

    // 1. create INSTANCE VARIABLES
    public char size;
    public int numberOfCheeseTopping,
            numberOfPepperoniTopping;

    // 2. create INSTANCE METHODS
    public double calcCost() {
        double totalPrice = 0;
        // 2a. need to determine cost based on size
        switch(size){
            case 'S':
            case 's':
                totalPrice = 10+(2*(numberOfCheeseTopping+numberOfPepperoniTopping));
                break;
            case 'M':
            case 'm':
                totalPrice = 12+(2*(numberOfCheeseTopping+numberOfPepperoniTopping));
            case 'L':
            case 'l':
                totalPrice = 14+(2*(numberOfCheeseTopping+numberOfPepperoniTopping));
            default:
                System.err.println("Invalid size: "+size);
        } // close switch
            return totalPrice;
    } // close calcCost()

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