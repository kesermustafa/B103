package day28abstraction;

public class Civic implements Engine, Ac, Hood{

    /*
    Bir method parent class da "abstract" method ise child class o methodu override edip
    kullanmak zorundadir.
    Bu yuzden herhangi bir fonksiyonu child class icin mecburi yapmak isterseniz o methodu
    abstract yapmalisiniz...
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
