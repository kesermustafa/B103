package day22inheritancepolymorphism;

public class Runner {
    public static void main(String[] args) {

        // Inheritance da variable lar secilirken Java objenin data tipine bakar..
        // Oncelikle istediginiz variable'i Objenin data type'i olan Class'da arar.
        // o class da bulamazsa parrent classa bakar.
        // hic bir parrent class da bulamazsa hata verir..
        //


        Cat cat1 = new Cat();
        System.out.println(cat1.a); // 14
        System.out.println(cat1.b); // 34
        System.out.println(cat1.c);  //45


        Mammal cat2 = new Cat();
        System.out.println(cat2.a); // 13


        Animal cat3 = new Cat();
        System.out.println(cat3.a); // 12

        // Object olusturuken objenin data child class dan secilemez...
        //Inheritance da method'lar secilirken Java Constructar bakar.
        // Oncelikle istedigi methodu Constructar'i kullanilan class dan alir..
        //Hic bir yerde o methodu bulamazsa hata verir.


        Cat cat4 = new Cat();
        cat4.eat();
        cat4.drink();

        Mammal cat5 = new Mammal();
        cat5.eat();


        Animal cat6 = new Animal();
        cat6.eat();









    }
}
