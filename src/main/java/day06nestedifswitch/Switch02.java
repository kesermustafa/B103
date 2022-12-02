package day06nestedifswitch;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {

        /*
        Kullaniciya ay ismi sorunuz ve kullanicini verdigi ay isminden son aya kadar ekrana yazdiriniz....
         */

        //Note: toLowerCase method'u bir string deki tum karakterleri kucuk harfe cevirir.
        //      toUpperCase method'u bir string deki tum karakterleri Buyuk harfe cevirir.
        //  switch () icinne hangi data type varsa case () icindede ayni data tye olmalidir...

        Scanner input = new Scanner(System.in);
        System.out.println("Gun nuamarasini giriniz...");
        String ayIsmi = input.next().toLowerCase();


        switch (ayIsmi){
            case "ocak":
                System.out.println("Ocak");
            case "subat":
                System.out.println("Subat");
            case "mart":
                System.out.println("Mart");
            case "nisan":
                System.out.println("Nisan");
            case "mayis":
                System.out.println("Mayis");
            case "haziran":
                System.out.println("Haziran");
            case "temmuz":
                System.out.println("Temmuz");
            case "agustos":
                System.out.println("Agustos");
            case "eylul":
                System.out.println("Eylul");
            case "ekim":
                System.out.println("Ekim");
            case "kasim":
                System.out.println("Kasim");
            case "aralik":
                System.out.println("Aralik");
                break;
            default:
                System.out.println("Gecerli bir ay ismi giriniz.....");

        }



    }
}
