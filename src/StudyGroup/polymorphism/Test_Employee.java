package studyGroup.polymorphism;

import day35_polymorphism.transportationTask.Class02_Car;

public class Test_Employee {

    public static void main(String[] args) {

        Employee emp1 = new Developer("Dev Alpha", "Developer", 250000, "Java");
        Employee emp2 = new Driver("Driver Beta", "Driver", 100000);
        Employee emp3 = new Teacher("Teacher Charlie", "Teacher", 50000);
        Employee emp4 = new Developer("Dev Delta", "Developer", 125000, "Python");
        Employee emp5 = new Driver("Driver Echo", "Driver", 85000);
        Employee emp6 = new Teacher("Teacher Foxtrot", "Teacher", 45000);

        //!! The work() method is overriden in each child class, so when the new object calls the work() it will return the implementation of the child class in which it is overridden.
        emp1.work(); //Dev Alpha is developing
        emp2.work(); //Driver Beta is driving
        emp3.work(); //Teacher Charlie is teaching
        emp4.work(); //Dev Delta is developing
        emp5.work(); //Driver Echo is driving
        emp6.work(); //Teacher Foxtrot is teaching


        Employee[] employees = {emp1, emp2, emp3, emp4, emp5, emp6,};

        //? How many objects of each type are there?
        int countDeveloper = 0,
                countDriver = 0,
                countTeacher = 0;

        for (Employee each : employees){
            if (each instanceof Developer){
                countDeveloper++;
            }else if (each instanceof Driver){
                countDriver++;
            }else{
                countTeacher++;
            }
        }

        System.out.println("countDeveloper = " + countDeveloper); //countDeveloper = 2
        System.out.println("countDriver = " + countDriver); //countDriver = 2
        System.out.println("countTeacher = " + countTeacher); //countTeacher = 2



    }
}
