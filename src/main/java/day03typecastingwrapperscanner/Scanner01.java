package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner01 {

    //Scanner kullanicidan data almaya yarar, Scanner kullanici ile etkilesim kurmamizi saglar.
    //Scanner bir Java class'idir. Bu class'i kullanabilmek icin Imnport etmek gerekir.
    //Scanner class'i Java'nin Util kutuphanesindedir.
    public static void main(String[] args) {
        //Kullanicidan data almak icin yapilmasi gerekenler.
        // 1.Adim: Scanner class'indan obje olusturmak.
        Scanner input = new Scanner(System.in);

        //2.Adim: Kullaniciya ne yapacagini soyle
        System.out.println("Hey kullanici yasini gir...");

        //3.Adim: Kullanicidan aldigimiz data yi bir variable in icine koyun.
        byte age = input.nextByte();

        System.out.println("Hey kullanici senin yasin " + age);

    }

}
