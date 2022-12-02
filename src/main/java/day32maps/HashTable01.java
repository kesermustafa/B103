package day32maps;

import java.util.Hashtable;

public class HashTable01 {

    /*
        1- HashTable bir map'tir.
        2- HashTable entrySet'leri herhangi bir siralamaya tabi tutmaz..
        3- HashTable, HashMap'lerden daha yavastir. Cunku HashTable'lar threead-safe ve synchronized'dir.
        4- HashTable'larda key null olamaz. key'i null yaparsaniz NullPointerException atar.
        5- HashTable'larda value null olamaz. NullPointerException atar.
            HashMap ve  HashTable FARKLAR  -- 2 temel farki vardir...
        1- HashMap threead-safe ve synchronized degildir.  HashTable'lar threead-safe ve synchronized'dir.
        2- HashMap key ve value larda null kullanilir. HashTable da kullanilmaz

        Note : toString() methodu objeleri detaylari ile birlikte gorebilmek icin class'larin icinde olusturulur.
            toString() methodu olusturmadan objeyi yazdirisaniz. ekranda objenin adresini gorusuunz..


     */


    public static void main(String[] args) {

        Hashtable<String, Integer> countryPopulations = new Hashtable<>();

        countryPopulations.put("USA", 400000000);
        countryPopulations.put("Germany", 83000000);
        countryPopulations.put("Turkey", 90000000);

        System.out.println(countryPopulations); // {USA=400000000, Germany=83000000, Turkey=90000000}

        // countryPopulations.put(null, 90000000);  // HashTable'larda key null olamaz. NullPointerException

        // countryPopulations.put("France", null); // HashTable'larda value null olamaz. NullPointerException


        Hashtable<String, Students> myStudens = new Hashtable<>();

        myStudens.put("Math", new Students("Tom Hanks", "th@gmail.com", 21, true));

        System.out.println(myStudens); // {Math=Students{name='Tom Hanks', email='th@gmail.com', age=21, success=true}}
                                      //   {KEY =    -----------------     VALUE  ----------------------------------

        String name = myStudens.get("Math").name; // Tom Hanks
        System.out.println(name);  // Tom Hanks

        Integer age = myStudens.get("Math").age;  // 21
        System.out.println(age);




    }
}
