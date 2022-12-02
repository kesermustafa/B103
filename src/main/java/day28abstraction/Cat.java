package day28abstraction;

public class Cat extends Mammal{

    /*
    Bir method parent class da "abstract" method ise child class o methodu override edip
    kullanmak zorundadir.
    Bu yuzden herhangi bir fonksiyonu child class icin mecburi yapmak isterseniz o methodu
    abstract yapmalisiniz...
     */


    @Override
    public void eat() {
        System.out.println("Cat eat");
    }

    @Override
    public void move() {
        System.out.println("Cat moev");
    }




}
