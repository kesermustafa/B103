package day30collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queue01 {

    /*
    İlk giren elemanı ilk kullanmanız(First In First Out ==> FIFO) gerektiğinde Queue en iyi seçimdir.
    Queue'da elemanlar "insertion order" a göre dizilirler.
    Queue'da  peek(), poll(), element(), remove() gibi ilk elemanı ilgilendiren birçok method vardır.

    offer() method'u kapasite kontrolu yapildiktan sonra eleman ekleme durumlarinda kullanilir.

    Kapasite kısıtlamalarını ihlal etmeden hemen yapmak mümkünse, belirtilen öğeyi bu kuyruğa ekler.
         Kapasite kısıtlamalı bir kuyruk kullanırken, bu yöntemin eklenmesi genellikle tercih edilir,
         bu yöntem yalnızca bir istisna atarak bir öğe eklemede başarısız olabilir.

         --öğe bu kuyruğa eklendiyse true, aksi takdirde false

         ClassCastException – belirtilen öğenin sınıfı, onun bu kuyruğa eklenmesini engelliyorsa
         NullPointerException – belirtilen öğe boşsa ve bu sıra boş öğelere izin vermiyorsa
         IllegalArgumentException – bu öğenin bazı özellikleri onun bu kuyruğa eklenmesini engelliyorsa
     */


    public static void main(String[] args) {

        Queue<String> wareHouse = new LinkedList<>();

        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Bread");
        wareHouse.add("Honey");
        wareHouse.add("Tomatoes");
        System.out.println(wareHouse);  // [Milk, Meat, Bread, Honey, Tomatoes]

        //offer() kapasite uygunsa ekleme yapar.
        wareHouse.offer("Potatoes");
        System.out.println(wareHouse);  // [Milk, Meat, Bread, Honey, Tomatoes, Potatoes]




    }

}
