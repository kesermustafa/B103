package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        //Example 1 : size verilen pozitif ve negatif sayilar iceren bir integer arraydeki
        // en buyuk negatif ve en kucuk pozitif elemanlari bulun

        int arr[] = {-12, 18, -5, 23, -2, 0};

        Arrays.sort(arr);  // [-12, -5, -2, 0, 18, 23]

        System.out.println(Arrays.toString(arr));

        int mxNegative = arr[0];
        int miPozitive = arr[arr.length-1];

        for(int w : arr){

            if(w<0){
                mxNegative = Math.max(mxNegative, w);
            }
            if(w>0){
                miPozitive = Math.min(miPozitive, w);
            }

        }

        System.out.println("mxNegative = " + mxNegative);
        System.out.println("miPozitive = " + miPozitive);



    }
}
