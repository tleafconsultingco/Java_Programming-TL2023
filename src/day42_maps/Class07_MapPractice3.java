package day42_maps;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Class07_MapPractice3 {
    public static void main(String[] args) {

        Map<String, Object> person1 = new LinkedHashMap<>();
        person1.put("name", "Arthur");
        person1.put("gender", 'M');
        person1.put("age", 32);
        person1.put("job_title", "Developer");
        person1.put("salary", 100000);
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


        System.out.println("--- array of map -----");
        Map<String, Object>[] arrayOfMap = new Map[5]; // size 5, index 0-4
        arrayOfMap[0] = person1;
        arrayOfMap[1] = person2;
        arrayOfMap[2] = person3;
        arrayOfMap[3] = person4;
        arrayOfMap[4] = person5;
        //!! cannot add another object bc array size is fixed
        // arrayOfMap[5] = new LinkedHashMap<>();

        System.out.println("Arrays.toString(arrayOfMap) = " + Arrays.toString(arrayOfMap));
            //Arrays.toString(arrayOfMap) = [{name=Arthur, gender=M, age=32, job_title=Developer, salary=100000, hired_date=2021-01-15, married=true}, {name=Nora, gender=F, age=31, job_title=Back-end Developer, salary=90000, hired_date=2022-08-15, married=true}, {name=Iskender, gender=M, age=31, job_title=Front-End Developer, salary=90000, hired_date=2022-09-15, married=true}, {name=Abidullah, gender=M, age=31, job_title=Java Developer, salary=90000, hired_date=2021-08-15, married=true}, {name=Umran, gender=F, age=31, job_title=Back-end Developer, salary=90000, hired_date=2022-10-15, married=true}]


        //!! using replace() method to update values
            //!! You need to get the key for salary, then add the 10000
            //!! Will have to cast from Object to Integer
        arrayOfMap[1].replace("salary", ( (Integer)arrayOfMap[1].get("salary") ) + 10000);
        arrayOfMap[0].replace("name", "Hasan");

        System.out.println("Arrays.toString(arrayOfMap) = " + Arrays.toString(arrayOfMap));
            //Arrays.toString(arrayOfMap) = [{name=Hasan, gender=M, age=32, job_title=Developer, salary=100000, hired_date=2021-01-15, married=true}, {name=Nora, gender=F, age=31, job_title=Back-end Developer, salary=100000, hired_date=2022-08-15, married=true}, {name=Iskender, gender=M, age=31, job_title=Front-End Developer, salary=90000, hired_date=2022-09-15, married=true}, {name=Abidullah, gender=M, age=31, job_title=Java Developer, salary=90000, hired_date=2021-08-15, married=true}, {name=Umran, gender=F, age=31, job_title=Back-end Developer, salary=90000, hired_date=2022-10-15, married=true}]

        System.out.println("------------------------------------------------");
        //? Increase salary of the 2nd person
        int count = 0;
        for (Map<String, Object> eachMap : arrayOfMap) {
            for (Map.Entry<String, Object> eachEntry : eachMap.entrySet()) {
                if(eachEntry.getKey().equals("salary")){
                    double salary = (Integer)eachEntry.getValue();
                    if(salary < 100000){
                        count++;
                    }
                }
            }
        }


        System.out.println("count = " + count);
            //count = 3


    }
}
