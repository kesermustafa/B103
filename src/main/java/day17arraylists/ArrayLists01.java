package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Tom");
        names.add("Thomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Tacettin");
        System.out.println(names); //[Tom, Thomas, Tahsin, Trump, Tacettin]

        List<String> cities = new ArrayList<>();

        cities.add("Tom");
        cities.add("Trump");
        cities.add("Tacettin");

        names.removeAll(cities); // removeAll () methodu kullandiginizda sadece ilk list degisir,
                                    // parantezin icindeki list degismez
        System.out.println(names);

        List<String> myNames = new ArrayList<>();

        myNames.add("Thomas");
        myNames.add("Tahsin");

        boolean sonuc1 = names.containsAll(myNames); // Bir listin icinde coklu elemanlarin var olup
                                                    // olmadigini kontrol eder.
                                                    // Hepsi varsa true, en az biri yoksa false verir.
        System.out.println("sonuc1 = " + sonuc1);


        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");
        System.out.println(a);

        //Example 1: "a"listinde "Shoes" elemaninin ilk gorunumunu siliniz..

        a.remove("Shoes");
        System.out.println(a);

        //Example 2: "a"listinde "Shoes" elemaninin tum gorunumlerini siliniz..
        List<String> silinecekler = new ArrayList<>();
        silinecekler.add("Shoes");
        a.removeAll(silinecekler);
        System.out.println(a);

        //Example 3: Bir tane salary list i olusturun eger salary 10000'az ise %20
                    // 10000 ve 10000 cok ise %10 zam yapin
        List<Double> salary = new ArrayList<>();
        salary.add(12345.00);
        salary.add(8674.50);
        salary.add(15000.75);
        salary.add(9500.00);
        salary.add(20500.00);
        System.out.println(salary);

        for(Double w : salary){
            if(w<10000){
                salary.set(salary.indexOf(w), w*1.2);
            }else {
                salary.set(salary.indexOf(w), w*1.1);
            }
        }
        System.out.println(salary);


        //Example 4: iki array"in esit olup olmadigini kontrol eden kodu yazin...
        // Note: 2 arrayList'in esit olabilmesi icin elemanlar esit olmali ve ayni index de olmali.
        List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('y');
        m.add('z');


        List<Character> n = new ArrayList<>();
        n.add('x');
        n.add('y');
        n.add('z');

        //1.YOL
       int counter = 0;

       for(int i = 0 ; i<m.size(); i++){

           if(m.size()!=n.size()){
               counter ++;
               System.out.println("Listler esit degil");
               break;
           } else if( m.get(i) != n.get(i)){
               counter ++;
               System.out.println("Listler esit degil");
               break;
           }

       }
        if (counter==0){
            System.out.println("Listler esittir.");
        }


        //2.YOL

       boolean esitMi =  n.equals(m);
        if(esitMi){
            System.out.println("Listler birbirine esittir.");
        }else{
            System.out.println("Listler esit degildir.");
        }

        System.out.println("esitMi = " + esitMi);




    }
}
