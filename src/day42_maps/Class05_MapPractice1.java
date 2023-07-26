package day42_maps;

import java.util.HashMap;
import java.util.Map;

public class Class05_MapPractice1 {
    public static void main(String[] args) {

        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");

        System.out.println("---------------------------------------------");
        //? How many female & male employees in the map?
            //?? Use value() method

        //!! 1. Create int variables for the count of male employees and female employees
        int countMaleEmployee = 0;
        int countFemaleEmployees = 0;

        //!! 2. Use for-loop
        for (String eachValue : employeeMap.values()) {
            if(eachValue.equals("F")){
                countFemaleEmployees++;
            }else{
                countMaleEmployee++;
            }//if-else
        }//for-each

        System.out.println("Male Employees: " + countMaleEmployee);
        //Male Employees: 5
        System.out.println("Female Employees: " + countFemaleEmployees);
        //Female Employees: 8

        /* ?? Iterating the keys using the keySet(), get(), and equals() methods...but not best practice
        for (String name : employeeMap.keySet()) {
            String gender = employeeMap.get(name);
            if(gender.equals("M")){
                countMaleEmployee++;
            }else{
                countFemaleEmployees++;
            }
        }
        */

        System.out.println("---------------------------------------------");
        //? Display the names of all the female employees
            //?? Use Entry

        //!! 1. Use for-each loop to iterate through eachEntry (pair)
        for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {
            //!! 2. Check values of each entry to see if they equal "F", if true then get key (name)
            if(eachEntry.getValue().equals("F")){
                System.out.println("eachEntry.getKey() = " + eachEntry.getKey());
                    //eachEntry.getKey() = Kakalina
                    //eachEntry.getKey() = Glad
                    //eachEntry.getKey() = Marika
                    //eachEntry.getKey() = Ddene
                    //eachEntry.getKey() = Selle
                    //eachEntry.getKey() = Brigitte
                    //eachEntry.getKey() = Desirae
                    //eachEntry.getKey() = Ajay
            }//if
        }//for-each

        /* ?? Iterating the keys using keySet(), get(), and equals() methods...but not best practice
        for (String name : employeeMap.keySet()) {
            String gender =employeeMap.get(name);
            if(gender.equals("F")){
                System.out.println(name);
            }
        }
         */

        System.out.println("---------------------------------------------");
        //? Update all the "M" values with "Male", "F" values with "Female"
            //?? Use Entry

        //!! 1. Use for-each loop to iterate through eachEntry (pair)
        for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {
            //!! 2. If statement for checking if value equals "M", then change to "Male"
            if(eachEntry.getValue().equals("M")){
                eachEntry.setValue("Male");
            //!! 3. Else if value does not equal "M" (which means it equals "F"), then change to "Female"
            }else{
                eachEntry.setValue("Female");
            }//if-else
        }//for-each

        System.out.println("employeeMap = " + employeeMap);
            //employeeMap = {Kakalina=Female, Glad=Female, Jereme=Male, Bertrando=Male, Winfred=Male, Marika=Female, Ddene=Female, Selle=Female, Orlando=Male, Brigitte=Female, Desirae=Female, Derk=Male, Ajay=Female}


    }
}
