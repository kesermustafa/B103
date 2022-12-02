package day31maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01 {

    /*
        1)Map'ler key-value structure kullanir
        2)Key'ler unique'dir
        3)Value'lar tekrarli data icerebilir
        4)Map'lerde eleman degil EntrySet kullaniriz.
        5)Key'ler null tekrarsiz olarak kullanilir...
        6)Value'lar null kabul eder.
        7)HashMap'ler EntrySet'leri herhangibir siralamaya tabi tutmaz, rastgele siralar
        8)Siralama ile vakit jaybetmedigi icin HashMap'ler cok hizli calisirlar.

        //metodun sol tarafina key, sag tarafina value denir.;Map ler key value kullanilir.
    //Maplar key value srtuctor ini kullanirlar.
    //Map lerde key kismi tekrarsiz data icerir(unique)
    // value kismi unique olmak zorunda degildir.
    //key lerde null tekrarsiz olarak kullanilir...
    //value kisminda null kullanmak munknudur.
    //Null bir cok kere kullanilabilir.
    //coklu datalari depolarken ,bir tane deger depoluyorduk. Oysa burada iki deger var.(key,value)
    //  bu iki deger depolamaya entry demisler
    //mapler hakkinda konusurken eleman demeyin,map in 2 tane entry var deriz
     */


    public static void main(String[] args) {

        HashMap<String, Integer> studentAge = new HashMap<>();

        studentAge.put("Ali", 13);
        studentAge.put("Tom", 21);
        studentAge.put("Brad", 12);
        studentAge.put("Ajda", 76);
        studentAge.put("Cuneyt", 75);
        studentAge.put("Ali", 88); //Ayni key degerini tekrar vermez ovwewrite yapar..
        studentAge.put(null, 55);
        studentAge.put(null, 66); //Ayni key degerini tekrar vermez ovwewrite yapar..
        studentAge.put("Ayhan Isik", null);
        studentAge.put("Sadri alisik", null);



        System.out.println(studentAge); //{null=66, Ayhan Isik=null, Tom=21, Ajda=76, Brad=12, Cuneyt=75, Sadri alisik=null, Ali=88}

        //Map'den sadece key ler nasil alinir ...

        Set<String> keys =  studentAge.keySet();
        System.out.println(keys);   // [null, Ayhan Isik, Tom, Ajda, Brad, Cuneyt, Sadri alisik, Ali]

        //Map'den sadece values ler nasil alinir ... // En son guncellenmis degerleri verir..
        Collection<Integer> values = studentAge.values();
        System.out.println(values);  // [66, null, 21, 76, 12, 75, null, 88]

        // Belli bir key'e ait value nasil alinir...
        Integer age = studentAge.get("Cuneyt");
        System.out.println(age);

        //Excample 1 :  Tum integer yaslarin ortalamasini hesaplayan kodu yaziniz...

        Collection<Integer> ages = studentAge.values();

        int sum = 0;
        double counter =0;
        for( Integer w : ages ){

          if(w!=null){
              sum+=w;
              counter++;
          }
        }
        System.out.println("Ortalama yas : " + (sum/counter));

        //Example 2 : A ile baslamayan isimlerin icerdegi toplam karakter sayisini bulan kodu yazin;

        Set<String> key =  studentAge.keySet();
        int toplam = 0;
        for(String w : key){
            if(w!=null && !w.startsWith("A")){
               toplam+=w.length();
            }
        }
        System.out.println(toplam);

        // remove("Ajda", 76) methodu ile silmek ==> key si Ajda value'si 76 olan entrySet'i siler boolean return eder.
        boolean resault = studentAge.remove("Ajda", 76);
        System.out.println(resault);

        // remove(null); ile silersen key'i siler value'' sini return eder...
        int ss = studentAge.remove(null);
        System.out.println(ss);

       // Key varsa value'yu ver, key koksa mesaj ver
       int sonuc =  studentAge.getOrDefault("Brad", 0);
       System.out.println(sonuc); // 12   // varsa var olan vaalue degeri verir

        int sonuc1 =  studentAge.getOrDefault("Bradon", 0);
        System.out.println(sonuc1); // 0  // yoksa yazdigimiz degeri verir....

        //Key varsa value'u verir, key yoksa sizin istediğiniz değeri verir.
        Integer result2 = studentAge.getOrDefault("Brad", 0);
        System.out.println(result2);

        //Value null ise ekleme yapar, Value null değilse ekleme yapmaz.
        Integer result3 = studentAge.putIfAbsent("Brad", 100);
        System.out.println(result3);//12
        System.out.println(studentAge);

        Integer result4 = studentAge.putIfAbsent("Ayhan Işik", 100);
        System.out.println(result4);
        System.out.println(studentAge);

        //Key yoksa ekleme yapar.
        Integer result5 = studentAge.putIfAbsent("Acun Ilicali", 200);
        System.out.println(result5);
        System.out.println(studentAge);


        //replace()
        studentAge.replace("Acun Ilicali", 49);
        System.out.println(studentAge);

        // replace() key ve value yi kontrol ettikten sonra degistirdi.
        studentAge.replace("Acun Ilicali", 49, 53); //acun 'un yasi 49 ise 53 ile degistir...
        System.out.println(studentAge);

        //Excample 3: Map'deki her bir entry'i ekrana farkli bir satirda olacak sekilde yazdir.

        // EntrySet methodu Map'deki her elemani bir setin icine koyarak size verir,
        Set<Map.Entry<String,Integer>> entries = studentAge.entrySet();
        for(Map.Entry<String,Integer> w: entries){
            System.out.println(w);
        }




















    }
}
