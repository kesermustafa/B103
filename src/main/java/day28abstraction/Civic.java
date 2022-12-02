package day28abstraction;

public class Civic implements Engine, Ac, Hood{

    // bir class i bir interface in choldi yapmak icin "implements" kullaniriz.

    /*
   1- Atomic olsun diye "parent"i parcaladim ama bir "Child Class" in birden fazla "parent" i oldu,
   bu ise Java'da mumkun degildir. Cunku Java "multiple Inheritance" i desteklemez.

   "multiple inheritance" class'larda mumkun degildir fakat Java "interface" isimli yeni bir yapi olusturdu
    bu yapida "multiple inheritance" a musaade etti.

    2-2) interface deki tum method'lar "absract" oldugu icin "interface'lere "fully abstraction" denir.
"Abstract Class" larda abstract method ve "concrete method" bir arada kullanildigi icin
"Abstract Class"  lara "fully absraction" denmez.
    */


    @Override
    public void eco() {
        System.out.println("Uses eco engine");
    }

    @Override
    public void gas() {
        System.out.println("Uses gas");
    }

    @Override
    public void tsi() {
        System.out.println("Uses tsi technology");
    }


    @Override
    public void digital() {
        System.out.println("Uses digital");
    }

    @Override
    public void climate() {
        System.out.println("Uses automatic");
    }

    @Override
    public void steel() {
        System.out.println("Uses climante technology");
    }
}
