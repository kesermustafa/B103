package day06nestedifswitch;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {

        //Kullanicidan yas degerini alan kodu yaziniz ve
        // yasin hangi evrede oldugunu asagidaki tabloya gore ekrana yazdiriniz..
        //0 - 4 => bebek
        //5 - 12 => ccocuk
        //13 - 20 => genc
        //21 - 30 => yetiskin
        //else (tanimlanmamis evre)


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen yasinizi girirniz.....");
        byte yas = input.nextByte();

        if(yas<0){
            System.out.println("Gecerli yas girirniz....");
        }else if(yas<5){
            System.out.println("Bebek");
        }else if(yas<13){
            System.out.println("Cocuk");
        }else if (yas<21) {
            System.out.println("Genc");
        }else if(yas<31){
            System.out.println("Yetiskin");
        }else{
            System.out.println("Tanimlanmamis evre");
        }


    }
}
