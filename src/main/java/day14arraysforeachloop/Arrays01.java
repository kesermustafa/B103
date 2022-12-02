package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {

        //Arrays lerin icine sadece primitive data type lari ve reference lar konulabilir...

        String str[] = new String[3];

        str[0] = "Java";
        str[1] = "did";
        str[2] = "surprise you";

        System.out.println(Arrays.toString(str)); //  [Java, did, surprise you]

        // Example 1: String bir array olusturunz ve "Tom" ve onceki tum elemanlari ekrana yazdiriniz..

        String arr[] = {"Jane", "Mark", "Cristopher", "Tom", "Ali", "Rojda"};

        for(String w : arr){

            System.out.print(w + " "); // Jane Mark Cristopher Tom
            if(w.equals("Tom")){
                break;
            }
        }
        System.out.println();
        // Example 1: String bir array olusturunz ve "Tom" ve jane haric yazdirin

        String barr[] = {"Jane", "Mark", "Cristopher", "Tom", "Ali", "Rojda"};
        for(String w : barr){

            if(w.equals("Tom") || w.equals("Jane")){
                continue;
            }
            System.out.print(w + " ");
        }
        System.out.println();

        // Example 3 ; Kullanici ile beraber bir array ousturunuz... ve icine data ekleyiniz...
        // Bir ogretmenin sinifdaki ogrencierin isimlerini application a yukleyen kodu yaziniz..

        Scanner input = new Scanner(System.in);
        System.out.println("Kac ogrenci ismi gireceksiniz..");
        int arry = input.nextInt();

        String names[] = new String[arry];
        System.out.println("Girisi sonlandirmak icin Q ya basin. Devam etmek icin herhangi bir tusa bas");

        for(int i = 1; i<=arry ; i++){
            System.out.println("Lutfen " + i + ". ogrenci ismini giriniz.");

            String stName = input.next();
            if(stName.equalsIgnoreCase("Q")){
                break;
            }
            names[i-1] = stName;

        }

        System.out.println(Arrays.toString(names));




    }
}
