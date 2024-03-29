package day42_maps;

import java.util.Map;
import java.util.TreeMap;

public class Class03_MapMethods {
    public static void main(String[] args) {

        Map<String, String> map = new TreeMap<>();
        map.put("C02", "Josh");
        map.put("B03", "Nora");
        map.put("A02", "Khashayar");
        map.put("D02", "Abidullah");
        map.put("A03", "Tatiana");

        Map<String, String> employees = new TreeMap<>();
        employees.putAll(map);

        System.out.println("employees = " + employees);
            //employees = {A02=Khashayar, A03=Tatiana, B03=Nora, C02=Josh, D02=Abidullah}

        System.out.println(map == employees);
            //false
        System.out.println("map.equals(employees) = " + map.equals(employees));
            //map.equals(employees) = true




    }
}
