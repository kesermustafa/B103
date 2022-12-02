package day23inheritancepolymorphism;

public class Math extends Courses {

    public void practice(){
        System.out.println("Solve questions");
    }

    public Math(){
        super("farketmez"); // parent class daki parametresi String olan costructor i kullanir.
        System.out.println("Constructor 1");
    }

    public Math(int a){
       this();
       System.out.println("Constructor 2");
    }





}
