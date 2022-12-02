package day29abstractioncollections;

    /*
        "abstract method"lar sadece ne yapilacagini soyler (what to do)
        "concrete method"lar ne yapilacagi ile birlikne nasil yapilacagini da soyler ( How to do)

        "interfqce" ler bir yapilacaklar isler liostesidir.

        "multiple parent interface" kullandiginizda ayni method ismi ile birden fazla method olusturusaniz,
        bu methodlarin return type lari ayni olmalidir aksi takdirde hata verir

        interface lerde constructor olmadigi icin interfaclerden obje olusturulamaz..

        abstract classlarda class olduklari icin constructor vardir. Ama constructor lar abstract classlarda
        obje olusturamazlar.

        Note: interface ve abstract calsslardan obje olusturulamaz,,,

    SORU    : Abstract class ile interface in farklari nelerdir..

            methodlar --> variable --> parent/child  siralamasi ile konusunnnn....

       1)Method
            "Abstract Class" hem abstract hem de concrete method'lar içerebillir.
            "Interface" ler ise sadece abstract method'lar içerir.
            Ama istersek interface'ler içinde de "default" ver "static" keyword'ler kullanarak concrete method'lar oluşturabiliriz.

       2)Variable
            "Abstract Class" larda normal Class'lardaki gibi her türlü variable oluşturulabilir.
            "Interface" ler de ise variable'lar public static ve final olmak zorundadır.

       3)Inheritance
            "Abstract Class" lar class oldukları için "multiple inheritance" a müsaade etmezler.
            "Interface" ler ise "multiple inheritance" ı desteklerler.

       4)Object Creation
             "Abstract Class" larda constructor vardır ama object oluşturmada kullanılmazlar.
             "Interface" ler de ise constructor olmadığından object oluşturulamaz.

        Soru: Object-Oriented Programming Language prensipleri(principles) nelerdir?
       i)Inheritance   ii)Polymorphism   iii)Encapsulation   iv)Abstraction
     */


public class Civic implements Engine, Ac {

    @Override
    public void run() {
        System.out.println("Civic runs well");
    }




}
