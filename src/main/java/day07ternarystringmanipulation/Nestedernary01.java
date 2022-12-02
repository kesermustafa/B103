package day07ternarystringmanipulation;

public class Nestedernary01 {
    public static void main(String[] args) {

        /*
        Verien yilin "Leap Year" olup olmadigini kontrol eden kodu yaziniz...
        i) yil 100'e bolunurse 400'e bolunmelidir. ==>1600+   ==>1800-
        ii) yil 100'e bolunmezse 4 e bolunmelidir. ==>1196+   ==>2001-
         */

        int year = 2001;

        String leap = year%100==0 ? (year%400==0 ? "Leap year" : "Leap year degil") : (year%4==0 ? "Leap year" : "Leap year degil");

        System.out.println(leap);

        /*
        Asagidki kurallara gore pasword un gecerli olup olmadigini kontrol eden kodu yazin
        1 - 8 karakterden fazla karakter varsa ilk harfi kucuk i olmali
        2 - 8 karakterden az karakter varsa ilk harfi k olmalidir..
         */

        String pwd = "i2a3ed54";
        char ilkHarf = pwd.charAt(0);

        String gecerli = pwd.length()<8 ? (ilkHarf == 'K' ? "Gecerli" : "Gecersiz" ) : (ilkHarf == 'i' ? "Gecerli" : "Gecersiz"  );
        System.out.println("Pasword gecerli mi = " + gecerli);


    }
}
