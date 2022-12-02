package day08tringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {

        //Example 1 ; Bir string deki space haric kac tane karakter kullanildigini gosteren kodu yaziniz...
        // "Ali okula gitti."  ==> 14

        String str = "Ali okula gitti.";

        //replace() methodu bir stringdeki herhangi bir karakteri veya karakterleri degistimek icin kullanilir..
        int num =str.replace(" ", "").length();

        System.out.println(num);

        //Example 2: bir stringdeki tum a harflerini A ya ceviriniz....
        String s = "Ankara'nin tasina gozlerimin yasina bak";

        String st = s.replace("a", "A");
        System.out.println(st);

        //Example 3 ; Bir Stringdeki "kara" kelimesinin yerine * koyunuz....

        String t = "Kara kara dusunme Ankara";
        String yeniT= t.replace("kara", "*");
        System.out.println(yeniT);    //  Kara * dusunme An*

        //Example 4 : Bir string deki tum sayilari " * " ceviriniz....
        String stdId = "AC202117004";

        String yeniStdId = stdId.replaceAll("[0-9]", "*");
        System.out.println(yeniStdId);

        /*
        Bir grup data yi ifade eden kod lara "Regex"denir...
        "Regex"Regular Expressions in kisaltilmasidir...

        1) Tum rakamlar ==> [0-9]
        2) Tum kucuk harfler ==> [a-z]
        3) Tum buyuk harfler ==> [A-Z]
        4) Tum harfler ==> [a-zA-Z]
        5) Tum sesli harfler ==> [aeiouAEIOU]
        6) Space ==> [ ]
        7) Tum rakamlar ve tum harfler [0-9a-zA-Z]
        8) Tum noktalama isaretler ==> \\p{Punct}


        1) Rakamlar haric tum karakterler ==> [^0-9]
        2) kucuk harfler haric butun karakterler ==> [^a-z]
        3) Buyuk harfler haric tum karakterler.==> [^A-Z]
        4) Tum harfler haric tum karakterler ==> [^a-zA-Z]
        5) Space haric ==> [^ ]
        6)
          */

        // Example 5 : verilen stringde kullanilan noktalama isareti
        // ve rakamlar ve space karakterleri haric tum karakterlerin sayisini bulan kodu yaziniz..

        String u = "Ali 13 yasinda, dersem inanma!...";

        int sonuc = u.
                      replaceAll("[0-9]", "").
                      replace(" ", "").
                      replaceAll("\\p{Punct}", "").
                      length();
        System.out.println(sonuc);

        //Example 6 : Bir pasword un gecerli oolup olmadigin asagidaki kurallara gore yaziniz...
        // 1) space haric en az 8 karakter olmali
        // 2) en az 1 sembol icermeli ..
        // 3) en az 1 rakam icermeli
        // 4) en az 1 buyuk harf icermeli
        // 5) en az 1 kucuk harf icermeli

        String pwd = "B78c? K!m";
        // 1) space haric en az 8 karakter olmali
        boolean first = pwd.replace(" ", "").length()>7;

        // 2) en az 1 sembol icermeli ..
        boolean second = pwd.replaceAll("[0-9a-zA-Z ]", "").length()>0;

        // 3) en az 1 rakam icermeli
        boolean third = pwd.replaceAll("[^0-9]", "").length()>0;

        // 4) en az 1 buyuk harf icermeli
        boolean fourth = pwd.replaceAll("[^A-Z]", "").length()>0;

        // 5) en az 1 kucuk harf icermeli
        boolean fifth = pwd.replaceAll("[^a-z]", "").length()>0;

        boolean pwdGecerli = first && second && third && fourth && fifth;

        if ( pwdGecerli){
            System.out.println("Pasword gecerli");
        }else{
            System.out.println("Pasword gecerli degil");
        }

        //Example 7 : bir stringdeki noktalama isaretlerinin sayisini gosteren kodu yaziniz..

        String cumle = "Sen Yapmazsan, ben ?...";

        int number = cumle.replaceAll("[^\\p{Punct}]", "").length();
        System.out.println(number);


        //Example 8 : Verilen bir string al ile basliyor ve x ile bitiyorsa ekrana harika yazdirin
        //              aksi halde normall yazdirin...


        String v = "KAlex";

        boolean baslangic = v.startsWith("Al");
        boolean bitis = v.endsWith("x");

        String result  = baslangic && bitis ? "Harika" : "Normal";
        System.out.println(result);







    }
}
