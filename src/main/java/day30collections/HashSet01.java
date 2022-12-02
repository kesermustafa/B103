package day30collections;

import java.util.HashSet;

public class HashSet01 {

    /*
    Hash bir tekniktir,birbirine benzemeyen code lar uretir bu code lar datayi unique yapar.
    Set'lere, çoklu ama tekrarsız data depolamak istediğimizde ihtiyaç duyarız.(öğrenci numaraları gibi)

    HashSet ler eklenen elemanlarin siralamasi ile ugrasmaz..Siralama ile alakali zaman harcamaz
        bu yuzden hizli calisir...
        1- Tekrarsiz eleman gerektiginde  2- siralama onemsiz ise   3- Hiz cok onemli ise HashSet kullanilir...
        4- HashSet'ler indeks kullanmaz. Cunku siralama rastgele yapildigi icin indeks manali olmaz...
    */



    public static void main(String[] args) {

        HashSet<String> emails = new HashSet<>();

        emails.add("Apple");
        emails.add("Mango");
        emails.add("Orange");
        emails.add("Apricot");
        emails.add("Fig");

        System.out.println(emails); // [Apple, Fig, Mango, Apricot, Orange]

        //Var olan elemani eklerseniz hata vermez.., son ekleneni var olan datanin ustune yazar...(owerwrite)
        emails.add("Mango");
        System.out.println(emails);

        //ilk siraya ekler son ekleneni var olan datanin ustune yazar...(owerwrite)
        emails.add(null);
        emails.add(null);
        emails.add(null);
        System.out.println(emails);













    }
}
