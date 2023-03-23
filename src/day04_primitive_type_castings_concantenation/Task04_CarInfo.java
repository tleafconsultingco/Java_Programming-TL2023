package day04_primitive_type_castings_concantenation;

public class Task04_CarInfo {
    public static void main(String[] args){
        String year = "2018",
                make = "Toyota",
                model = "Camry",
                color = "Red";
        int miles = 50_000,
                price = 19_000;

        System.out.println(year + " " + make + " " + model + ", " + miles + " miles, " + color + ", " + "$" + price);

    }
}
/*
1. CreateaclassnamedCarInfo.java 2. Declarethefollowingvariables:
1. year 2. make
3. model 4. miles 5. color
6. Price
3. Useconcatenationtoprintthefullinfoofthecarinthe
following format:
Year Make Model, Miles, Color, Price.
Ex:
Car information is :
2018 Toyota Camry, 50000 miles, Red, $19000.
 */