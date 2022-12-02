package day09stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {

        String str = "Kara kara dusunme Ankara";

        // indexOf() methodu verilen karakter veya karakterlerin ilk gorunumunun index'ini verir
        int idxa1 = str.indexOf("kara");
        System.out.println("idxa1 = " + idxa1); // 5

        //lastIndexOf() method'u
        int idxa2 = str.lastIndexOf("kara");
        System.out.println("idxa2 = " + idxa2); // 20

        String s = "Mississipi";
        int idxI = s.indexOf('i'); //indexOf() hem String hemde char ile kullanilabilir...
        System.out.println("idxI = " + idxI); // 1

        int idxIss1 = s.indexOf("iss"); // ilk gorunumun ilk karakterinin index'ini verir...
        System.out.println("idxIss1 = " + idxIss1); // 1
        int idxIss2 = s.lastIndexOf("iss"); // son gorunumun ilk karakterinin index'ini verir..
        System.out.println("idxIss2 = " + idxIss2); // 4

        //Example 1 : bir Stringdeki bir karakteri tekrarli veya tekrarsiz olup olmadigini veren kodu yaz
        // "Helloooo"  H tekrarsiz  e tekrarsiz l tekrarli o tekrarli

                /*
                                            Helloooo

                                            01234567  // indexler

               character                    indexof()               lastIndexOf()
                  H                            0                          0                     tekrarsiz
                  e                            1                          1                     tekrarsiz
                  l                            2                          3                     tekrarli
                  o                            4                          7                     tekrarli
                  Eger indexOf'la lastIndexOf esitse tekrarsiz
                  Eger indexOf'la lastIndexof esit degilse tekrarli
            */

        String t = "Helloooo";

        char c = 'o';
        if(t.indexOf(c) == t.lastIndexOf(c)){
            System.out.println("Tekrarsiz");
        }else{
            System.out.println("Tekrarli");
        }


        //indexOf() iki parametre ile kullanilirsa ikinci parametrede verilen
        // sayi kadar karakter gectikten sonra istenen karakterin ilk gorunumunun index'ini verir
        String u = "Learn Java earn money";
        int sonuc = u.indexOf("a", 6);
        System.out.println(sonuc); // 7
        int sonuc1 = u.indexOf("n", 5);
        System.out.println("sonuc1 = " + sonuc1); // 14
        int sonuc2 = u.indexOf("e", 4);
        System.out.println("sonuc2 = " + sonuc2); // 11


        //lastIndexOf() iki parametre ile kullanilirsa ikinci parametrede verilen sayiyi index olarak kabul edip en bastan
        // bu index'e kadar olan karakterleri bir kutu icine aliniz ve lastIndexOf()
        // method'unu sadece bu kutu icindeki String icin kullaniniz.
        int son = u.lastIndexOf("a", 15); //Basdan 15 karakter aldi buradan terse giderek ilk a'nin index'ini verdi...
        System.out.println("son = " + son);// 12

        String m = "Hello everyone!";
        int e = m.lastIndexOf("e", 10);
        System.out.println(e);




                //isEmpty()
        //isEmpty() method'u bir Stringin bos olup olmadigini kontrol eder
        // Eger hic karakter yoksa True return eder . karakter varsa fals return eder...
        // length()==0 demek isEmpty() true veriri demektir..
        // bir string'in bos olup olmadigini kontro icin "length()==0" kullanmayin isEmpty() kullanin..
        String v = " ";
        boolean bosMu = v.isEmpty();
        System.out.println("bosMu = " + bosMu); // False..

                // isBlank();
        // isBlank(); hem bos string icin hemde sadece space iceren stringler icin true return eder,,,
        String x = " ";
        boolean blankMi = x.isBlank();
        System.out.println("blankMi = " + blankMi);

        //Example 2 : Kullanicidan alinan isim mutlaka space den farkli enaz 1 karakter icermelidir..
        Scanner input = new Scanner(System.in);
        System.out.println("Ilk isminizi girirniz...");
        String ilk = input.nextLine();

        if(ilk.isBlank()){
            System.out.println("Sana ismini gir dedim");
        }else {
            System.out.println(ilk);
        }













    }
}
