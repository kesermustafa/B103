package day05ifstatement;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {

        //Kullanicidan alinan sayinin tek mi cift mi oldugunu ekrana yazdiran kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz...");

        int s = input.nextInt();

        //1.YOL
        if(s%2==0){
            System.out.println("Cift sayi..");
        }
        if(s%2!=0){
            System.out.println("Tek sayi..");
        }

        //2.YOL

        if(s%2==0){
            System.out.println("Cift sayi..");
        }else{
            System.out.println("Tek sayi..");
        }

        //Example 2: Bir sayinin negatif pzotof veya notr oldugunu soyleyen kodu yaziniz.
        System.out.println("Bir sayi giriniz.. ");
        double d = input.nextDouble();

        if(d>0){
            System.out.println("Pozitif");
        }else if(d==0){
            System.out.println("Notr");
        }else {
            System.out.println("Negatif");
        }



    }
}
