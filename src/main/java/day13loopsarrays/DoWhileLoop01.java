package day13loopsarrays;

import java.util.Scanner;

public class DoWhileLoop01 {
    public static void main(String[] args) {

     //Example 1 : Kulanicidan bir sayi aliniz....100 den kucuk ise ekrana kazandin yazdiriniz...
     // Aksi halde Kaybettin yazdiriniz...
        // Kullanici kazandikca oyun devam etmeli

        Scanner scan = new Scanner(System.in);

//        int s = 0;
//
//        do {
//            System.out.println("Bir sayi giriniz");
//            s = scan.nextInt();
//
//            if(s<100){
//                System.out.println("Kazandiniz");
//            }
//        }while(s<100);
//        System.out.println("Kaybettin!");


        // Example 2: Kullanicidan isimler aliniz ilk harfinin buyk harf olup olmadigini kontrol ediniz..

        do{
            System.out.println("Isminizi giriniz..");

            char ilk = scan.next().charAt(0);

            if(ilk >= 'A' && ilk <= 'Z'){
                System.out.println("Ismi basariyla girdiniz...");
            }else{
                System.out.println("Ismi yanlis girdiginiz icin isleminiz iptal edildi..");
                break;  // LOOP KIRMAK ICIN yoksa true dan dolayi sonsuz dongu olusur...
            }
        }while (true);

        // Infinite loop : Sonsuz dongu

        //artima azaltma kisminda hata yaparsniz "infinite loop sorunsal"i olusur...
//        for( int i =1  ; i < 4   ; i...  ){
//            System.out.println("Hi");
//        }
        //artima azaltma kismini yazmazsaniz "infinite loop sorunsal"i olusur...
//        for( int i =1  ; i < 4   ; ....  ){
//            System.out.println("Hi");
//        }

        //artima azaltma kismini yazmazsaniz "infinite loop sorunsal"i olusur...
//        int i = 12;
//
//        while (i<15){
//            System.out.println("Hi");
        //......
//        }




    }
}
