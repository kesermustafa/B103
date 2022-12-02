package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {

        // Kullanicidan bir dikdordenin en ve boyunu alip alan ve cevresini hesaplayan kodu yazin


        Scanner input = new Scanner(System.in);
        System.out.println("Dikdortgenin kisa kenarini giriniz...");
        int kisaKenar = input.nextInt();

        System.out.println("Dikdortgenin uzun kenarini giriniz...");
        int uzunKenar = input.nextInt();

        System.out.println("Dikdortgen Alani " + kisaKenar*uzunKenar );
        System.out.println("Dikdortgen Cevresi " + 2*(kisaKenar+uzunKenar));





    }
}
