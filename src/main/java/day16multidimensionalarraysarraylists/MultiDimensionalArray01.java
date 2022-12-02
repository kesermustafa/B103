package day16multidimensionalarraysarraylists;

import java.util.Arrays;

public class MultiDimensionalArray01 {
    public static void main(String[] args) {

        /*
        Birtane int multi Dimensional Array olusturunuz bu array deki tum sayilarin toplamini veren kodu yaziniz.
         */

        /*
        Array veya Collection varsa "for-each-loop" kullanmak ilk tercihiniz olsun
        Array veya Collection var ama "index" kullanmak zorundasiniz o zaman "for-each-loop"
        calismaz, "for-loop" veya "while-loop" veya "do-while-loop" kullanmalisiniz
         */

        int arr[][] = {{2, 5, 1},{32, 75 },{13, 21, 43, 56}};

        int sum = 0;

        for(int[] w : arr){
            for(int k: w){
                sum = sum + k;
            }
        }
        System.out.println(sum);

        //*****  SORUU ********

        // Bir multi dimensinal arrayi normal array e ceviren kodu yaziniz...
        // {{2,5,1}, {32,75}}  ==> {2, 5, 1, 32, 75}

        /*
        1) Multidimensional Array deki eleman sayisini bulmaliyiz
        2) Cunku yeni bir array olusturmaliyiz ve bu yeni array in uzunlugu
           orijinal array in eleman sayisina esit olmalidir
         */

        int toplam = 0;

        int brr[][] = {{2, 5, 1},{32, 75 }};
        for(int[] w : brr){
          toplam = toplam + w.length;
        }
        System.out.println("toplam = " + toplam);

        int idx = 0;
        int crr[] = new int[toplam];  // Yeni array olusturduk...

        for(int[] w : brr){

            for(int k : w){
                crr[idx]=k;
                idx ++;
            }
        }
        System.out.println(Arrays.toString(crr));

    }
}
