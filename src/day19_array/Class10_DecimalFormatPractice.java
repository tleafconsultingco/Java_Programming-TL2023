package day19_array;

import java.text.DecimalFormat;

public class Class10_DecimalFormatPractice {
    public static void main(String[] args) {

        double n1 = 10.587654;
            // if you round to 2 decimals the result will be 10.59

        //! In Java, in order to round up you can declare the DecimalFormat
            //!! import from text package
        DecimalFormat df = new DecimalFormat("0.000");
        System.out.println("df = " + df.format(n1));
            // 10.588

    } // main close
} // class close
