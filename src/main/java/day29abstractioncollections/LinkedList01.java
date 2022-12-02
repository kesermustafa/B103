package day29abstractioncollections;

import java.util.LinkedList;

public class LinkedList01 {

    /*
    Collection: birden fazla datanın depolanması.
    Array ilkel bu yüzden collectionlara dahil değil.
    List'ler collection'lara dahil.

    Collection diyince bunlar aklınıza gelmeli:
    1)List  i)ArrayList ii)LinkedList
    2)Set
    3)Queue

    > List'lere çoklu ve tekrarlı data depolamak istediğimizde ihtiyaç duyarız, Ör:bir okuldaki öğrenci isimleri.
    >>Set'lere çoklu ama tekrarsız data depolamak istersek ihtiyaç duyarız, Ör: bir okuldaki öğrenci ID'leri.
    --Set ve List'i amacına göre kullanın.
    >>>Queue'lara FIFO(first in first out) veya LIFO(last in firts out) gerektiğinde Queue kullanılır, Ör: bankadaki günlük müşteriler.
 */

    /*
    ArrayListler index kullanir ama index kullanmak eleman ekleme ve eleman silme islamlsrinde bize zaman kaybettirir,
    Cunku  bir cok elemanin re-index edilmesi gerekir..
    Bu sorun icin java yeni yapi olusturmus bu yapiya LinkedList denir..

    1- LinkedListler de her eleman iki bolumden olusur ilk bolume data bolum denir, ikinci bolumler ise pointer
    bolumleri denir. bu pointerlar bir sonraki datayi gosterir..

    2 - LinkedList deki her bir eleman Node olarak adlandirilir...  (ilk node ononde gorunmeyen Head verdir)

    3- LinkedList elman ekleme ve silmede cok basarilidir.
       eleman ekleme ve silme islemlerini cokca yapacaginiaz islemlerde LinkedList kullanmalisiniz..

    4- ArrayList index kullanir adres bulma islemlerinde cok basarilidir (search)
        LinkedList ise index kullanmadigi icin eleman bulma search islamlerinde basarisizdir.

     5- index kullanmak eleman bulma islemlerine cok basarilidir.
        bu yüzden eleman bulma işlemlerini çok yapacaksanız ArrayList kullanmalısınız.

     */

    public static void main(String[] args) {

        LinkedList<String> visitors = new LinkedList<>();

        visitors.add("Tom");
        visitors.add("Hanks");
        visitors.add("Tom Hanks");
        visitors.add("Pitt");
        visitors.add("Brad Pitt");
        visitors.add(2, "Angelina Julie");
        visitors.add("Brad Pitt");
        visitors.add("Tom Hanks");

        System.out.println(visitors); // [Tom, Hanks, Angelina Julie, Tom Hanks, Pitt, Brad Pitt, Brad Pitt, Tom Hanks]

        // LinkedList ler ekleme ve silme ile alakali cok fazla method icerir..

        visitors.addLast("Ajda Pekkan"); // sona ekle
        visitors.addFirst("Cuneyt Arkin"); // basa ekle
        System.out.println(visitors); // [Cuneyt Arkin, Tom, Hanks, Angelina Julie, Tom Hanks, Pitt, Brad Pitt, Brad Pitt, Tom Hanks, Ajda Pekkan]

        visitors.removeLast(); // son node sil
        System.out.println(visitors); // [Cuneyt Arkin, Tom, Hanks, Angelina Julie, Tom Hanks, Pitt, Brad Pitt, Brad Pitt, Tom Hanks]

        visitors.removeFirst(); // ilk node sil
        System.out.println(visitors); // [Tom, Hanks, Angelina Julie, Tom Hanks, Pitt, Brad Pitt, Brad Pitt, Tom Hanks]

        // ilk gorunumu siler
        visitors.removeFirstOccurrence("Tom Hanks");  // ilk gorunumu sildi
        System.out.println(visitors);  // [Tom, Hanks, Angelina Julie, Pitt, Brad Pitt, Brad Pitt, Tom Hanks]

        visitors.removeLastOccurrence("Brad Pitt"); // son gorunumu sildi
        System.out.println(visitors); //[Tom, Hanks, Angelina Julie, Pitt, Brad Pitt, Tom Hanks]

        //ilk elemani siler ve size verir
        // eleman yoksa  NoSuchElementException atar...
        String firstEl = visitors.pop();  // Cut + Paste (kes+yapistir) ===CTRL+X
        System.out.println(firstEl); // Tom

        System.out.println(visitors); //[Hanks, Angelina Julie, Pitt, Brad Pitt, Tom Hanks]


        LinkedList<String> myList = new LinkedList<>();

        // myList.pop(); // NoSuchElementException atar...










    }
}
