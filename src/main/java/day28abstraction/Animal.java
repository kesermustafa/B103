package day28abstraction;

public abstract class Animal {

    //Body si olmayan methodlar abstract method olarak adlandirilir...
    // Bir methodu abstract yapmak icin 1-method bodyi sil 2- abstract kullan
    // abstract methodlar abstract class icinde olmalidir..
    // "abstract" ==> soyut         concrete ==> somut
    // abstract classlarda hem abstract method hem concrete(non-abstract) kullanilabilir..

    public abstract void eat();


    // abstract classlarda hem abstract method hem concrete(non-abstract) kullanilabilir..
    public void drink(){
        System.out.println("Animals drink...");
    }


    // abstract "move" methot olusturunuz.

    public abstract void move();


}
