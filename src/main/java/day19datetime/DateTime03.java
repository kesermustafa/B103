package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime03 {
    public static void main(String[] args) {


        // Japonya ile Almanya arasindaki zaman farkini hesaplayan kodu yaziniz...

        LocalDateTime japonyaCurrentDateTime = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(japonyaCurrentDateTime); // 2022-10-22T02:50:41.919052

        LocalDateTime berlinCurrentDateTime = LocalDateTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(berlinCurrentDateTime);  // 2022-10-21T21:50:35.423343900

        long fark = ChronoUnit.HOURS.between( berlinCurrentDateTime, japonyaCurrentDateTime);

        System.out.println(fark);

        //Example 2: Sabit bir tarih olsturunuz...

        LocalDate myDate = LocalDate.of(2011, Month.APRIL, 13);
        System.out.println(myDate);  // 2011-04-13

        /*
           1- jAVADA SABIT DATALARI mesala gun isimleri, ay isimleri, ABD Eyalet isimleri gibi
              gerektigindee kullanmak icin depo olusturulur bu depolara "enum" denir..

         */

        // EXAMPLE 3 usa icin "Woow"  UK icin "Big" CANADA icin Cold, TURKEY icin "Vatan"
        // GERMANY icin "Araba", RUANDA icin "Cay"

        Countries coutry = Countries.CANADA;

        switch (coutry){

            case USA:
                System.out.println("Woow");
                break;

            case UK:
                System.out.println("Big");
                break;

            case CANADA:
                System.out.println("COLD");
                break;
            case TURKEY:
                System.out.println("Vatan");
                break;

            case GERMANY:
                System.out.println("Araba");
                break;

            case FRANCE:
                System.out.println("Aaaaaa");
                break;

        }


    }
}
