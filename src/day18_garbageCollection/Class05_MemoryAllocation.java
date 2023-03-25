package day18_garbageCollection;


import day17_customClass.Class07_Employee;

// For easy viewing purposes we are creating 2 custom classes in one class file. This should not be done under usual circumstances
// 1.
class Car {

    public String brand, name, color;
    public int year;


}


public class Class05_MemoryAllocation {
    // when this class is run, where will all the parts be stored?


    // 2.
    public static void main(String[] args) {

        // 5.
        int a = 100;
        // a is a local variable >> stack
        // 100 is the value >> stack

        // 8. create a new object
        Car car = new Car();
        // car is a reference variable >> stack
        // new Car() is an object >> heap
        // value of Car() is null
        // instance variables w/in this class >> heap

        System.out.println("-----------");
        Class07_Employee employee1 = new Class07_Employee();
        Class07_Employee employee2 = employee1;

        employee1.setInfo("ABC",30,'F',"Developer",250000,"123456");
        System.out.println(employee1);
        System.out.println(employee2);



    }

    // 3.
    public static void method1() {

        // 6.
        int b = 200;
        // b is a local variable >> stack
        // 200 is the value >> stack

    }

    // 4.
    public static void method2() {

        // 7.
        String c = "Hello World";
        // c is a reference variable bc it creates a variable that contains an object as a value >> stack
        // "Hello World" is an object >> heap, string pool

        String d = new String("Hello World");
        // "Hello World" is an object >> heap


    }


} // class close
