package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        //  binarySearch() Method : Bu methodu kullanarak bir elemanin array de olup olmadigini anlariz.
        //  binarySearch() Methodunu kullanmadan once mutlaka "Arrays.sort()" kullanilmalidir...
        //  binarySearch() Methodu aradiginiz eleman array de varsa o elemanin o elemanini index ini return eder.
        //  binarySearch() Methodu aradiginiz eleman arrayde yoksa "- a" seklinde bir negatif sayi alirsiniz.
        //  bu sayidaki negatif isaretinin anlami bu sayi arrayde yok demektir. olsaydi hangi sirada olurdu..

        //  binarySearch() Methodu tekrarlayan elemanlar icin killanilmaz..



        int arr[] = {12, 31, 43, 14, 43, 45, 43, 90};

        int sayi = 43;

        Arrays.sort(arr); // [ 12, 14, 31, 43 ]

        int idx1 = Arrays.binarySearch(arr , sayi );

        System.out.println("idx1 = " + idx1);

        int sayi2 = 58;
        int sonuc = Arrays.binarySearch(arr, sayi2);

        System.out.println("sonuc = " + sonuc);  // -5  -'nin anlami eleman yok demek
                                                 //  5' in anlami olsaydi hangi (5). sirada olacakti.









    }
}
