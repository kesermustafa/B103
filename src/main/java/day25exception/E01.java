package day25exception;

public class E01 {

    /*
    1 - Exception (istisnai hata) javada kodlarimizi calistiriken meydana gelen beklenmadik durumlardir.
    2 - Exception'lar ile calismanin iki yolu
        a) try-catch block ile kullanma ve exception olussa bile calismayi devam ettirme,
        b) throw exception kullanarak calismayi durdurma (mesela yazdigimiz kod geregi bir dosya uzerinden
            okuma yapmamiz gerekiyor ise bu dosyamiz silinmis ise Java dosyayi bulamaz ve uygulamanin deva etmesi gerekmez.
    3 - Eger exceotion'i handle etmez isek (sorunu halletmezsek) java calismayi durdur,
    4 - try-catch kullanirken try kodunu bir veya birden fazla catch ile kullanabiliri.
    5 - "try" kodu "catch" yazmadan kullanilmaz...
    6 - Eger yazmis oldugunuz herhangi bir kod satirinda problem olabilecgini dusunuyorsaniiz
        try-catch methodu icerisine koymalisiniz..
    7 - catch block parantezi icerisine olmasi muhtemel class ismi yazilir...
    8 - e.getmessage() methodunu kullanarak teknik mesajlar elde edebiliriz..
            System.out.println() burada yazmis oldugum mesajlar benim eknik olmayan aciklamalardir.
            e.printStackTrace(); methodu exception ile ilgili detaylica teknik mesaj verir. kod calismaya
            devam eder...
    9 - System.err.println("Bolme isleminde bir problem olustu "); hata mesajini renkli yazdirir..
    10- Eger try body icindeki kod sorusuz calisirsa catch block devreye girmez....
     */


    public static void main(String[] args) {
//
//        divide(6, 2);
//        divide(0, 2);
//        divide(6, 0); // Matematikte bir sayi 0 ile bolunemez...

        divide2(5, 0);
        divide(6, 2);
        divide(0, 2);



    }
    //  1.YOL Tavsiye edilmez..
    // Bir developer icim tum matematik kurallarini ezbere bilmek mumkun degildir...
    public static void divide(int a, int b){
        if(b==0){
            System.out.println("Bir sayi sifir boluneez");
        }else{
            System.out.println(a/b);
        }
    }

    // 2.yol  try-catch kullanarak exeption'i handle etmek tavsiye edilir.
    public static void divide2(int a, int b){

        try{
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println("Bolme isleminde bir problem olustu "+ e.getMessage());
            e.printStackTrace();  // hatayi kodu durdrmadan yazdirir.......
            System.err.println("Bolme isleminde bir problem olustu "); // renkli mesaj veriyor...


        }

    }





}
