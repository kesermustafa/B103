package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        // Example 1: Sayilari kullanicidan alan ve Toplama islemi yapan kodu yaziniz.

        //1.Adim: Scanner calss'indan obje olusturun
        Scanner input = new Scanner(System.in);

        //2.Adim : Kullaniciya ne yapacagini gir.
        System.out.println("ilk sayiyi giriniz");
        double sayi1 = input.nextDouble();

        System.out.println("ikinci sayiyi giriniz");
        double sayi2 = input.nextDouble();

        //3.Adim:
        System.out.println(sayi1+sayi2);



    }
}
