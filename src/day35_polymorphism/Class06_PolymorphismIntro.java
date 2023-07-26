package day35_polymorphism;

import day31_inheritance.methodOverriding_shape.*;
import day33_abstraction.employeeTask.*;
import day34_abstraction.animalTask.*;
import day34_abstraction.carTask.*;

import java.util.Arrays;

public class Class06_PolymorphismIntro {

    public static void main(String[] args) {


        //! 1. Create new objects from classes
        Class07_Dog dog = new Class07_Dog("Max", "Husky", 'M', 4, "Small", "White");
        Class08_Cat cat = new Class08_Cat("Cam","Persian",'F',10,"Medium","White");
        Class11_Tiger tiger = null;
        Class10_Eagle eagle = null;
        Class12_Lion lion = null;
        Class09_Parrot parrot = null;
        Class14_Dolphin dolphin = null;
        Class13_Shark shark = null;
        Class15_Duck duck = null;

        //! 2. Create a single variable for the objects
        //?? What should be the data type for the 2 variables? ARRAY

        //!! Data type can't be Dog[] bc it cannot reference to the other animal objects that are not made from Dog sub class
            // Class07_Dog[] animals = {dog, cat, tiger, lion, eagle};
        //!! Data type can't be WildAnimal bc it cannot reference to other animal objects that do not extend WildAnimal interface
            //Interface04_WildAnimal[] animals = {dog, cat, tiger, lion, eagle, parrot, dolphin, shark, duck};
                //!! compile error for dog, cat, parrot, dolphin, duck

        //?? All the objects have an IS-A relationship with animal

        Class06_Animal[] animals = {dog, cat, tiger, eagle, lion, parrot, dolphin, shark, duck};

        Class06_Animal animal = new Class07_Dog("Max", "Husky", 'M', 4, "Small", "White");
            //!! Can only call methods from the parent class, not the dog class bc parent type is the REFERENCE

        animal.eat(); //Dog Max is eating dog food
        animal.drink(); //Max is drinking water
        animal.sleep(); //Max sleeps 8 hours
        // animal.play();
        // animal.bark();



        System.out.println("-- Previously created objects from different categories --");

        String str = "Java";

        Integer n = 100;

        Boolean r = false;

        Double d = 10.5;

        Class19_Circle circle = new Class19_Circle(4);

        Class02_Honda honda = new Class02_Honda("Pilot", "Black", "Black", 2019, 35000);

        Class03_Audi audi = new Class03_Audi("Q6", "Silver", "Black", 2020, 36000);

        Class04_Tesla tesla = new Class04_Tesla("Model Y", "Blue", "Black",2022, 60000);

        Class04_Teacher teacher = new Class04_Teacher("James", 45,  'M', "B1", "Math Teacher", 75000);

        Class05_Developer developer = new Class05_Developer("Lucy", 30, 'F', "C1", "Java Developer", 95000, "Java");

        Class06_Driver driver = new Class06_Driver("Aaron", 48, 'M', "D1", "Truck Driver", 90000);

        Class07_Tester tester = new Class07_Tester("Emily", 35, 'F', "E1", "Manual Tester", 80000);

        //? If I wanted to store these in a data type, which reference variable should I use?
            //?? Object, since object is the parent of all classes

        Object[] objects = {str, n, r, d, circle, honda, audi, tesla, teacher, developer, driver, tester};

        //?? print this array
        System.out.println(Arrays.toString(objects));
            //[Java, 100, false, 10.5, Class19_Circle{name='Class19_Circle', radius='4.0', area='50.24', perimeter='25.12'}, Class02_Honda{model='Black', color='Black', year=2019, price= $35000.0}, Class03_Audi{model='Silver', color='Black', year=2020, price= $36000.0}, Class04_Tesla{model='Blue', color='Black', year=2022, price= $60000.0}, Class04_Teacher{name='James', age=45, gender=M, id='B1', jobTitle='Math Teacher', salary=75000.0}, Class05_Developer{name='Lucy', age=30, gender=F, id='C1', jobTitle='Java Developer', salary=95000.0, programming language=Java}, Class06_Driver{name='Aaron', age=48, gender=M, id='D1', jobTitle='Truck Driver', salary=90000.0}, Class07_Tester{name='Emily', age=35, gender=F, id='E1', jobTitle='Manual Tester', salary=80000.0}]

        //!! It's better practice to create a reference variable that is specific for the array
        Object[] employee = {teacher, developer, driver, tester};


        //!! Benefits of using the Employee reference type are that it's more specific and it applies the methods from the class
        Class03_Employee obj = new Class06_Driver("Aaron", 48, 'M', "D1", "Truck Driver", 9000);
        obj.work(); //Aaron is driving









    }//main


}//class
