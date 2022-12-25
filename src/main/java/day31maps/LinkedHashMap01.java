package day31maps;

import java.util.LinkedHashMap;

public class LinkedHashMap01 {

    public static void main(String[] args) {

        // LinkedHashMap ogeler ekleme sirasini korur, ekleme sirasina gore yazdir.

        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();

        sortedMap.put("E",5);
        sortedMap.put("A",1);
        sortedMap.put("D",4);
        sortedMap.put("P",35);
        sortedMap.put("C",3);
        sortedMap.put("B",2);

        System.out.println(sortedMap);



    }
}
