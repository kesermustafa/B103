package day04ifstatement;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

        /*
        Kullanicidan ilk orta ve soy ismisni ve kimlik numarasini
        aliniz ve asagidaki  formatta ekrana yazdiriniz.
        Ali Mert Can
        123456789
         */

        Scanner input = new Scanner(System.in);
        // 1. YOL
        System.out.println("Ilk isminizi giriniz..");
        String ilkIsim = input.next();
        System.out.println("Orta isminizi giriniz...");
        String ortaIsim = input.next();
        System.out.println("Soyisminizi giriniz...");
        String soyisim = input.next();
        System.out.println("Kimlik numaranizi giriniz...");
        String kimlikNo = input.next();

        System.out.println(ilkIsim + " " +  ortaIsim + " " + soyisim);
        System.out.println(kimlikNo);

        //2.YOL

        System.out.println("ilk-orta ve soyisminizi ve kimlik no giriniz....");
        String ilk = input.next();
        String orta = input.next();
        String soy = input.next();
        String kimlik = input.next();

        System.out.println(ilk + " " +  orta + " " + soy);
        System.out.println(kimlik);

        /*
            next() ile nextLine() farki medir.
            next() methodu kullanicidan gelen tum stringin sadece ilk kelimesini alir.
            nextLine() methodu kullanicidan gelen tum Stringi alir.
         */

        //3.YOL

        System.out.println("ilk orta ve soyisminizi giriniz....");
        String tamIsim = input.nextLine();
        System.out.println(tamIsim);

        System.out.println("Kimlik numaranizi girinriz..");
        String kimlikNumarasi = input.next();
        System.out.println(kimlikNumarasi);

    }
}
