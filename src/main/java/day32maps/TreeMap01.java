package day32maps;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMap01 {

     /*
        1- TreeMap'lar entrySet'leri key'lere gore "natural order"da siralar.
        2- TreeMap'lar en yavas maplerdir.
        3- TreeMap'lar  thread-safe ve syncronized dgoldir...

    */


    public static void main(String[] args) {


        TreeMap<String, Double> salaries = new TreeMap<>();

        salaries.put("Tom Hanks", 3000.00);
        salaries.put("Mary Star", 1000.00);
        salaries.put("Jimmy Jones", 5000.00);
        salaries.put("Kevin Bridgeman", 6000.00);

        System.out.println(salaries); // {Jimmy Jones=5000.0, Kevin Bridgeman=6000.0, Mary Star=1000.0, Tom Hanks=3000.0}

        //tailMap("Kevin Bridgeman");  sadece treeMap'lerde calisan bir koddur.
        // verilen keyden baslayarak sona kadar entry'leri  verir.
        SortedMap<String, Double> map1 = salaries.tailMap("Kevin Bridgeman");
        System.out.println(map1);   // {Kevin Bridgeman=6000.0, Mary Star=1000.0, Tom Hanks=3000.0}

        // tailMap("String", boolean);  verilen key'den baslayarak sona kadar tum entry leri verir, boolean yazdigina gore dahil eder veya etmez.
        SortedMap<String, Double> map2 = salaries.tailMap("Kevin Bridgeman", false);
        System.out.println(map2);  // {Mary Star=1000.0, Tom Hanks=3000.0}


        SortedMap<String, Double> map3 = salaries.subMap("Kevin Bridgeman", true, "Tom Hanks", false);
        System.out.println(map3);   // {Kevin Bridgeman=6000.0, Mary Star=1000.0}

        //lowerEntry("Mary Star") Mary Star'dan bir oncekini verir.
        Map.Entry<String, Double> map4 = salaries.lowerEntry("Mary Star");
        System.out.println(map4);

        //olmayan key ile lowerEntry("Paris Hilton") kullanilirsa sanki varmis gibi alfabetik siraya bakar yine bir oncekini verir.
        Map.Entry<String, Double> map5 = salaries.lowerEntry("Paris Hilton");
        System.out.println(map5);  // Mary Star=1000.0

        //higherEntry("Mary Star") bir sonrakini verir
        Map.Entry<String, Double> map6 = salaries.higherEntry("Mary Star");
        System.out.println(map6);  // Tom Hanks=3000.0

        Map.Entry<String, Double> map7 = salaries.higherEntry("Tom Hanks");
        System.out.println(map7);  // null

        // ceilingEntry() var olan key ile kullanilirsa o key'i verir. var olmayan bir key ile kullanilirsa bir sonrakini verir.
        Map.Entry<String, Double> map8 = salaries.ceilingEntry("Mary Star");
        System.out.println(map8);  // Mary Star=1000.0

        Map.Entry<String, Double> map9 = salaries.ceilingEntry("Paris Hilton");
        System.out.println(map9);  // Tom Hanks=3000.0

        //floorEntry() varsa var olani verir, yoksa bir oncekini verir.
        Map.Entry<String, Double> map10 =salaries.floorEntry("Mary Star");
        System.out.println(map10);  // Mary Star=1000.0








    }
}
