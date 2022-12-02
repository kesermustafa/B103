package day25exception;

public class E03 {
    public static void main(String[] args) {


    String str = "Ali";
    getNumOfChars(str); // 3

    String s = "";
    getNumOfChars(s); // 0

    String t = null;
    getNumOfChars(t); // NullPointerException


    }
    // Bir string de bulunan karakterlerin sayisini bulabilmek icin bir method ilusturun....



    public static void getNumOfChars(String str){

        try {
            System.out.println(str.length());
        }catch (NullPointerException e){
           System.err.println("Yav hep hata, hep hata sen ne zaman ogrenecen bu isi" );
            System.out.println(e);
            e.printStackTrace();
            // bu methodu kullandiginiz zaman System.out.println demenize gerek yok kendiicine var.

        }


    }





}
