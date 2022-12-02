package day11loops;

public class ForLoop01 {
    public static void main(String[] args) {

        //Example 1: 3 den 6 ya kadar tam sayilarin toplamini bulan kodu yaziniz..

        int toplam = 0;

        for(int i = 3 ; i<7 ; i++ ){
            toplam = toplam + i;
        }
        //Note :   System.out.println(toplam); loop disina yazilirsa son degeri ekrana yazdirir.
        //          loop icine yazilirsa her bir loop icin toplamin hangi deger aldigini ekrana yazdirir.
        System.out.println(toplam);


        //Example 2: 6 dan 3 e kadar tam sayilarin carpimini yazin

        int carp = 1;
        for(int i = 6 ; i>2 ; i--){
            carp =carp*i;
        }
        System.out.println(carp);

        //Example 3: size verilen bir tam sayinin rakamlari toplamini bulaunuz..
        // 385

        int num = 385;
        num = Math.abs(num);
        int sonuc = 0;

        for(int i = num ; i>0 ; i=i/10 ){
            sonuc = sonuc + i%10;
        }
        System.out.println(sonuc);

        //Example 4 :  sizi verilen bir stringi ters ceviren kodu yaziniz...
        String str = "Kaba";
        String ters = "";
        for(int i = str.length()-1 ; i>=0  ; i-- ){
            char c = str.charAt(i);
            ters = ters + c;
        }
        System.out.println(ters);





    }
}
