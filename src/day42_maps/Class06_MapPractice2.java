package day42_maps;

import java.time.LocalDate;
import java.util.*;

public class Class06_MapPractice2 {

    public static void main(String[] args) {

        //!! Maps containing information for a person
        Map<String, Object> person1 = new LinkedHashMap<>();
        person1.put("name", "Arthur");
        person1.put("gender", 'M');
        person1.put("age", 32);
        person1.put("job_title", "Developer");
        person1.put("salary", 100000.5);
        person1.put("hired_date", LocalDate.of(2021, 1, 15));
        person1.put("married", true);

        Map<String, Object> person2 = new LinkedHashMap<>();
        person2.put("name", "Nora");
        person2.put("gender", 'F');
        person2.put("age", 31);
        person2.put("job_title", "Back-end Developer");
        person2.put("salary", 90000);
        person2.put("hired_date", LocalDate.of(2022, 8, 15));
        person2.put("married", true);

        Map<String, Object> person3 = new LinkedHashMap<>();
        person3.put("name", "Iskender");
        person3.put("gender", 'M');
        person3.put("age", 31);
        person3.put("job_title", "Front-End Developer");
        person3.put("salary", 90000);
        person3.put("hired_date", LocalDate.of(2022, 9, 15));
        person3.put("married", true);

        Map<String, Object> person4 = new LinkedHashMap<>();
        person4.put("name", "Abidullah");
        person4.put("gender", 'M');
        person4.put("age", 31);
        person4.put("job_title", "Java Developer");
        person4.put("salary", 90000);
        person4.put("hired_date", LocalDate.of(2021, 8, 15));
        person4.put("married", true);

        Map<String, Object> person5 = new LinkedHashMap<>();
        person5.put("name", "Umran");
        person5.put("gender", 'F');
        person5.put("age", 31);
        person5.put("job_title", "Back-end Developer");
        person5.put("salary", 90000);
        person5.put("hired_date", LocalDate.of(2022, 10, 15));
        person5.put("married", true);

        System.out.println("------ List of maps -------");
        //!! List of maps
        List<Map<String, Object>> listOfMaps = new ArrayList<>();
        listOfMaps.add(person1); //!! add the Map individually using add() method from Collection
        listOfMaps.add(person2);
        listOfMaps.addAll(Arrays.asList(person3, person4, person5 ) ); //!! add multiple Maps at once

        System.out.println("listOfMaps = " + listOfMaps);
            //listOfMaps = [{name=Arthur, gender=M, age=32, job_title=Developer, salary=100000.5, hired_date=2021-01-15, married=true}, {name=Nora, gender=F, age=31, job_title=Back-end Developer, salary=90000, hired_date=2022-08-15, married=true}, {name=Iskender, gender=M, age=31, job_title=Front-End Developer, salary=90000, hired_date=2022-09-15, married=true}, {name=Abidullah, gender=M, age=31, job_title=Java Developer, salary=90000, hired_date=2021-08-15, married=true}, {name=Umran, gender=F, age=31, job_title=Back-end Developer, salary=90000, hired_date=2022-10-15, married=true}]

        System.out.println("---------------------------------------------------");

        for( Map<String, Object> eachMap  :  listOfMaps ){
            System.out.println(eachMap);
            for (Map.Entry<String, Object> eachEntry : eachMap.entrySet()) {
                System.out.println(eachEntry);
                    //{name=Arthur, gender=M, age=32, job_title=Developer, salary=100000.5, hired_date=2021-01-15, married=true}
                    //name=Arthur
                    //gender=M
                    //age=32
                    //job_title=Developer
                    //salary=100000.5
                    //hired_date=2021-01-15
                    //married=true
                    //{name=Nora, gender=F, age=31, job_title=Back-end Developer, salary=90000, hired_date=2022-08-15, married=true}
                    //name=Nora
                    //gender=F
                    //age=31
                    //job_title=Back-end Developer
                    //salary=90000
                    //hired_date=2022-08-15
                    //married=true
                    //{name=Iskender, gender=M, age=31, job_title=Front-End Developer, salary=90000, hired_date=2022-09-15, married=true}
                    //name=Iskender
                    //gender=M
                    //age=31
                    //job_title=Front-End Developer
                    //salary=90000
                    //hired_date=2022-09-15
                    //married=true
                    //{name=Abidullah, gender=M, age=31, job_title=Java Developer, salary=90000, hired_date=2021-08-15, married=true}
                    //name=Abidullah
                    //gender=M
                    //age=31
                    //job_title=Java Developer
                    //salary=90000
                    //hired_date=2021-08-15
                    //married=true
                    //{name=Umran, gender=F, age=31, job_title=Back-end Developer, salary=90000, hired_date=2022-10-15, married=true}
                    //name=Umran
                    //gender=F
                    //age=31
                    //job_title=Back-end Developer
                    //salary=90000
                    //hired_date=2022-10-15
                    //married=true
            }
        }


        System.out.println("---------------------------------------------------");

        //? Display the names of the employee who are hired this year (2022)
        for (Map<String, Object> eachMap : listOfMaps) {
            for (Map.Entry<String, Object> eachEntry : eachMap.entrySet()) {
                if(eachEntry.getKey().equals("hired_date")){
                    if(  ( (LocalDate)eachEntry.getValue() ).getYear() == 2022 ){
                        System.out.println(eachMap.get("name"));
                    }//nested if
                }//if
            }//nested for-each
        }//for-each


        System.out.println("---------------------------------------------------");

        listOfMaps.get(0).replace("name", "Vasyl");
            // changes index 1 name to Vasyl

        listOfMaps.get(listOfMaps.size()-1).replace("salary",  ( (Integer)listOfMaps.get(listOfMaps.size()-1).get("salary")) + 50000 );
            //!! cast to Integer from Object
            // increases last index salary by 50000

        listOfMaps.get(1).replace("age",   ( (Integer)listOfMaps.get(1).get("age")) + 4) ;
            // increases first index age by 4

        System.out.println("listOfMaps = " + listOfMaps);
            //listOfMaps = [{name=Vasyl, gender=M, age=32, job_title=Developer, salary=100000.5, hired_date=2021-01-15, married=true}, {name=Nora, gender=F, age=35, job_title=Back-end Developer, salary=90000, hired_date=2022-08-15, married=true}, {name=Iskender, gender=M, age=31, job_title=Front-End Developer, salary=90000, hired_date=2022-09-15, married=true}, {name=Abidullah, gender=M, age=31, job_title=Java Developer, salary=90000, hired_date=2021-08-15, married=true}, {name=Umran, gender=F, age=31, job_title=Back-end Developer, salary=140000, hired_date=2022-10-15, married=true}]


        System.out.println("---------------------------------------------------");

        Map<String, Object> car1 = new LinkedHashMap<>();
        car1.put("brand", "BMW");
        car1.put("model", "X5");
        car1.put("year", 2021);
        car1.put("color", "Red");
        car1.put("price", 45000.5);

        Map<String, Object> car2 = new LinkedHashMap<>();
        Map<String, Object> car3 = new LinkedHashMap<>();
        Map<String, Object> car4 = new LinkedHashMap<>();


        List<Map<String, Object>> cars = new ArrayList<>();
        cars.addAll( Arrays.asList(car1, car2, car3, car4));

        System.out.println("cars = " + cars);
            //cars = [{brand=BMW, model=X5, year=2021, color=Red, price=45000.5}, {}, {}, {}]


    }
}
