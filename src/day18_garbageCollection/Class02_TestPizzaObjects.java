package day18_garbageCollection;

public class Class02_TestPizzaObjects {
    // 1. add main method because we will run code
    public static void main(String[] args) {

        // 2. create pizza object
        Class01_Pizza pizza1 = new Class01_Pizza();
        pizza1.setInfo('m', 2, 1);
        System.out.println(pizza1);

        Class01_Pizza pizza2 = new Class01_Pizza();

        // 4a.
        double total = 0;

        // 3. what if I want to create 20 pizza objects for each size? Use a loop
        for (int i = 0; i < 20; i++) {

            Class01_Pizza small = new Class01_Pizza();
            small.setInfo('S', 2, 2);
            total += small.calcCost(); // 4b.

            Class01_Pizza med = new Class01_Pizza();
            med.setInfo('M', 3, 4);
            total += med.calcCost(); // 4c.

            Class01_Pizza large = new Class01_Pizza();
            large.setInfo('L', 4, 5);
            total += large.calcCost(); // 4d.


        }

        // 4. what if I want to calculate the total cost for the 60 pizzas? before loop then create variable and then increase the value under each condition in the loop


        // 5. display total price of 60 pizzas
        System.out.println("total = " + total); // 1520


    } // main close
} // class close
