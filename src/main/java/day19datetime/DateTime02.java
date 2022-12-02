package day19datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {
        //Example 1 == Javadan aldiginiz Date'i ay / gun / yil olarak yaziniz..

        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("MM/dd/yyyy"); // MM 10 dan kucuk aylari 01 02 03 yazar
        String formatedDate1 = dtf1.format(currentDate);
        System.out.println(formatedDate1);                  // 10/21/2022

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMM/dd/yyyy");
        String formatedDate2 = dtf2.format(currentDate);
        System.out.println(formatedDate2);                  // Oct/21/2022

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("MMMM/dd/yyyy");
        String formatedDate3 = dtf3.format(currentDate);
        System.out.println(formatedDate3);                  // October/21/2022

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("M/dd/yyyy");  // M  10 kucuk aylarri 1 2 3 yazar
        String formatedDate4 = dtf4.format(currentDate);
        System.out.println(formatedDate4);

        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("MM/dd/yy");  // 10/21/22
        String formatedDate5 = dtf5.format(currentDate);
        System.out.println(formatedDate5);

        DateTimeFormatter dtf6 = DateTimeFormatter.ofPattern("MM/d/yy");  // d  ==> 10 kucukleri 1 2 3 yazar
        String formatedDate6 = dtf6.format(currentDate);
        System.out.println(formatedDate6);

        //Example 2 : Javadan aldiginiz Time i formtini degistiriniz...

        LocalTime myTime = LocalTime.of(03,23,54,2345 );
        System.out.println(myTime);  // 16:23:54.000002345

        DateTimeFormatter dtf7 = DateTimeFormatter.ofPattern("HH:mm");  // HH 24 saat sistemini, hh 12 saat sistemi kullanir
        String formatedMyTime = dtf7.format(myTime);
        System.out.println(formatedMyTime); // 04:23

        DateTimeFormatter dtf8 = DateTimeFormatter.ofPattern("hh:mm a");
        String formatedMyTime2 = dtf8.format(myTime);
        System.out.println(formatedMyTime2);

    }
}
