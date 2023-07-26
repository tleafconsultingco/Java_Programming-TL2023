package day42_maps;

import java.util.Map;
import java.util.TreeMap;

public class Class09_MapPractice5 {

    public static void main(String[] args) {

        System.out.println("---- Iterate map using lambda expression ----");

        Map<String, String> map = new TreeMap<>();
        map.put("C02", "Josh");
        map.put("B03", "Nora");
        map.put("A02", "Khashayar");
        map.put("D02", "Abidullah");
        map.put("A03", "Tatiana");

        //!! Call the forEach() method and pass k and v as the arguments
        map.forEach( (k, v) -> { System.out.println(k +" : "+ v); } );
            //A02 : Khashayar
            //A03 : Tatiana
            //B03 : Nora
            //C02 : Josh
            //D02 : Abidullah
    }

}
