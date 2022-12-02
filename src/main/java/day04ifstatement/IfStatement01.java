package day04ifstatement;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {

        /*
        If it rains I will cancel the picnic

        If statement bell kodlari belli sarta bagli olarak calistirmaya yarar.
        */

        //Example 1 - Sayi pozitif ise ekrana pozitif yazdirin...

        int s = 12;

        if (s > 0) {
            System.out.println("Pozitif");
        }

        // Example 2 - Verilen character buyuk harf ise ekrana buyuk harf yazdirin.
        char c = 'A';
        if (c >= 'A' && c <= 'Z') {
            System.out.println("buyuk harf");
        }

        /*
            Note:   && = and   islemi sadece boolean ile kullanılır.
            true    &&  true    = true
            true    &&  false   = false
            false   &&  true    = false
            false   &&  false   = false

            && islemi mukemmeliyetcidir. true sonucu almak icin hersey true olmalidir.
        */


        // Example 3 ; Verilen sayi uc basamakli ise ekrama 3 basamakli yazdirin..

        int a = -369;
        a = Math.abs(a);  // mutlak deger negatif sayiyi pozitif e cevirir.
        if (a > 99 && a < 1000) {
            System.out.println("3 Basamakli");
        }

        // Example 4 ; Verilen bir sayi cift sayi ise ekrana cift sayi yazdirin.
        int s1 = 236;

        s1 = Math.abs(s1);

        // = isareti atama operatorudur. matematikdeki = anlamina gelmez...
        // Matematik deki = isareti Java da == seklindedir.
        if (s1 % 2 == 0) {
            System.out.println("Cift sayi");
        }

        // Verilen sayi 300 den kucuk xeya 1200 den buyuk ise ekrana Harika sayi yazdirin,,,,
        int r = 250;
        if (r < 300 || r > 1200) {
            System.out.println("Harika sayi");
        }

            /*
            || islemi sadece boolean ile kullanilir.
                true    ||  true     = true
                true    ||  false    = true
                false   ||  true     = true
                false   ||  false    = false

                Not: || isleminde false alabilmek icin herseyin false olmasi gerekir.
                     || isleminde sadece bir tane true sonucu true yapmaya yeter
            */

    }

}
