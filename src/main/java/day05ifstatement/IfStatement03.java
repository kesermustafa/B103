package day05ifstatement;

import java.util.Scanner;

public class IfStatement03 {

    public static void main(String[] args) {

        //iki tane String in birbirine esit olup olmadigini anlmak icin == degil .equals() kullanin..
        //iki tane stringin birbirine esit olup olmadigini kotrol etmak icin 2 tane method kullanilabilir.
        //1- equals() ==> Buyuk harf kucuk harfi onemser...
        //2- equalsIgnoreCase() ==> Buyuk harf kucuk harfi onemsemez...

        //Examole 1 ; Kullanicidan gun ismlerini aliniz o gunun hafta sonu mu  hafta ici mi oldugunu
        // kullaniciya soyleyiniz..

        Scanner input = new Scanner(System.in);
        System.out.println("Gun ismini giriniz...");
        String gun = input.next();

        //1.YOL

        if (gun.equalsIgnoreCase("Pazar")) {
            System.out.println("Hafta sonu...");
        } else if (gun.equalsIgnoreCase("Pazartesi")) {
            System.out.println("Hafta ici...");
        } else if (gun.equalsIgnoreCase("Sali")) {
            System.out.println("Hafta ici...");
        } else if (gun.equalsIgnoreCase("Carsamba")) {
            System.out.println("Hafta ici...");
        } else if (gun.equalsIgnoreCase("Persembe")) {
            System.out.println("Hafta ici...");
        } else if (gun.equalsIgnoreCase("Cuma")) {
            System.out.println("Hafta ici...");
        } else if (gun.equalsIgnoreCase("Cumartesi")) {
            System.out.println("Hafta sonu...");
        } else {
            System.out.println("Gecerli bir gun ismi giriniz...");
        }

        //2.YOL.....

        if (gun.equalsIgnoreCase("Pazar") || gun.equalsIgnoreCase("Cumartesi")) {
            System.out.println("Hafta sonu...");
        } else if (gun.equalsIgnoreCase("Pazartesi") ||
                gun.equalsIgnoreCase("Sali") ||
                gun.equalsIgnoreCase("Carsamba") ||
                gun.equalsIgnoreCase("Persembe") ||
                gun.equalsIgnoreCase("Cuma")) {
            System.out.println("Hafta ici...");
        } else {
            System.out.println("Gecerli bir gun ismi giriniz...");
        }


        //3.YOL

        boolean haftaSonu = gun.equalsIgnoreCase("Pazar") ||
                            gun.equalsIgnoreCase("Cumartesi");
        boolean haftaIci =  gun.equalsIgnoreCase("Pazartesi") ||
                            gun.equalsIgnoreCase("Sali") ||
                            gun.equalsIgnoreCase("Carsamba") ||
                            gun.equalsIgnoreCase("Persembe") ||
                            gun.equalsIgnoreCase("Cuma");

        if (haftaSonu){
            System.out.println("Hafta sonu...");
        } else if (haftaIci) {
            System.out.println("Hafta ici...");
        } else {
            System.out.println("Gecerli bir gun ismi giriniz...");
        }

    }
}
