package day10stringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {

        String a = "Java kolaydir.";

        //starsWith("kola", 5) kodu ilk 5 karaktere'den sonraki Stringe bakar ve
        // Stringin "kola" ile baslayip baslamadigini  kontrol eder.
        // "kola" ile basliyorsa "true", baslamiyorsa "false" return eder.
        boolean b = a.startsWith("kola", 5);
        System.out.println(b);

        //.replaceFirst("a", "*") Stringdeki ilk "a" yi "*" e cevirii...
        // replace("a", "*"); kod String deki tum "a" lari "*" e cevirir.
        String c =a.replaceFirst("a", "*");
        System.out.println(c);  // J*va kolaydir.

        //concat() methodu iki tane Stringi birbirine yapistirmaya yarar...
        //Concatenation islemi iki turlu yapilabilir i) + ile ii) concat() ile
        //Java bir islem icin method uretmisse o method'u kullanmak "best practice"dir.
        String d = a.concat(" Anladin mi?");
        System.out.println(d);

        String e = "    Tom Hanks   ";
        System.out.println(e);

        //trim() methodu bir Stringin bas ve sonundaki space karakterlerini siler
        //       aradaki space karakterlerini dokunmaz....
        String f = e.trim();
        System.out.println(f);

        //h.compareTo(i) kodu iki tane stringi alfabetik olarak (lexicographic) karsilastirir..
        // Buyuk harfe duyarlidir.
        //Buyuk harfe kucuk harfe duyarli olmasini istemezseniz h.h.compareToIgnoreCase(i) kaullanilabilirsiniz.
        //h.compareTo(i); kodda "h" nin alphabetik sirasindan "i" nin alfabetik sirasi cikarilir.

        String h = "Java";
        String i = "Java";
        int k = h.compareTo(i);
        System.out.println(k);

        //a.repeat(3); kodu a stringini yan yana 5 kere yapistirir...
        //a.repeat(0); empty string return eder.
        String n = a.repeat(3);
        System.out.println(n);

    }
}
