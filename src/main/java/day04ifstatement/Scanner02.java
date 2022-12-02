package day04ifstatement;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        /*
        char variable lari matematiksel islemlerde kullanirsaniz Java onlarin ASCII degerlerini kullanir.
            Ornegin  System.out.println('A'+ 'C');  ekrana AC yerine 132 yazdirir...
            Note : Javada "+" sembolunun iki anlami vardir.
                1-Toplama islemi
                2-Birlestirme islemi
                Java "+" sembolu gorunce once toplama yapmaya calisir,
                yapamazsa birlestirme islemi yapmaya calisir, o da olmazsa hata verir.
         */

        /*
        Kullanicidan ilk ve soyismini aliniz ilk ve soyisminin ilk harflerini ekrana yazdirin.
        Ali Can   ==> AC
         */

        //1.YOL
        Scanner input = new Scanner(System.in);
        System.out.print("Ilk isminizi giriniz...");
        char ilk = input.next().toUpperCase().charAt(0); // A

        System.out.print("Soyisminizi girirniz...");
        char son = input.next().toUpperCase().charAt(0); //C

        System.out.println(""+ilk+son);

        //2.YOL
//        System.out.println("Tam isminizi giriniz...");
//        String tamIsim = input.nextLine();// Ali Can
//
//        char ilkHarf = tamIsim.charAt(0);
//        System.out.print(ilkHarf);
//
//        char sonIsimIlkHarf=tamIsim.split(" ")[1].charAt(0);
//        System.out.println(sonIsimIlkHarf);






    }
}
