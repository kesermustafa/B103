package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {

        //Example1 : Bir Stringdeki sesli harfleri sayisini bulan kodu yaziniz....
        // a e i o u   -  A E I O U

        String str = "Java ogrenince para kazanmak kolay, ogrenmeyice ne kolay ki";
        str.toLowerCase();

        String harfler[] = str.split("");

        int counter = 0;

        System.out.println(Arrays.toString(harfler));

        for(String w : harfler){
            switch (w){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    counter++;
                    break;
            }
        }
        System.out.println("counter = " + counter);






    }
}
