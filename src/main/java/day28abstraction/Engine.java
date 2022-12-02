package day28abstraction;

public interface Engine {

    // interface lerdeki tum methodlar abstract olmak zorundadir.
    // interfaceler de abstract method olusturuken abstract keyword kullanmaya gerek yoktur.
    // cunku Java o method'un abstrack oldugunu bilir.
    // interface lerdeki methodlar JavA tarafindan otomatik  olarak "public" kabul edilir..
    // bu yuzden o methodlar icin public yazmaya gerek yoktur...

    // public abstract void eco(); ==> ile void eco(); ayni anlamdadir.

    /*
    ABSTRACT vs INTERFACE
   1) Abstract :
            1.1 - Class`dir.
        1.2 - Abstract ve concrete method`lar konabilir.
            1.3 - Kismi olarak abstraction saglar.
            1.4 - Birden fazla abstract class`a direk child olunamaz. Coklu inheritance`i desteklemez.
            1.5 - Hiz acisindan avantajlidir
        1.6 - Icindeki tum nesnelerin public olmasi zorunlu degildir.
        1.7 - Soyut olmayan metodlar static olarak tanimlanabilir.
            1.8 - Abstract class constructor`a sahiptir

   2) Interface :
            2.1 - Class degildir.
            2.2 - Sadece abstract method`lar konabilir.
            2.3 - Tam abstraction (soyutluk) saglar
        2.4 - Bir class`dan istediginiz kadar interface`i inherit edebilirsiniz. Coklu inheritance`a uygundur.
            2.5 - Hiz acisindan abstract class`a gore yavastir.
        2.6 - Icindeki tum nesnelerin public olmasi gerekir.
            2.7 - Method'lar static olamaz
            2.8 - Abstract class constructor`a sahiptir    */

    void eco();

    void gas();

    void tsi();

    // default ile static'in farki ==> static keyword kullanirsak method static olur.
    // default kullanirsak bu non-static methodtur. objelere yapistirilir. nonstatic methoda ulasmak icin
    // obje olusturmamiz lazim.
    // Interfacelerin icinde concrate method olusturursaniz ya default kullanicaksiniz ya da static
    // keyword kullanacaksiniz
    // default keyword kullanarak inteerface'lerin icinde body'si olan methotlar uretebiliriz...

    public default int add(int a, int b){
        return a+b;
    }

    // static keyword kullanarak da interface'lerin icinde body'si olan metodlar uretebilirsiniz.
    // Bu method static methodtur. staticler classlara yapistirilir.
    public static String update(String str){
        return str + "!";
    }
}
