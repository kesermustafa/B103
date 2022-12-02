package day23inheritancepolymorphism;

public class Cat extends Mammal {

    public void moew(){
        System.out.println("Cats meow");
    }

    @Override    // sifirdan olusturulmus degil parint class dan alinmis demek
    public void eat() {
        System.out.println("Cat eat");
    }

    @Override
    public int add(int a, int b) {
        return a+b+1;
    }

    @Override
    public Integer multiply(int a, int b) {
        return a*b+1;
    }


    // Buradaki method "Overrriding Method"
    @Override
    public Animal create() {
        return new Mammal();
    }


/*
    // @Override annotation'ini kullanarak Javanin yaptigmiz verride islemini kotrol etmesini saglariz.
    1- Override yaparkan method un body si degistirilir..
    2- Override yaparken asla method signature (isim ve parametre) degistirilmez..
    3- Override yaparken inheritance olmak zorundadir.
    4- Override yaparken Access modifier lar belli kurallara gore farklilastirilabilirler..
         a- Privete methodlar override edilemezler
         b- child class icindeki override edilen method'un access modifier'i parrent class daki method un
            access modifire ile ayni veya daha genis olmalidir.
            Note : child class daki method un access modifier i daha dar olamaz.
         c- Default methodlar ayni package icine ise over ride edilebilirler, farkli package den ovirride edilemezler
    5- Parrent class daki methodun return type void ise return type degistirilemez..
    6- Parint class daki method un return type primitive  ise return type degistirilemez..
    7- Parent Class'daki methodun return type'i Wrapper Class ise return type degistirilemez.
    8- Parent Class'daki methodun return type'i parent Class ise return type childlardan biri olabilir.
       * Note : child class daki return type parent class'dakinden genis olamaz.

       ** Note : Aralarinda parent child iliskisi olmsyan class lar overriding de return type degisiminde kullanilamazlar.
                Mesala short Integer dan kucukdur fakat aralarinda parent child iliskisi olmadigindan
                Integer yerine short kullanamazsiniz..
        Note : Child daki methodun return type'ndan parint daki methodun return type'ina gidiste IS-A Relationship olmali
                Parint daki methodun return type'ndan child daki methodun return type'ina gidiste HAS-A Relationship olmali
        Note : Aralarind IS-A    Relationship olan data type lara "Cavariant" denir.
     9- Child<Prent ==>IS-A (Her kedi hayvandır ama her hayvan kedi değildir.
        HAS-A ==> Hayvanlar kedileri içerir ama kediler tüm hayvanları içermez.
    10- Final methodlar override edilemezler cunku overriding de method body degistirilir fakat final method body
        degistirilmesine musade etmez...
    11- Polymorphism = Overloading + Overriding
        Note : Polymorphism nedir ? derlerse Overloading ile Overriding'i anlatin.

    12- Overloading ile Overriding arasindaki farklar nedir...
        1- Overloading icin "inheritance" gerekmez fakat Overriding icin gerekir..
        2- Private methodlar Overloading edilebilir.. Overriding edilemezler...
        3- Final methodlar Overloading edilebilir.. Overriding edilemezler...
        4- Overloading static Polymorphism olarak, Overriding dynamic Polymorphism olarak adlandirilir.
            Cunku "Static method" lar Overload edilebilir. Override edilemezler.
            "Method Overloading" Compile Time Polymorphism'dir, "Method Overriding" Run Time Polymorphism'dir.
        5-  Overloading de method signature degisir ama  Overriding method signature a dokunulmaz.

         */



}
