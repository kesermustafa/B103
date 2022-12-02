package day12loops;

import java.util.Scanner;

public class WhileLoops01 {
    public static void main(String[] args) {

        // 3 den 10 a kadar tam sayilari ayni satirda ekrana yazdirzn kodu yazdirin

        for(int i = 3 ; i<11 ; i++){
            System.out.print(i+", ");
        }
        System.out.println();
        //2.YOL
        int i = 3 ;
        while (i<11){
            System.out.print(i+", ");
            i++;
        }
        System.out.println();
    //Example 2 : 17 den 4 kadar tum cift sayi

        int a = 17;
        while (a>2){
            if(a%2==0){
                System.out.print(a + " ");
            }
            a--;
        }
        System.out.println();
        //Example 3 : 12 den 14 ye kadar sayilarin tpolamini veren kodu yaziniz...

        int sum = 0;

        int m = 12;
        while (m<15){
            sum = sum + m;

            m++;
        }
        System.out.println(sum);

        System.out.println("****");

        //Example 4: Size verilen bir tamsayinin rakamlari toplamini ekrana yazdiran kodu yaziniz

        int sonuc = 0;
        int sayi = 8965 ;
        sayi = Math.abs(sayi);
        while ( sayi>0 ){

           sonuc = sonuc + sayi%10;

           sayi = sayi/10;

        }
        System.out.println(sonuc);

        //Example 5 ; Kullanicidan aldiginiz ir sayini carpim tablosunu ekrana yazdiriniz.
        //    3===>   3x1=3    3x2=6   3x3=9 .... 3x10=30

        Scanner input = new Scanner(System.in);
        System.out.println("Carpim tablosu icin sayi giriniz...");
        int s1 = input.nextInt();


        int s2 = 1;
        while (s2<11) {

            System.out.println(s1 + " x " + s2 + " = " + s1*s2);
            s2++;
        }









    }
}
