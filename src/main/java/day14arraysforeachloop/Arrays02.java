package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays02 {
    public static void main(String[] args) {

        // Example 1: [0, 2, 3, 0, 12, 0] sifirlari en sona koyunuz...
        //            [2, 3, 12, 0,  0,  0]

        int original[] = {0, 2, 3, 0, 12, 0};
        int yeni[] = new int[original.length];
        int idx = 0;

        for(int i = 0 ; i< original.length; i++){
            if(original[i] != 0){
                yeni[idx] =original[i];
                idx++;
            }
        }
        System.out.println(Arrays.toString(yeni)); //[2, 3, 12, 0, 0, 0]

        //Example 2 : Bir Array in icinde herhangi bir elemanin olup olmadigini ve
        // kackere tekrarlandigini kontro eden ve gosteren kodu yaziniz.
        // [ 2, 1, 2 -3, 2] ==> Kullanici 2 yi sordu / 2 elemani var ve 3 kere tekrarlandi..
        //                  ==> Kullanici 6 yi sordu / 6 elemani yok ve 0 kere tekrarlandi...

        int ary[] = {2, 1, 2 -3, 2 };

        int eleman = 2;

        int counter = 0;  // flag : bazi durumlarin olup olmadigini kontrol etmek icin flag kullanilir..

        for(int w : ary) {

            if (w == eleman) {

                counter++;
            }
        }

            if(counter>0){
                System.out.println(eleman + " array'de " + counter + " defa var");
            }else{
                System.out.println(eleman + " yoookkkkk");
            }


            // Example 3 ; size verilen culmedeki en uzun kelimeyi bulan kodu yaziniz...
                        // "Java kolaydir calicsana, ne kolay ki calismayana"


        String cumle = "Java kolaydir calicsana, ne kolay ki calismayana.";

        cumle = cumle.replaceAll("\\p{Punct}", "");


        String yeniCumle[] = cumle.split(" ");

        Arrays.sort(yeniCumle);
        System.out.println(Arrays.toString(yeniCumle));  // Alfabetik siralama yapar [Java, calicsana, calismayana, ki, kolay, kolaydir, ne]


        
        Arrays.sort(yeniCumle, Comparator.comparingInt(String::length));  // kelimenin uzunluguna gore siralama yapar.
        System.out.println(Arrays.toString(yeniCumle)); //[ne, ki, Java, kolay, kolaydir, calicsana, calismayana]

        System.out.println(yeniCumle[yeniCumle.length-1]);



    }
}
