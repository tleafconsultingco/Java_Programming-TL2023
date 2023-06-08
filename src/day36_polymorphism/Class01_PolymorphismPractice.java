package day36_polymorphism;

import day30_inheritance.*;

public class Class01_PolymorphismPractice {
    public static void main(String[] args) {

        // Class02_IPhone phone = new Class01_Phone("Iphone 11 Pro", "Large", "Black", 900);
        //!! child cannot be reference to the parent object

        // Class01_Phone phone =  new Class03_Samsung("Galaxy S19", "Medium", "Pink", 700);
        //!! parent can be used as the reference type for all objects made from its child class


        //! 0. Create array
        Class01_Phone[] phones = {
                new Class02_IPhone("Iphone 11 Pro", "Large", "Black", 900),
                new Class02_IPhone("Iphone 12 Pro Max", "Large", "Black", 1200),
                new Class02_IPhone("Iphone 9", "Medium", "Gold", 800),
                new Class03_Samsung("Galaxy S19", "Medium", "Pink", 700),
                new Class03_Samsung("Galaxy S20", "Large", "Silver", 850),
                new Class03_Samsung("Galaxy S21", "Large", "Black", 950),
                new Class04_Nokia("XR20", "Small", "Blue", 350),
                new Class04_Nokia("G10", "Medium", "Gray", 99),
                new Class04_Nokia("G50", "Large", "Silver", 250),
                new Class02_IPhone("Iphone 12 Pro", "Large", "Black", 1200),
                new Class02_IPhone("Iphone 11 Pro Max", "Large", "Silver", 1100),
                new Class03_Samsung("Galaxy S18", "Medium", "White", 750),
                new Class03_Samsung("Galaxy S17", "Large", "Silver", 650),
                new Class04_Nokia("G10", "Medium", "Black", 99),
                new Class02_IPhone("Iphone 6", "Smalle", "Gold", 400),
                new Class02_IPhone("Iphone 7", "Smalle", "White", 500)
        };


        //! 1. Print
        System.out.println("-- print model, color, and price --");

        for (Class01_Phone eachPhone : phones){
            System.out.println(eachPhone.getModel()+" - "+eachPhone.getColor()+" - $"+eachPhone.getPrice());
                //Iphone 11 Pro - Black - $900.0
                //Iphone 12 Pro Max - Black - $1200.0
                //Iphone 9 - Gold - $800.0
                //Galaxy S19 - Pink - $700.0
                //Galaxy S20 - Silver - $850.0
                //Galaxy S21 - Black - $950.0
                //XR20 - Blue - $350.0
                //G10 - Gray - $99.0
                //G50 - Silver - $250.0
                //Iphone 12 Pro - Black - $1200.0
                //Iphone 11 Pro Max - Silver - $1100.0
                //Galaxy S18 - White - $750.0
                //Galaxy S17 - Silver - $650.0
                //G10 - Black - $99.0
                //Iphone 6 - Gold - $400.0
                //Iphone 7 - White - $500.0
        }//for-each


        //! 2-3. How many iphones and samsung?
        int numberIphone = 0;

        for (Class01_Phone iphone : phones) {
            if(iphone instanceof Class02_IPhone){
                numberIphone++;
            }//if
        }//for-each

        int numberSamsung = 0;
        for (Class01_Phone samsung : phones) {
            if (samsung instanceof Class03_Samsung){
                numberSamsung++;
            }//if
        }//for-each

        System.out.println("numberIphone = " + numberIphone); //numberIphone = 7
        System.out.println("numberSamsung = " + numberSamsung); //numberSamsung = 5

        //! 4. Display iphones and samsung with price >= 700

        for (Class01_Phone each : phones) {
            if (each instanceof Class02_IPhone || each instanceof Class03_Samsung){ //!! if iphone or samsung
                if (each.getPrice() >=700){ //!! if price is equal or greater than 700
                    //!! use getPrice() method since the data is hidden
                    System.out.println(each.getModel());
                        //Iphone 11 Pro
                        //Iphone 12 Pro Max
                        //Iphone 9
                        //Galaxy S19
                        //Galaxy S20
                        //Galaxy S21
                        //Iphone 12 Pro
                        //Iphone 11 Pro Max
                        //Galaxy S18
                }//nested if
            }//if
        }//for-each


    }//main
}//class
/*
1. print the model, color and price of each phone object in the following format
    				model - color - price

	2. How many Iphones in the array of phones?

	3. How many Samsungs in the array of phones?

	4. Display the models of Iphones and samsung that has the price of 700 or greater
 */