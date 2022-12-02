package day32maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Maps01 {

    public static void main(String[] args) {


        // Size verilen bir cumledeki her kelimenin kac kere kullanildigini gosteren kodu yaziniz...
        // "I like to move it move it"


        String str = "I like to move it, move it.";

        str = str.replaceAll("\\p{Punct}", "");
        System.out.println(str);

        // Kelimeleri almak icin split() kullanalim.

        String[] kelimeler = str.split(" ");
        System.out.println(Arrays.toString(kelimeler));

        Map<String, Integer> gorunum = new HashMap<>();

        for(String w : kelimeler){

            Integer gorunumSayisi = gorunum.get(w);

            if(gorunumSayisi==null){

                gorunum.put(w, 1);

            }else{
                gorunum.put(w, gorunumSayisi+1);
            }
        }

        System.out.println(gorunum);  // {move=2, like=1, I=1, to=1, it=2}













    }
}
