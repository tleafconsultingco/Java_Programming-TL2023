package day36_polymorphism;

import day29_inheritance.*;
import day30_inheritance.*;
import day33_abstraction.employeeTask.*;
import day35_polymorphism.transportationTask.*;

public class Class02_ReferenceTypeCastings {

    public static void main(String[] args) {

        System.out.println("-- upcasting --");

        Class04_Dog dog = new Class04_Dog();

        // Class08_Cat cat = new Class04_Dog();

        Class03_Animal animal = (Class03_Animal) new Class04_Dog(); //!! polymorphism implicit casting, don't need to include (Class03_Animal) since it's implicit

        Class03_Animal animal1 = new Class04_Dog(); //!! upcasting ==> Polymorphism
        animal1.setInfo("Max", "Husky", 'M', 4, "Large", "White");

        animal1.eat(); //Max is eating
        animal1.drink(); //Max is drinking water
        animal1.sleep(); //Max is sleeping


        System.out.println("== downcasting ==");


        ((Class04_Dog) animal1).bark(); //Max is barking
        //!! down casting -- implementing the child class method

        //  Class04_Dog dog1 = (Class04_Dog)animal1; // down casting
        //  dog1.bark();

        //  ( (Cat)animal1).scratch();
        //!! Dog can not be converted to Cat, because there is not "IS A" relationship between dog and cat

        //? Object type is Nokia sub class, reference type is Phone super class
        Class01_Phone phone = new Class04_Nokia("XR20", "Small", "Blue", 350);

        //!! these methods are from the Phone super class
        phone.call(911); //XR20 is calling 911
        phone.text(123456); //XR20 is texting 123456
        //!! this method is only applicable to the Nokia sub class, so you need to downcast
        ((Class04_Nokia) phone).selfDefense(); //Nokia XR20 can be used for self defense
        //!! Nokia can not be converted to Iphone, because there is not "IS A" relationship between Nokia and Iphone
        // ( (IPhone)phone ).faceTime(123456);


        ((Class04_Nokia) phone).selfDefense(); //Nokia XR20 can be used for self defense


        System.out.println("---------------------------------");

        Class03_Employee employee = new Class05_Developer("Lucy", 30, 'F', "C1", "Java Developer", 95000, "Java");

        employee.work(); //Lucy is developing
        //!! from Employee super class

        System.out.println(((Class05_Developer) employee).getProgrammingLanguage()); //Java
        //!! downcast from developer sub class


        // Driver driver = (Driver) employee;
        //!! Developer and driver have no IS-A relationship


        System.out.println("---------------------------");

        Interface03_Electric electric = new Class05_Tesla("Tesla", "Model Y", "Blue", 2020, 55000);

        electric.charge(); //Tesla Model Y charges
        ((Class05_Tesla)electric).selfDrive(); //Tesla Model Y can self drive
        ( (Interface02_Autopilot)electric ).selfDrive(); //Tesla Model Y can self drive


        System.out.println("--------------------");

        Class03_Employee employee1 = new Class04_Teacher("James", 45,  'M', "B1", "Math Teacher", 75000);
        Class03_Employee employee2 = new Class05_Developer("Lucy", 30, 'F', "C1", "Java Developer", 95000, "Java");
        Class03_Employee employee3 = new Class06_Driver("Aaron", 48, 'M', "D1", "Truck Driver", 90000);
        Class03_Employee employee4 = new Class07_Tester("Emily", 35, 'F', "E1", "Manual Tester", 80000);

        //!! The work method was overridden in each sub class, so when the new object calls the work method it will be the implementation from the sub class its created from
        employee1.work(); //James is teaching
        employee2.work(); //Lucy is developing
        employee3.work(); //Aaron is driving
        employee4.work(); //Emily is testing the application


    }//main

}//class
