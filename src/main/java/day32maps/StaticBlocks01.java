package day32maps;

public class StaticBlocks01 {


    public static double pi;

    // static blok'lar ihtiyacimiz olan variable lari class olusturma safhasind a elimizde olmasini saglar
    // static bloklar class icindeki her seyden once calistirilir.
    // main methoddan ve diger tum methodlardan once calistirilir.
    // static bloklar icinde sadece static variable lara deger atana bilir..
    // birden fazla static blok varsa ustdeki once calistirilir..

    static {

        System.out.println("Static blok 2");
    }




    public static void main(String[] args) {

        System.out.println("main method");

    }


    static {
        pi=3.14;
        System.out.println("Static blok 1");
    }


    static {

        System.out.println("Static blok 3");
    }


}
