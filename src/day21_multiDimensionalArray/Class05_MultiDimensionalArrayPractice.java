package day21_multiDimensionalArray;

import java.util.Arrays;

public class Class05_MultiDimensionalArrayPractice {
    public static void main(String[] args) {

        String[] group1 = {"Alpha","Bravo","Charlie","Delta"};
        String[] group2 = {"Echo","Foxtrot","Golf"};
        String[] group3 = {"Hotel","India","Juliet","Kilo","Lima"};
        String[] group4 = {"Mike","November"};
        //! Create 1 variable that contains all the groups
        //!! by using a 2D array
        String[][] allGroups = {group1, group2, group3, group4};

        System.out.println("----- Iterate arrays and elements: FOR-EACH LOOP -----");
        //!! Iterate all the arrays
        //! 1. Use a For-Each loop
        for (String[] array1D : allGroups) {
            //!! Iterate all the elements
            //! 2. Nest another For-Each loop
            for (String elements : array1D) {
                System.out.println(elements);
                    //Alpha
                    //Bravo
                    //Charlie
                    //Delta
                    //Echo
                    //Foxtrot
                    //Golf
                    //Hotel
                    //India
                    //Juliet
                    //Kilo
                    //Lima
                    //Mike
                    //November
            }//inner loop close
        }//outer loop close

        System.out.println("----- Iterate arrays and elements: FOR LOOP -----");
        //! 1. Use a For loop
        for (int i = 0; i < allGroups.length; i++) {
            //!! 1a. Initialize a new string array to hold the indexes of allGroups
            String[] eachGroup = allGroups[i];
            //! 2. Nest another For loop
            for (int j = 0; j < eachGroup.length; j++) {
                //!! 2a. change variable to j
                //!! 2b. Initialize a new string to hold the values of each 1D array element
                String eachStudent = eachGroup[j];
                System.out.println(eachStudent); // same results as in For-Each loop
            }
        }


        System.out.println("----- Iterate arrays and elements in reverse: COMBINED FOR AND FOR-EACH LOOP -----");

        //! 1. For reverse you need a For loop
        for (int i = allGroups.length - 1; i >= 0; i--) {
            //!! 1a. Create new string array to hold indexes of allGroups
            String[] eachGroup = allGroups[i]; //!! This will iterate all the 1D arrays w/in this MD array
            System.out.println(Arrays.toString(eachGroup));
                //[Mike, November]
                //[Hotel, India, Juliet, Kilo, Lima]
                //[Echo, Foxtrot, Golf]
                //[Alpha, Bravo, Charlie, Delta]
            //! 2. Use For-Each to iterate elements
            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);
                    //[Mike, November]
                    //Mike
                    //November
                    //[Hotel, India, Juliet, Kilo, Lima]
                    //Hotel
                    //India
                    //Juliet
                    //Kilo
                    //Lima
                    //[Echo, Foxtrot, Golf]
                    //Echo
                    //Foxtrot
                    //Golf
                    //[Alpha, Bravo, Charlie, Delta]
                    //Alpha
                    //Bravo
                    //Charlie
                    //Delta
            }//inner loop close
        }//outer loop close
        
        
        System.out.println("----- PRINTING MD ARRAY TO STRING -----");

        System.out.println(allGroups);
            //Hashcode error

        System.out.println( Arrays.toString(allGroups)); //!! toString() ==> for single dimensional arrays ONLY
            //Hashcode error

        System.out.println( Arrays.deepToString(allGroups) ); //!! deepToString() ==> for multi-dimensional dimensional arrays ONLY
            //[[Alpha, Bravo, Charlie, Delta], [Echo, Foxtrot, Golf], [Hotel, India, Juliet, Kilo, Lima], [Mike, November]]





    }//main close
}//class close
