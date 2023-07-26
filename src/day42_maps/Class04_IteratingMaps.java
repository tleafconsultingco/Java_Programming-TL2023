package day42_maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class Class04_IteratingMaps {
    public static void main(String[] args) {

        //!! random order, accept null key & null values
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Daniel", 95000);
        map.put("Emily", 100000);
        map.put("Bella", 85000);
        map.put("Arron", 78000);
        map.put("Jimmy", 78000);
        map.put("Breanna", 98000);

        System.out.println("map = " + map);
            //map = {Daniel=95000, Emily=100000, Bella=85000, Arron=78000, Jimmy=78000, Breanna=98000}

        System.out.println("------ iterate by keys ----");

        //!! Iterating the map by the keys
        for (String eachKey : map.keySet()) {
            //map.replace(eachKey,  map.get(eachKey) * 2 );
            System.out.println("eachKey = " + eachKey);
                //eachKey = Daniel
                //eachKey = Emily
                //eachKey = Bella
                //eachKey = Arron
                //eachKey = Jimmy
                //eachKey = Breanna
        }

        //!! update the value by increasing the salary by 2x
        Map<String, Integer> mapUpdated = new LinkedHashMap<>();
        mapUpdated.putAll(map);
        for (String eachKeyUpdated : mapUpdated.keySet()) {
            mapUpdated.replace(eachKeyUpdated,mapUpdated.get(eachKeyUpdated)*2);
        }
        System.out.println("map updated salary = " + mapUpdated);
            //map updated salary = {Daniel=190000, Emily=200000, Bella=170000, Arron=156000, Jimmy=156000, Breanna=196000}




        System.out.println("--------- iterate by values -------");

        //!! Iterating the map by values
        for (Integer eachValue : map.values()) {
            System.out.println("eachValue = " + eachValue);
                //eachValue = 95000
                //eachValue = 100000
                //eachValue = 85000
                //eachValue = 78000
                //eachValue = 78000
                //eachValue = 98000
        }

        System.out.println("-------- iterate by pairs -------");
        //!! Iterating the map by entries/pairs
        //!! map.entrySet() is the Set with all the entries of the map

        //!! Data type of the entry needs to be Entry, which is an inner (nested) interface of Map, call it through the Map
        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            System.out.println("eachEntry = " + eachEntry);
                //eachEntry = Daniel=95000
                //eachEntry = Emily=100000
                //eachEntry = Bella=85000
                //eachEntry = Arron=78000
                //eachEntry = Jimmy=78000
                //eachEntry = Breanna=98000
        }

        System.out.println("--------- getting keys and values separately from entries -------");

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            String eachKey = eachEntry.getKey();
            Integer eachValue = eachEntry.getValue();

            System.out.println("eachKey = " + eachKey);
            System.out.println("eachValue = " + eachValue);
                System.out.println(eachKey +" : "+eachValue);
                //eachKey = Daniel
                //eachValue = 95000
                    //Daniel : 95000
                //eachKey = Emily
                //eachValue = 100000
                    //Emily : 100000
                //eachKey = Bella
                //eachValue = 85000
                    //Bella : 85000
                //eachKey = Arron
                //eachValue = 78000
                    //Arron : 78000
                //eachKey = Jimmy
                //eachValue = 78000
                    //Jimmy : 78000
                //eachKey = Breanna
                //eachValue = 98000
                    //Breanna : 98000

            eachEntry.setValue(eachValue + 10000);
            }//for-each


        System.out.println("map = " + map);
            //map = {Daniel=105000, Emily=110000, Bella=95000, Arron=88000, Jimmy=88000, Breanna=108000}


    }

}
