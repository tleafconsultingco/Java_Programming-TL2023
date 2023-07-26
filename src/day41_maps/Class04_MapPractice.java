package day41_maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class Class04_MapPractice {

    public static void main(String[] args) {

        //!! using "Object" as the value data type you can use all kinds of data types
        Map<String, Object> person1 = new LinkedHashMap<>();
        person1.put("name", "Arthur");
        person1.put("gender", 'M');
        person1.put("age", 32);
        person1.put("job_title", "Developer");
        person1.put("salary", 100000.5);
        person1.put("married", true);

        System.out.println("person1 = " + person1);
            //person1 = {name=Arthur, gender=M, age=32, job_title=Developer, salary=100000.5, married=true}

        System.out.println("person1.get(\"name\") = " + person1.get("name"));
            //person1.get("name") = Arthur

        System.out.println("person1.get(\"salary\") = " + person1.get("salary"));
            //person1.get("salary") = 100000.5

        System.out.println("person1.get(\"job_title\") = " + person1.get("job_title"));
            //person1.get("job_title") = Developer


    }
}
