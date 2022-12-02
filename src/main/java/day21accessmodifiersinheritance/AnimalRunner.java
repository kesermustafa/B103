package day21accessmodifiersinheritance;

public class AnimalRunner {
    public static void main(String[] args) {

        /*
            A- Inheritance sayesinde
                    1-kod tekrarindan kurtluruz..
                    2- Kod tamiri (maintenance) kolay olur..
                    3- Child Class lari daha atomik apmis oluruz...
            B- Bir Class i baska bir Class'in Child class'i yapmak icin
                "extends" keyword kullanilir. Ilk yazilanclass child, ikinci yazilan class parent(baba) olur..

            C- Child Class object'leri Parant Class'dan method ve variable'lari kullanabilir.

            D- Parent class object'leri child Class'dan method ve variable'lari kullanamazlar..

            E- Object class her class in parent'i dir.
                Java da Object clasin haric her class in parent'i vardir.
                Java da parent'i olmayan tek class Object class dir.
            F- "private" method veya variable lar child class'lar  tarafindan kullanilmaz.
            G- "protected" method veya variable lar child class'lar  tarafindan kullanilabilir.
                "default" method veya variable lar ayni package'de child class'lar  tarafindan kullanilabilir.
                "public" method veya variable lar child class'lar  tarafindan kullanilabilir.

                Note : child class'lar  tarafindan kullanilabilir olmak demek "inherit" edilenbilir demektir..

             H- 4 tip inheritance vardir..
                1- Multilevel Inheritance (Coklu)
                2- Hierachical Inheritance (hiyerasik) -  Bir parent icin coklu child...

                3 - Multiple Inheritance ==> bir child class'a coklu parent demek Java tarafindan desteklnmez..
                    bir child'in iki tane paret'i olamaz der. ( Java daes not support Multiple Inheritance)
                4- Single Inheritance : Bir child icin bir Parent Class demektir. Java bunu destekler...


         */


        Cat c1 = new Cat();
        c1.eat();
        c1.drink();
        c1.meow();

        System.out.println("**********");
        Dog d1 = new Dog();
        d1.eat();
        d1.drink();
        d1.bark();

        System.out.println("**********");
        Bird b1 = new Bird();
        b1.tewet();
        b1.drink();
        b1.eat();
















    }



}
