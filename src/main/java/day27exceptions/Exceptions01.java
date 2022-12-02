package day27exceptions;

public class Exceptions01 {
    public static void main(String[] args) {


        double r1 = compareNumOfCharacters("Java", "xy");
        System.out.println(r1);

        double r2 = compareNumOfCharacters(null, "xy");
        System.out.println(r2);

        double r3 = compareNumOfCharacters("Java", "");
        System.out.println(r3);


    }

    //Verilen iki Stringden birinin karakter sayisinin digerinin karakter sayisinin kac kati oldugunu veren method olusturun.

   public static double compareNumOfCharacters (String s, String t){
        double resault = 0;
        try{
           resault =  s.length() / t.length();
        }catch (NullPointerException e){
            System.out.println("length methodu null ile kullanimaz..");
        }catch (ArithmeticException e){
            System.out.println("Herhangi bir sayi sifir ile bolunmez..");
        }finally {
            System.out.println("Database ile connections kesildi.");
            //buraya database ile irtibati kesecek code yazilacak....
        }
        return resault;
   }

   /*
   Javada birbirine benzeyen 3 tane keyword vardir..
    "final"  "finally",   "finalize",

     1- final bir keyword'dur Variable class ve methodlar icin kullanilir...
        "final" keyword i)Variable'larda kullanilabilir.
                        public final int age = 12;
                        a)Atanan deger degistirilemez.
                        b)Deger atamasi yapilmak zorundadir.

                    ii)Method'larda kullanilabilir.
                       public final int add(){
                       return a+b;
                   }
                        a)Bir method olusturulurken "final" olarak olusturulmus ise
                          o methodun body'si asla degistirilemez. Dolayisiyla o method override edilemez.

                   iii)Class'larda kullanilabilir.
                       Bir Class'i "final" yaparsaniz o Class'i kisirlastirmis olursunuz
                       Bir Class "final" ise o Class'a extend edilemez.
                       "final" Class Child olabilir.

        final variable'lar isimlendirilirken büyük harfler kullanılır, isimlendirmede birden fazla kelime
        kullanılırsa kelimeler arasina "_" konulur.

     2- finally bir 'code block"dur
        "try-catch" veya "try" ile kullanilabilir...
        "finally" code block icine yazilan code lar her durumda calistirilir.
        Mesala Database ile connection'i kesmek her halukarda yapilmasi gereken bir fiildir.
        Bunu finally ile yapariz.....

     3- "finalize" bir methoddur bu  method Java tarafindan datalar imha edilmeden once cagrilir.
        Bu methaod datalari imha edilecek hale getirir. daha sonra Garbage Collector bu datalari imha eder.

    "finalize" methoddunu developerlarda cagirabilir ama java kendi bildigini yapar...
    */

    /*
    Interview sorusu : "final", "finally", "finalize" nedir?
        final(keyword): ==> final method override edilemez.
                      final variable degeri degistirilemez.
                      final class child class sahibi olamaz.
        finally(code block) ==> try-catch block'dan sonra kullanilir ve Exception atilsa da atilmasa da calisir.

        finalize(method) ==> Garbage Collector bir data'yi imha etmeden once calistirir.
     */
}
