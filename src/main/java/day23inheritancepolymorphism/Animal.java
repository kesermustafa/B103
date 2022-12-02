package day23inheritancepolymorphism;

public class Animal  {

    public void eat(){
        System.out.println("Animal eat");
    }

    public int add(int a, int b){
        return a+b;
    }

    public Integer multiply(int a, int b){
        return a*b;
    }
    // Buradaki method "Overrriden Method"
    public Animal create(){
        return new Animal();
    }
   // Final methodlar override edilemezler
    public final double divide(int a, int b){
        return a/b;
    }

}
