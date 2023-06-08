package day35_polymorphism;

import day33_abstraction.employeeTask.*;

public class Class08_PolymorphismPractice {

    public static void main(String[] args) {

        Class03_Employee[] employees = {
                new Class07_Tester("Hamza", 32, 'M', "A01", "QA", 110000),
                new Class05_Developer("Lucy", 27, 'F', "A02", "Java Developer", 128000, "Java"),
                new Class07_Tester("George", 28,'M', "A03", "SDET", 120000),
                new Class05_Developer("Yulia", 23, 'F',"A04", "Software Developer", 135000, "Python"),
                new Class07_Tester("Cihad", 30, 'M',"A05", "SDET", 105000),
                new Class05_Developer("Gulistan",  26, 'F', "A06", "Web Developer", 130000, "Python"),
                new Class07_Tester("Nora",  28, 'F', "A07", "QE", 120000),
                new Class06_Driver("Aaron", 48, 'M', "D1", "Truck Driver", 90000),
                new Class05_Developer("Diana",  29, 'F', "A08", "Front-end Developer", 140000, "C#"),
                new Class07_Tester("Tatiana",  25, 'F',"A09", "SDET", 130000),
                new Class05_Developer("Alena",  26, 'F',"A10", "Back-end Developer", 150000, "Java"),
                new Class07_Tester("Timur",  29, 'M',"A11", "SDET", 115000),
                new Class04_Teacher("James", 45,  'M', "B1", "Math Teacher", 75000),
                new Class05_Developer("Hasan",  26, 'F', "A12", "Full Stack Developer", 142000, "Java"),
                new Class07_Tester("Nataliia",  24, 'F', "A13", "QE", 125000),
                new Class05_Developer("Ermek",  26, 'M',"A14", "Full Stack Developer", 142000, "Java"),
                new Class07_Tester("Khashayar",  30, 'M',"A15", "SDET", 105000)
        };


        //!! 1. Print the name and Job Title of every employee
            //?? This for-each loop has polymorphism bc the employees array contains object types from the child class
        for(Class03_Employee each : employees){
            System.out.println(each.getName() +" : "+each.getJobTitle());
        }

        System.out.println("-- using loops and if statements to answer questions --");

        //!! Create variables to store values
        int countDeveloper = 0,
                countTester = 0,
                countDriver = 0,
                countTeacher = 0;

        //!! Use for-each loop
        for (Class03_Employee each : employees) {

            if(each instanceof Class05_Developer){ //!! if the employee is Developer
                countDeveloper++;
            }else if(each instanceof Class07_Tester){ //!! if the employee is Tester
                countTester++;
            }else if(each instanceof Class07_Tester){ //!! if the employee is Teacher
                countTeacher++;
            }else{
                countDriver++;
            }//if-else
        }//for-each

        System.out.println("countDeveloper = " + countDeveloper); //countDeveloper = 7
        System.out.println("countTester = " + countTester); //countTester = 8
        System.out.println("countDriver = " + countDriver); //countDriver = 2
        System.out.println("countTeacher = " + countTeacher); //countTeacher = 0

        System.out.println("-- for-each loop for finding who is NOT developer --");

        for (Class03_Employee each : employees) {
            if( !(each instanceof Class05_Developer) ){
                System.out.println(each.getName());
                    //Hamza
                    //George
                    //Cihad
                    //Nora
                    //Aaron
                    //Tatiana
                    //Timur
                    //James
                    //Nataliia
                    //Khashayar
            }//if
        }//for-each



    }



}//class
/*
   1. Print the name and Job Title of every employee
        2. How many developers do we have?
        3. How many testers do we have?
        4. How many teachers do we have?
        5. How many Drivers do we have?
        6. Display the names of employees who are not developers
 */