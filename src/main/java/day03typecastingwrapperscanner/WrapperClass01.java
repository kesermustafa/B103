package day03typecastingwrapperscanner;

public class WrapperClass01 {

    public static void main(String[] args) {
        /*
            Java primitivlere methodlar ekleyerek yeni bir yapi olusturdu, bu yapiya "Wrapper Class" dedi.

            Primitive      Wrapper
            byte    ==>     Byte
            short   ==>     Short
            int     ==>     Integer ***
            long    ==>     Long
            float   ==>     Float
            double  ==>     Double
            boolean ==>     Boolean
            char    ==>     Character ***
         */

        byte primitiveByte = 12;
            //primitiveByte yazip nokta koydugunuzda hic method goremezsiniz.
                // Cunku primitiv'ler method icermez. Sadece deger icerir.

        Byte wrapperByte = 12;
            // wrapperByte yazip nokta koydugumuzda bir cok method goruruz.
                //Cunku wrapper lar method icerir.

        //Excemple 1 ; byte data type'inin en kucuk ve en buyuk degerlerini ekrana yazdiriniz.
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        //Excemple 1 ; short int long  data type'inin en kucuk ve en buyuk degerlerini ekrana yazdiriniz.

        System.out.println(Short.MAX_VALUE); // 32767
        System.out.println(Short.MIN_VALUE); // -32768

        System.out.println(Integer.MAX_VALUE); //
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        //"primitive'ler nasil wrapper'lara cevrilir. Autoboxing (otomatik kutulama)

        float f1 = 13.99F;
        Float wrapperF1 = f1;  // Autoboxing (otomatik kutulama)
        System.out.println(wrapperF1);

        // wrapper'lar nasil primitive'lere cevrilir.  //Unboxing (kutudan cikarma)

        Character w1 = 's';
        char primitiveW1 = w1; //Unboxing (kutudan cikarma)  otomatik yapiliyor

        System.out.println(w1);
        System.out.println(primitiveW1);

        // Note : Autaboxing ve Unboxing Java tarafindan otomatik yapilir.

    }
}
