package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class DateTime01 {
    public static void main(String[] args) {

        //Example 1: "Anlik tarihi" ekrana yazdiran kodu yaziniz..

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);   // 2022-10-21

        //Example 1: "Anlik zamani" ekrana yazdiran kodu yaziniz..
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);  // 20:41:15.861687400

        //"Anlik tarihi" ve "Anlik zamani" ekrana yazdiran kodu yaziniz..

        LocalDateTime curretDateTime = LocalDateTime.now();
        System.out.println(curretDateTime); // 2022-10-21T20:44:57.648157500

        //Example : Japomyada ki anli tarih ve zamani ekrana yazdirin..

        LocalDateTime japonyaCurrentDateTime = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(japonyaCurrentDateTime); // 2022-10-22T02:50:41.919052

        LocalDateTime istanbulCurrentDateTime = LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(istanbulCurrentDateTime);  // 2022-10-21T20:52:47.018361200

        //Example 6 : Bu gunden 789 gun sonra emekli olacaginiza gore emeklilik tarihini hesaplayan kodu yazin

        LocalDate countDate = LocalDate.of(2022, 10, 21);
        LocalDate retireDate = countDate.plusDays(789);
        System.out.println(retireDate);  // 2024-12-18

        //Iki cocugunuzun dogom tarihleri arasindaki farki gun olarak hesaplayan kodu yaziniz...

        LocalDate busra = LocalDate.of(1994, 12, 3);
        LocalDate beyza = LocalDate.of(1999, 10, 7);

        //between methodu kullanildiginda daha eski olan tarih once yazilmalidir..
        Long fark = ChronoUnit.DAYS.between(busra, beyza);
        System.out.println(fark);

//        //Example 8 : Tom, Aliden 3 yil 8 ay 1 gun sonra dogdu
//        //              Ali ise Veliden 1 yil 15 gun once dogdu
//        ///         Tom un dogum tarihi 18 Kasim 2011 ise Veli ve Ali nin dogum tarihlerini bulunuz..
//
//        LocalDate tom = LocalDate.of(2011, 11, 18);
//
//        LocalDate ali = tom.plusYears(3).plusMonths(8).minusDays(13);


        // Example 8 : Istanbul'un fethi ile Cumhuriyetin kurulmasi arasinda kac ay olduunu gosteren kodu yazin
        // 29 Mayıs 1453 ==> İstanbul'un fethi           29 Ekim 1923 ==> Cumhuriyetin kuruluşu

        LocalDate istanbulFeth = LocalDate.of(1453, 5, 29);
        LocalDate cumhuriyetKurulus = LocalDate.of(1923, 10, 29);

        Long ayFarki = ChronoUnit.MONTHS.between(istanbulFeth, cumhuriyetKurulus);
        System.out.println(ayFarki);

        //Example 9 verilen tarihin hangi burcda oldugunu gosteren kodu yazin...
        LocalDate myDate = LocalDate.of(1989, 5, 22);

        int day = myDate.getDayOfMonth();
        int month = myDate.getMonthValue();

        if ((day >= 21 && month == 3) || (month == 4 && day<= 20)) {
            System.out.println("Koc burcu");
        } else if ((day >= 21 && month == 4) || (month == 5 && day<= 20)) {
            System.out.println("Boga burcu");
        } else if ((day >= 21 && month == 5) || (month == 6 && day<= 20)){
            System.out.println("Ikizler");
        }










    }
}
