package day04_primitive_type_castings_concantenation;

public class Task06_SalaryCalculator {
    public static void main(String[] args){
        String name = "Joshua";
        int hourlyRate = 40,
                weeklyHours = 45,
                salary = hourlyRate * weeklyHours * 52;

        System.out.println("Hello " + name + ", your salary is $ " + (hourlyRate*weeklyHours*52));
        System.out.println("Hello " + name + ", your salary is $ " + salary);

    }//main close
}//class close
/*
1. CreateaclassnamedSalaryCalculator.java
2. DeclarethefollowingVariables: 1. name
2. hourlyRate 3. weeklyHours
3. Writeaprogramthatcancalculatethesalary,anddisplaythe following info:
Hint: there are 52 weeks in a year
salary = hourlyRate * weeklyHours * 52
Ex:
given data:
name = “Joshua” hourlyRate = 40 weeklyHours = 45
output:
Hello Joshua, your salary is $ 93600
 */