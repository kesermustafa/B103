package day07ternarystringmanipulation;

public class StringManipulation {
    public static void main(String[] args) {

        /*
        String Class METHODLAR

        1) equals () : i) iki stringin ayni mi degil mi anlamamiza yarar....
                       ii) equals() methodu "boolean" return eder...
        2) equalsIgnoreCase() : Iki tane stringin ayni olup olmadigini buyuk kucuk harfe dikkat etmeden anlamamizi saglar...
                                ii) equalsIgnoreCase() methodu "boolean" return eder...
        3) toLowerCase() : i) Bir String deki tum harfleri kucuk harfe cevirmek icin kullanilir....
                         ii)  toLowerCase() methodu String return eder....
        4) toUpperCase() : i) Bir String deki tum harfleri Buyuk harfe cevirmek icin kullanilir....
                         ii)  toUpperCase() methodu String return eder....
        5) charAt()     : i) Bir String de belli bir karakteri almak icin kullanilir.
                          ii) charAt() methodu char return eder.
        6) length()     : i) Bir string de kac tane karakter kullanildigni ogrenmek icin kaullanilir.
                          ii) length() methodu int return eder....
        7) contains()   : i) Bir Stringde belli bir karakterin/karakterlerin var olup olmadigini anlamak icin kullanilir..
                          ii) contains() methodu boolean return eder...
        8) split()      : i) Bir Stringi istedigimiz karakterden parcalamaya yarar....
                         ii) split() methodu Array return eder....
          */

        /*
        Bir pasword un gecerli olup olmadigini asagidaki kurallara gore kontrol eden kodu yaziniz...
        i) En az 8 karakter icermeli
        ii) Space karakteri icermemeli.
        iii) Ilk harfi "M" veya "m"olmali.
        iV) son karakteri "?" olmali
         */

        String pwd = "Manisa12?";
        // i) En az 8 karakter icermeli
        boolean first = pwd.length()>7;

        // ii) Space karakteri icermemeli.
        boolean second = !pwd.contains(" ");

        //iii) Ilk harfi "M" veya "m"olmali.
        boolean third = pwd.charAt(0)=='M'|| pwd.charAt(0)=='m';

        //iV) son karakteri "?" olmali
        boolean fourth = pwd.charAt(pwd.length()-1) == '?';


        System.out.println( first && second && third && fourth );

        String sonuc = ( first && second && third && fourth ) ? "Gecerli pasword" : "Gecersiz pasword";
        System.out.println(sonuc);


    }
}
