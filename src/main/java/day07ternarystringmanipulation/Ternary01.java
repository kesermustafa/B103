package day07ternarystringmanipulation;

public class Ternary01 {
    public static void main(String[] args) {
        /*
        Exaple 1 ; bir sayinin pozitif olup lmadigini ekrana yazdirn kodu yazdirin....
         */

        //1.YOL.... IF-ELSE

        int a = -12;

        if (a>0){
            System.out.println("Pozitif");
        } else{
            System.out.println("Pozitif degil");
        }

        //2.YOL TERNARY
                //Condition   ?  Condition dogru ise uygulanacak kod   :   Condition yanlis ise uygulanacak kod
        String sonuc = a>0 ? "Pozitif" : "Pozitif degil";
        System.out.println("sonuc = " + sonuc);

        //Exaple : 2 sayidan kucuk olan kodu yaziniz

        int b = 120;
        int c = 23;
        int min = b<c ? b : c;
        System.out.println("min = " + min);

        //Exaple 3: Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz....
        //          Pozitif saylarin ve 0 in mutlak degeri kendileridir.
        //          Negaftif sayilarin mutlak degeri -1 ile carpilmis halleridir...

        int d = -45;
        int abs = d<0 ? -1*d : d;
        System.out.println("abs = " + abs);


        //Example 4 : 2 tane sayi , ayni isaretli ise bu sayilri carpiniz
        //              farkli isaretli ise islem yapamam mesaji veriniz...

        int e = -12;
        int f = 10;

        //Ternary iki farkli data tipilerinde sonuc return ederse sonucun data tipini "Object" yapiniz..
        Object islem = (e>0 && f>0) || (e<0 && f<0) ? e*f : "Islem Yapamam";
        System.out.println("islem = " + islem);

        //Note : Javada her class in en az bir tane "Parent" class i vardir..
        //      Sadece Object class i Parent class i yoktur....

    }
}
