package day02methodcreation;

public class MethodCreation {

    //main method icinde kullanacaginiz hersey static olmalidir.

    public static void main(String[] args) {

        System.out.println(toplamaYap(1.2, 5));
        System.out.println(ucSayiyiCarp(2, 1.5, 6));
        System.out.println(ilkIkiSayiileToplaUcuncuIleCarp(2, 8, 3.2));

        //sout yazip "Enter" a basiniz System.out.println() otomatik olarak yazilir.
        //Ekrana bir sey yazdirmak icin iki tane kod var
        // i)System.out.println() ==> Satirbasi yapar
        // ii)System.out.print() ==> Satirbasi yapmaz

    }
    //Example 1 : Toplama islemi yapan bir method olusturunuz.
    public static double toplamaYap (double a, double b){
        return a+b;
    }

    // Example 1 : 3 sayiyi bir biri ile carpan method olusturunuz.
    public static double ucSayiyiCarp (double a, double b, double c){
        return a*b*c;
    }

    // Example 3 : 3 sayiyi dan ilk ikisini ypolayop 3. ile carpan method olusturunuz.
    public static double ilkIkiSayiileToplaUcuncuIleCarp (double a, double b, double c){
        return (a+b)*c;

    }

}
