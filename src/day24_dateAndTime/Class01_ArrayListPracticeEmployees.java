package day24_dateAndTime;

import day17_customClass.Class07_Employee;

import java.util.ArrayList;
import java.util.Arrays;

public class Class01_ArrayListPracticeEmployees {
    public static void main(String[] args) {

        ArrayList<Class07_Employee> employees = new ArrayList<>();

        //!! 1. Use addAll(), but only accepts Collection type
        //!! 1a. Use Arrays utility method asList()
        employees.addAll(Arrays.asList(
                new Class07_Employee(), new Class07_Employee(), new Class07_Employee(), new Class07_Employee(), new Class07_Employee()
        ));

        //! 2. Use setInfo() custom method
        //!! 2a. Use get() at specified index to return employee object
        //@@ 2b. Now that we are returning an object we can use setInfo() to call the custom instance method

        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
        employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
        employees.get(2).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
        employees.get(3).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
        employees.get(4).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");


        //? Name and job title of each employee

        //! 1. Use For-Each loop
            //!! Could use For loop but it will return index number, not the element. You will need to use the index number and get() to return the element.
        for (Class07_Employee each : employees) {
            //!! Remember that the datatype is the Employee object
            // System.out.println(each);
                //Class07_TestEmployeeObjects{name='Josh', age=34, gender=M, jobTitle='Java Developer', salary=100000.0, id='A01'}
                //Class07_TestEmployeeObjects{name='Emily', age=40, gender=F, jobTitle='SDET', salary=90000.0, id='A02'}
                //Class07_TestEmployeeObjects{name='Conor', age=38, gender=M, jobTitle='Project Manager', salary=130000.0, id='A03'}
                //Class07_TestEmployeeObjects{name='Bella', age=29, gender=F, jobTitle='Java Developer', salary=95000.0, id='A04'}
                //Class07_TestEmployeeObjects{name='Jimmy', age=54, gender=M, jobTitle='Data Analyst', salary=105000.0, id='A05'}
            //! 1a. Print only name and job title
            System.out.println(each.name+": "+each.jobTitle);
                //Josh: Java Developer
                //Emily: SDET
                //Conor: Project Manager
                //Bella: Java Developer
                //Jimmy: Data Analyst
        }//close for-each loop

        System.out.println("------ jobTitle: Java Developer --------");

        //? Name of Java Developers

        for (Class07_Employee each : employees) {
            if (each.jobTitle.equals("Java Developer")){ //!! if jobTitle is Java Developer...
                    //?? jobTitle returns string, use equals()
                System.out.println(each.name); //!! ...then print name
                    //Josh
                    //Bella
            }//if close
        }//close for-each loop

        System.out.println("------ Max and min salary ------");
        //? Max and min salary

        //! 1. Create variables for max and min
        double max = employees.get(0).salary; //!! remember to match the datatype with the object
        double min = employees.get(0).salary;
        
        //! 2. Use for-each loop to iterate all salaries for employees
        for (Class07_Employee each : employees) {
            //!! 2a. Use if statement to update max and min values
            //@@ We cannot use max() or min() methods for Collections class bc we are using String, not Integer or Double
            if (each.salary > max){ //!! If the loop iterates an element with a salary that is greater than current max, then max will be updated
                max = each.salary;
            }//if statement
            if (each.salary <min){ //!! If the loop iterates an element with a salary that is less than current min, then min will be updated
                min = each.salary;
            }//if statement
        }//for-each loop

        System.out.println("max = " + max); //max = 130000.0
        System.out.println("min = " + min); //min = 90000.0

        System.out.println("--------- Females and males --------");
        //? Female and male employees as separate ArrayLists

        //! 1. Create new ArrayLists
        ArrayList<Class07_Employee> femaleEmployees = new ArrayList<>();
        ArrayList<Class07_Employee> maleEmployees = new ArrayList<>();

        //! 2. Use for-each to iterate each element
        for (Class07_Employee employee : employees) {
            if (employee.gender == 'F'){ //!! compare char with (==)
                femaleEmployees.add(employee);
            }else{
                maleEmployees.add(employee);
            }//if-else close
        }//for-each close

        //! 3. Print total number of each gender by using size()
        System.out.println("Total number of female employees: "+femaleEmployees.size()); //Total number of female employees: 2
        System.out.println("Total number of male employees: "+maleEmployees.size()); //Total number of male employees: 3




    }//main close
}//class close
/*
Given the following arraylist of Employees:
			ArrayList<Employee> employees = new ArrayList<>();
	        employees.addAll(Arrays.asList(
	               new Employee(), new Employee(), new Employee(), new Employee(), new Employee()
	        ));

	        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
	        employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
	        employees.get(1).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
	        employees.get(1).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
	        employees.get(1).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");

	        Note: Employee class is imported from day17 package

	        1.1 Write a program that can display the name and job title of each employee

	        1.2 Write a program that can display the names of "Java Developers"

	        1.3 Write a progam that can display the maximum and minimum salary

	        1.4 Create two arraylists named femaleEmployees and maleEmployees, write a program that
	         can add all the female employees and male emloyees to the femaleEmployees and maleEmployees arraylists

 */