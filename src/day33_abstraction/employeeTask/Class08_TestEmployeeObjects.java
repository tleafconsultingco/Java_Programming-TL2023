package day33_abstraction.employeeTask;

public class Class08_TestEmployeeObjects {

    public static void main(String[] args) {

        //  Employee employee = new Employee("Daniel", 54, 'M', "A1", "SDET", 85000);
        // We can not create objects from an abstract class, Object MUST be created from  a concrete class

        Class04_Teacher teacher = new Class04_Teacher("James", 45, 'M', "B1", "Math Teacher", 75000);

        Class05_Developer developer = new Class05_Developer("Lucy", 30, 'F', "C1", "Java Developer", 95000, "Java");

        Class06_Driver driver = new Class06_Driver("Aaron", 48, 'M', "D1", "Truck Driver", 90000);

        Class07_Tester tester = new Class07_Tester("Emily", 35, 'F', "E1", "Manual Tester", 80000);

        System.out.println("teacher = " + teacher); //teacher = Class04_Teacher{name='James', age=45, gender=M, id='B1', jobTitle='Math Teacher', salary=75000.0}
        System.out.println("developer = " + developer); //developer = Class05_Developer{name='Lucy', age=30, gender=F, id='C1', jobTitle='Java Developer', salary=95000.0, programming language=Java}
        System.out.println("driver = " + driver); //driver = Class06_Driver{name='Aaron', age=48, gender=M, id='D1', jobTitle='Truck Driver', salary=90000.0}
        System.out.println("tester = " + tester); //tester = Class07_Tester{name='Emily', age=35, gender=F, id='E1', jobTitle='Manual Tester', salary=80000.0}

        System.out.println("-- Testing the methods --");

        teacher.work(); //James is teaching
        developer.work(); //Lucy is developing
        driver.work(); //Aaron is driving
        tester.work(); //Emily is testing the application


    }//main
}//class