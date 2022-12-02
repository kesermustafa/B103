package day16multidimensionalarraysarraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLists01 {
      /*
        ArrayList'ler ayni data tipine sahip birden fazla datayi depolamak icin kullanilir..
        Array ile ArrayList'in farki nedir... ?
        1- Array olusturuken array'in icine kac tane eleman koymamiz gerktigini soylemeliyiz,
            soyledigimiz eleman sayisindan fazla eleman koyamayiz...
            Arraylar eleman sayisinda "fixed" dirler...

            ArrayList'leri olustururken eleman sayisi soylemeye gerek yok cunku array listler
            eleman sayisinda "flexible"(esnek) dirler..
        2- Arraylerin icine primitive ve reference lar konulur,
            ArrayList'lerin icine sadece non-primitiveler konulur.

            Listler primitive data type lari kabul etmez.
            Primitiv data type lar yerine wrapper class lari kullaniriz.
        3- Arrayler super fast, cok hizlidir.. Array ler memory i cok az kullanir.

        Note ; eleman sayisi kesin belli olan coklu datalari depolamak icin Array kullaniriz..
                ama eleman sayisi degisken olan ciklu datalar icin Array kullama riskini almayin.
       */

    public static void main(String[] args) {

        //ArrayList nasil olusturulur...

        // 1. YOL ****
        ArrayList<Integer> age = new ArrayList<Integer>();

        // 2.YOLL ****
        ArrayList<Integer> heights = new ArrayList<>();

        // 3. YOL  ****
        List<Integer> nums = new ArrayList<>();

        //ArrayList ler nasil yazdirilir...

        System.out.println(nums); // []

        //ArrayList lere nasil eleman eklenir...
        //add() methodu herzaman elemani en sona ekler... (insertion order)

        nums.add(21);
        System.out.println(nums); // [21]

        nums.add(18);
        nums.add(20);
        System.out.println(nums);  // [21, 18, 20]

        nums.add(1, 50);
        System.out.println(nums);  // [21, 50, 18, 20]

        List<Integer> prices = new ArrayList<>();
        prices.add(23);
        prices.add(185);
        System.out.println(prices); // [23, 185]

        // nums listArray'ine prices Arrayinin tamamini ekleme yaptik
        nums.addAll(prices);
        System.out.println(nums); // [21, 50, 18, 20, 23, 185]

        // nums listArray'inin 2.index'ine prices Arrayinin tamamini ekleme yaptik
        nums.addAll(2, prices);
        System.out.println(nums);  // [21, 50, 23, 185, 18, 20, 23, 185]


        //ArrayListlerin eleman sayisi nasil bulunur...

        int elemanSayisi = nums.size();
        System.out.println(elemanSayisi);  // 8

        //ArrayListlerde herhangi bir eleman nasil secilir...
        //get() istenen bir index deki elemani verir...
        int el1 = nums.get(3);
        System.out.println(el1);  // 185

        //ArrayList bos olup olmadigini nasil kontrol ederiz...
        boolean bosMu = nums.isEmpty();
        System.out.println(bosMu);  // false

        boolean bos2 =  age.isEmpty();
        System.out.println(bos2);  // true


        //ArrayListte bir eleman nasil degistirilir...
        nums.set(3, 200);   // index 3 deki elemani 200 ile degistir...
        System.out.println(nums);  // [21, 50, 23, 200, 18, 20, 23, 185]

        //Example 1 : nums ArryList indeki tum tek sayilari 11 artirdiktan sonra ekrana yazdirin.

                   //[21, 50, 23, 200, 18, 20, 23, 185]
        for(Integer w : nums){
            if(w%2!=0){
                nums.set(nums.indexOf(w), w+11);
            }
        }
        System.out.println(nums);   //[32, 50, 34, 200, 18, 20, 34, 196]

        // Eleman SILME

        //remove() methodunun icine tam sayi koyarsaniz Java onu index olarak kabul eder..
        //Example 2 : ArrayList'den 34 elemaninin ilk gorunumunu siliniz...

        // Note : Tum tam sayilar Java icin aksi soylenmedikce primitive dir..yani "int" dir.
        // Note 2: Primitive ler ArrayListlerin elemani olamazlar.
        //Note 3: Primitive 'i  wrapper class a cevirirseniz non-primitivler array listlerin
            //elemani olur index olamazlar....

        Integer sayi = 34;
        nums.remove(sayi);
        System.out.println(nums);  // [32, 50, 200, 18, 20, 34, 196]


    }
}
