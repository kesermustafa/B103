package day13loopsarrays;

import java.util.Arrays;
import java.util.Collection;

public class Arrays01 {

    /*
        1) Ayni data tipinde coklu data'yi depolamak icin Java'nin olusturdugu yapilar vardir..
        Bu yapilardan biri de Array lerdir.

     */

    public static void main(String[] args) {

        //Array nasil olusturldugunu ogrendik
        int stdAges[] = new int[7]; // [0, 0, 0, 0, 0, 0, 0]

        //Array nasil yazdirilir ogrendik
        System.out.println(Arrays.toString(stdAges));

        //Array lere elemanlar nasil eklenir...?
        stdAges[1] = 11;
        stdAges[0] = 12;
        stdAges[2] = 13;
        stdAges[3] = 14;
        stdAges[4] = 10;
        stdAges[5] = 12;
        stdAges[6] = 12;

        System.out.println(Arrays.toString(stdAges)); //[12, 11, 13, 14, 10, 12, 12]

        //Array deki herhangi bir elemani nasil yazdirabiliriz..
        System.out.println(stdAges[4]); // 10  // toString yazmadan yazdirilir...

        //Example 1: Array de ki en buyuk ve en kucuk elemanin toplamini ekrana yazdiriniz..
        // sort() methodu
        Arrays.sort(stdAges);  // Array'i kucukten buyuge siralar...
        System.out.println(Arrays.toString(stdAges)); // [10, 11, 12, 12, 12, 13, 14]

        int ilk = stdAges[0];    // ilk index
        int son = stdAges[stdAges.length-1]; // sn eleman  //length parantezsiz kullanilir..

        System.out.println(ilk+son); // 24

        //Exaample 2 : stdAges icindeki tum elemanlarin toplamini ekrana yazdiran kodu yaziniz..
        // 1. YOL  for loop ile toplama
        int sum = 0;
        for( int i = 0 ; i<stdAges.length ; i++ ){
            sum = sum + stdAges[i];
        }
        System.out.println(sum); //84

        // 2.YOL  whileile toplama
        int toplam = 0;
        int index = 0;
        while (index<stdAges.length){

           toplam = toplam + stdAges[index];
           index++;
        }
        System.out.println(toplam); // 84


        //3.YOL  do while ile toplama

        int sonuc = 0;
        int k = 0;
        do{
            sonuc = sonuc + stdAges[k];
            k++;
        }while (k<stdAges.length);
        System.out.println(sonuc);

        //4.YOL  : for each loop   // En gelismis loop dur.
                    //Array lerde ve Collections larda kullanilir...

        int top = 0;
        for(int w : stdAges ){
        top = top + w;
        }
        System.out.println(top);  // 84


        //Example 3 : String bir Array olusturunuz
        //              bu  Arraay e 5 tane isim yerlestiriniz..
        //              isimlerdeki karakter sayilarinin toplamini ekrana yazdiriniz..


        String name[] = new String[5];

        name[0] = "Ali";
        name[1] = "Tom";
        name[2] = "Veli";
        name[3] = "Kemal";
        name[4] = "Cem";

        System.out.println(Arrays.toString(name)); // [Ali, Tom, Veli, Kemal, Cem]

        int karkterSayiToplami = 0;

        for(String w : name){
           karkterSayiToplami =  karkterSayiToplami + w.length();
        }
        System.out.println(karkterSayiToplami); // 18

        //Example 4: Char bir Array olusturunuz sonra bu Arayy e 5 eleman ekleyiniz
                    //Bu Arayy deki; sadece buyuk harfleri ekrana yazdiriniz..


        char ch[] = {'A', 'c', 'D', 'k', 'M'};

        System.out.println(Arrays.toString(ch)); // [A, c, D, k, M]

        for(char w : ch){
            if(w>='A' && w<='Z'){
                System.out.print(w); //ADM
            }
        }














    }
}
