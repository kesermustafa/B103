package day03typecastingwrapperscanner;

public class TypeCasting01 {

    //Type Casting : Bir numaric data type'ini diger numeric data type'ine cevirmek demektir.
    //              byte < short < int < long < float < double

        // Kucuk dtd type'ni buyuk data type'ine cevirmeye "Auto Widening" denir. Ototmatik genisletme
        // Buyuk dta type'ini kucuk data type'ine cevirmeye "Explicit Narrowing"denir. Acikca Daraltma

    public static void main(String[] args) {

       byte age = 23;
       int newAge = age;


       long population = 1234;

       int newPolulation = (int)population;

       //Example 1 : shortu double ceviren kodu yaziniz.

        short s1 = 25365;
        double d1 = s1;

        // Example 2 :floati byte yaopan kodu yazin
        float f1 = 12.36F;
        byte b1 = (byte)f1;

        System.out.println(b1);
            //Java ondalikli sayiyi tam sayiya ceviriken yuvarlama yapmaz.
            //Java ondalikli sayiyi, tam sayiya ceviriken ondalik kismini siler.

        int number = 515;
        byte newNumber = (byte)number;

        System.out.println(newNumber); // 3 yapti HYDAAAA
            //jAVA 515'i 256 ya (-128   127 arasindaki) boldu kalani verdi.

        int num = 510;
        byte newNum = (byte)num;
        System.out.println(newNum);  // -2
        // moduler aritmetik   510/256 = 2 kere var kalan -2  //



        //"primitive'ler nasil wrapper'lara cevrilir. Autoboxing (otomatik kutulama)

        float f01 = 13.99F;
        Float wrapperF1 = f01;  // Autoboxing (otomatik kutulama)
        System.out.println(wrapperF1);

        // wrapper'lar nasil primitive'lere cevrilir.  //Unboxing (kutudan cikarma)

        Character w1 = 's';
        char primitiveW1 = w1; //Unboxing (kutudan cikarma)  otomatik yapiliyor

        System.out.println(w1);
        System.out.println(primitiveW1);

        // Note : Autaboxing ve Unboxing Java tarafindan otomatik yapilir.





    }

}
