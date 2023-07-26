package day41_maps;

import java.util.Map;
import java.util.TreeMap;

public class Class05_MapMethods {

    public static void main(String[] args) {

        System.out.println("-- put() --");
        Map<String, String> map = new TreeMap<>();
        map.put("C02", "Josh");
        map.put("B03", "Nora");
        map.put("A02", "Khashayar");
        map.put("D02", "Abidullah");
        map.put("A03", "Tatiana");
        map.put("A04", "Tatiana");
        map.put("A05", "Tatiana");
        map.put("A06", "Tatiana");
        map.put("A07", "Tatiana");

        System.out.println("map.size() = " + map.size());
            //map.size() = 9

        System.out.println("map = " + map);
            //map = {A02=Khashayar, A03=Tatiana, A04=Tatiana, A05=Tatiana, A06=Tatiana, A07=Tatiana, B03=Nora, C02=Josh, D02=Abidullah}


        System.out.println("-- get() --");

        System.out.println("map.get(\"A04\") = " + map.get("A04"));
            //map.get("A04") = Tatiana



        System.out.println("-- put() to replace --");

        map.put("A04", "Lucy");
        map.put("A06", "Madiyar");

        System.out.println("map with replaced values using put() method = " + map);
            //map with replaced values using put() method = {A02=Khashayar, A03=Tatiana, A04=Lucy, A05=Tatiana, A06=Madiyar, A07=Tatiana, B03=Nora, C02=Josh, D02=Abidullah}

        System.out.println("map.get(\"B03\") = " + map.get("B03"));
            //map.get("B03") = Nora


        System.out.println("-- replace() --");

        map.replace("C02", "Aseel");
        map.replace("A07", "Marika");

        System.out.println("map with replaced values using replace() method = " + map);
            //map with replaced values using replace() method = {A02=Khashayar, A03=Tatiana, A04=Lucy, A05=Tatiana, A06=Madiyar, A07=Marika, B03=Nora, C02=Aseel, D02=Abidullah}


        System.out.println("-- remove() --");

        map.remove("A05");

        System.out.println("map with removed value using remove() method = " + map);
            //map with removed value using remove() method = {A02=Khashayar, A03=Tatiana, A04=Lucy, A06=Madiyar, A07=Marika, B03=Nora, C02=Aseel, D02=Abidullah}


        System.out.println("-- containsKey() --");

        System.out.println("map.containsKey(\"B03\") = " + map.containsKey("B03"));
            //map.containsKey("B03") = true

        System.out.println("map.containsKey(\"H98\") = " + map.containsKey("H98"));
            //map.containsKey("H98") = false



        System.out.println("-- containsValue() --");

        System.out.println("map.containsValue(\"Lucy\") = " + map.containsValue("Lucy"));
            //map.containsValue("Lucy") = true

        System.out.println("map.containsValue(\"Muhtar\") = " + map.containsValue("Muhtar"));
            //map.containsValue("Muhtar") = false



        System.out.println("-- isEmpty() --");

        System.out.println("map.isEmpty() = " + map.isEmpty());
            //map.isEmpty() = false



        System.out.println("-- equals() --");

        System.out.println("map.equals(map) = " + map.equals(map));
            //map.equals(map) = true


        System.out.println("-- clear() --");
        map.clear();

        System.out.println("map = " + map);
            //map = {}


    }

}
