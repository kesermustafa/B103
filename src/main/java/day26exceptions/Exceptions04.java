package day26exceptions;

import java.util.Scanner;

public class Exceptions04 {

    // Yasi ekrana yazdiran bir method olusturunuz....

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("yasinizi giriniz...");
        int yas = input.nextInt();

        try {
            yas(yas);
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void yas(int yas){
        if(yas<0){
            throw new IllegalArgumentException("Yas negatif olamaz");
        }
        System.out.println(yas);
     }


}
