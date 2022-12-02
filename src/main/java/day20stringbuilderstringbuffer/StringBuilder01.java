package day20stringbuilderstringbuffer;

public class StringBuilder01 {

    /*
        1- StringBuilder Javada bir class dir.
        2- StringBuilder String olusturmaya yarar.
        3- String class varken nicin StringBuilder a ihtiyac duyariz?
            Cunku String Class Inmutable Class dair. ama biz bazen Mutable Stringlere ihtiyac duyariz.
            StringBuilder bize Mutable String verir..
        4- Inmutable Class da var olan deger degistrilemez. Siz Varolan degeri degistirmek istediginizde
            i) Memoryde yeni bir variable yeni deger olusturulr.
            ii) Eski variable'in pointer'i yeni variable'a dondurulur.
            iii) Eger bir variabe'i hic bir pointer gostermiyorsa o variable "Garbage Collector" tarafindan silinir.

            "Mutable Class"larda var olan deger degistirilebilir.
        5- String Class larin "Inmutable(degismez)" yapisi Securty icin onemlidir..
            Ayni degere sahip birden fazla String oldugunda Java bir tane Container olusturur. ve
            ayni degere sahip Stringlerin bu container'i kullanmasini temin eder. Bu memory'i korumak icin iyidir..
            Ancak container daki degeri bir variable icin degistirdigimiz de tum variable larin etkilenmesi
            tehlikesi vardir.
                Bu tehlikeden kurtulmak icin Java Stringleri "Inmutable(degismez)" yapmistir.
            Fakat herhangi bir variablein degerini degistirmek icin Java bir Yol bulmustur.
            Degistirmek istediginiz variable icin yeni bir container olusturur ve variable'in pointer'ini bu
            yeni variable'a yonlendirir. Boylelikle hem degisim saglanmis hem de digerleri etkilenmemis olur.

     */

    public static void main(String[] args) {

    String str = "Java";
    str = "Java super"; // bu kodu yazdigimizda .. stack memory deki reference pointer kiriliyor yeni pointer olusuruyor.

        String hesapSahibi1 = "Tom Hanks";
        String hesapSahibi2 = "Tom Hanks";
        String hesapSahibi3 = "Brad Pitt";


        //StringBuilder nasil olusturulur..
        StringBuilder strb1 = new StringBuilder("Java");
        System.out.println(strb1); // Java

        StringBuilder strb2 = new StringBuilder();

        //Yol a:
        strb2.append("Java");
        strb2.append(" is easy");
        strb2.append("!!!");
        System.out.println(strb2);

        //Yol 2  ==> Method zinciri
        strb2.append(" Learn").append(" Java earn").append(" money.");

        System.out.println(strb2);


        //StringBuilder larda karakter sayisi nasil bulunur.. ==> length() metodu ile bulunur.

        StringBuilder strb3 = new StringBuilder();  //16 ==> bos iken memory de 16 capacity li kutu olusturur
        strb3.append("Cat");
        strb3.append("xxxxxxxxxxxxxxx");

        int numOfChar = strb3.length();
        System.out.println(numOfChar);

        //Capacity asimlarinda; capacity var olanin iki katini iki fazlasina cikar
        int capacity = strb3.capacity();
        System.out.println(capacity);  //Capacity asimlarinda; capacity var olanin iki katini iki fazlasina cikar

        strb3.append("mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
        int capacity1 = strb3.capacity();
        System.out.println(capacity1); // 70 onceki 34'u 2ile carpti

        strb3.setCharAt(2, 'r'); // 2. index deki karakteri r ile degistir..
        System.out.println(strb3); // Carxxxxxxxxxxxxxxxmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm

        strb3.delete(3, 18);  // 3. index den 18.indeks e kadar sil
        System.out.println(strb3);  //Carmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm

        strb3.deleteCharAt(2); // belli bir indeks deki karakteri sil
        System.out.println(strb3);  //Cammmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm

        // revers() methodu StringBuilder i ters cevirir.
        // "Mutable"larda sadece methodu kullanmak orjinal degeri degistirmek icim yeterlidir.
        strb3.reverse();
        System.out.println(strb3);  // mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmaC


        //"Inmutable"larda orjinal degeri degistirmek icin method kullanmak yeterli degildir
           //  bir de atama yapmak lazim
        String abc = "Java";
        abc.replace("a", "i");
        System.out.println(abc);  //  Java

        abc =  abc.replace("a", "i"); // atama yaptik....
        System.out.println(abc);  //  Jivi


        //toString() methodu StringBuilder'lari Stringe cevirir...
        String stringStrb3 = strb3.toString();
        System.out.println(stringStrb3);

        // String'den StrinBuilder a geri donebilirsiniz...
        StringBuilder strb4 = new StringBuilder(stringStrb3);
        System.out.println(strb4);  // mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmaC

        // insert() araya ekleme yapmak icin kullanilir...
        strb4.insert(3, "XXXX");  // 3. karakterden sonra XXXX leri koyar
        System.out.println(strb4);  // mmmXXXXmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmaC

        //insert(3, "KLMOPQRSTU", 5, 8); ===> 3.character den sonra
        // "KLMOPQRSTU" Stringinin indeks 5,6,7 deki karakterleri yerlestir.
        strb4.insert(3, "KLMOPQRSTU", 5, 8);
        System.out.println(strb4);  // mmmQRSXXXXmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmaC

        // compareTo() methodu iki stringi karsilastiri..
        StringBuilder a = new StringBuilder("java");
        StringBuilder b = new StringBuilder("Java");

        // a.compareTo(b) methodu
            // 1- StringBuilder lar tamamiyle ayni ise 0 verir.
            // 2- a alfabekik sirada b den sonra gelirse aradaki alfabetik siralama farkini gosterir.
            // 3- a alfabekik sirada b den once gelirse negatif aradaki alfabetik siralama farkini gosterir.
            // 4- Kucuk buyuk harfe duyarlidir..

        int sonuc = a.compareTo(b);
        System.out.println(sonuc);

    }
}
