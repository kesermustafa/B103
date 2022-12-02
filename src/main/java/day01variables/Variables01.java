package day01variables;

public class Variables01 {


        //Variable nasil olusturulur?
        //1) Access Modifier   2) Dta Type    3) Variable ismi   4) =    5) Deger   6) ;
        // Java'da noktali virgul ingilizce de ki nokta gibidir.
        // Ingilizcede cumle deriz, Java'da "statement" deriz.
        // = ismi Assignment Operator'dir.     Assignment (Atama) Operator sagdaki degeri alir soldaki variablenin icine koyar.

        public int age = 13;
        public int height = 183;

        // Java da Data Type'lar
    /*
        1) int: Integer'in kisaltmasi .  Integer tam sayi demektir.   32 bit kullanir.
                Matematikte tam sayilarin basi ve sonu yoktur. fakat java da tam sayilarin basi ve sonu  vardir.
                En kucuk Int = -2,147,783,648
                En buyuk Int =  2,147,783,647
        2) byte : Tam sayilar icin kullanilir. 8 bit kullanir.
                En kucuk byte : -128
                En buyuk byte : 127
        3) short ; Tam sayi      16 bit kullanir
                En kucuk short : -32,768
                En buyuk short :  32,767

        4) long : Tam sayi icin  64 bit kullanir.
                En kucuk : -9,233,372,036,854,755,808
                En buyuk :  9,233,372,036,854,755,807

        5) float : Ondalik sayilar icindir        32 bit yer kaplar
                    float virgulden sonra 7 basamak icerir.  0,1234567F
                    float degerlerinde sona "f" veya "F" koymaniz gerekir.

        6) double : Ondalik sayilar icindir       64 bit yer kullanir.
                    double virgulden sonra 16 basamak icerir.

        7) boolean : true veya false degerleri icin kullanilir.      1 bit kullanir.

        8) char ; Tek karakterler icin kullanilir.   16 bit kullanir.
               A, c, 2, ?, _, =
                char'lara deger veririken degeri tek tirnak arasina koyun yoksa hata verir.

                NOTE ; Java buyuk ve kucuk harflere duyarlidir.
                       Java icin TRUE ve true tamamen farklidir.

         Note : Numeric Data Type :   byte < short < int < long < float < double
                Numeric Olmayan   :  boolean --- char

                               Non-Primitive Data Types
        String : Isim, adres, kimlik numarasi gibi bir veya birden fazla karakter iceren degerler kullanilir.
                 String degerleri mutlaka cift tirnak arasina konulmalidir.
                 Sting non-primitive dir. Yani bir String olusturdugunuz da Java size bir suru method verir.

                 1-Non-Primitive data type larinda degerin yaninda metod vardir.
                   Primitive data type larinda ise sadece deger vardir. method yoktur.
                 2- Promitive data type lari Java tarafindan olusturulmustur, biz primitive data olusturamayiz.
                    Non-Primitive data type lari java tarafindan da olusturulmustur, biz de olusturabiliriz.
                    Non-Primitive sayilamayacak kadar coktur cunku developer lar Non -Primitive olustururlar.

                    Olusturulan her class non primitive dir. cunku deger ve method icerir.

                 3- Primitive data type leri isimlendirilirken kucuk harfle baslar.
                    Non-Primitive data type isimleri buyuk harfle baslar.
                 4- Primitive data type lar memory de farkli buyuklukde yerler kullanir.
                    Non-Primitive 'lerin hepsi memory de ayni buyukluk de yer kaplar.
     */

        public byte price = 12;
        public short populationOfVillage = 23000;

        public float priceOfShirt = 13.99F;
        public double weightOfCell = 0.000012045;

        // siz long demenize ragmen Java verilen sayiyi int kabul eder.
        //Bu yuzden long bir veriable a "int" araliginin disinda bir sayi verirseniz mutlaka sonuna "L" veya "l" koyun.
        public long populationOfWorld = 7000000000L;

        //Burada L koymadigimiz halde problem yok cunku 12324 int araligina uyar.
        public long x = 1234;

        public boolean isOld = true;
        public boolean isRich = false;

        public char initial = 'S';

        public String name = "Tom Hanks";

        public static void main(String[] args) {


        }
}
