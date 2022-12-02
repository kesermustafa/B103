package day26exceptions;

public class Exceptions03 {

    public static void main(String[] args) {


        double d = divideStringByTheNumOfTheChar(null);
        System.out.println(d);

        divideStringByTheNumOfTheChar(null);



        divideStringByTheNumOfTheCharacters("");

    }
    // Stringdeki karakter sayisini bulunnz stringi integer a ceiriniz. Integer i karakter sayisina bolunuz..

    // 1.YOL
    public static double divideStringByTheNumOfTheChar(String str) {

        int length = 0;
        int i = 0;
        double sonuc = 0;

        try {
            length = str.length(); //NullPointerException : null string ile "length" kullanildigind alir.

            i = Integer.valueOf(str); // NumberFormatException : Icinde rakamdan farkli charakter olan
                                         // Stringler valueOf() ile kullanildiginda
            sonuc = i / length;   // ArithmeticException : Bolen sayi sifir oldugunda alinir...
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        return sonuc;
    }

    // 2.YOL
    public static double divideStringByTheNumOfTheCharacter(String str) {

        int length = 0;
        int i = 0;
        double sonuc = 0;

        try {
            length = str.length(); //NullPointerException : null string ile "length" kullanildigind alir.

            i = Integer.valueOf(str); // NumberFormatException : Icinde rakamdan farkli charakter olan
                                         // Stringler valueOf() ile kullanildiginda
            sonuc = i / length;   // ArithmeticException : Bolen sayi sifir oldugunda alinir...
        } catch (Exception e) {
            System.out.println("===>" + e.getMessage());
        }
        return sonuc;

    }

    // 3.YOL
    public static double divideStringByTheNumOfTheCharacters(String str) {

        int length = 0;
        int i = 0;
        double sonuc = 0;

        try {
            length = str.length(); //NullPointerException : null string ile "length" kullanildigind alir.

            i = Integer.valueOf(str); // NumberFormatException : Icinde rakamdan farkli charakter olan
            // Stringler valueOf() ile kullanildiginda
            sonuc = i / length;   // ArithmeticException : Bolen sayi sifir oldugunda alinir...
        } catch (NullPointerException e){
            System.out.println("NullPointer'a ozzel ");
        } catch(Exception e) {
            System.out.println("Diger tum exception'lar  " + e.getMessage());
        }
        return sonuc;

    }
        /*
        Note : 1) Aralarinda parent child relationship olan Exception Class'lari multiple catch'lerde kullanmak
            isterseniz. "child" olan once kullanilmalidir, aksi halde hata verir.

            2) Aralarında "parent-child" relationship olmayan Exception Class'ları multiple catch'lerde kullanmak isterseniz
             sıralamanın bir önemi yoktur.
         */





}






