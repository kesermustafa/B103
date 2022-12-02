package day27exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {
    /*
    1- FileInputStream fis = new FileInputStream("src\\main\\java\\day27exceptions\\File1.txt");
        kodunu yazinca "new" den sonraki hata verir. Cunku biz Java'ya verilen adresdeki dosyaya git dedik.
        Java iki endiseye kapildi 1. ya adres yanlissa, 2. ya verilen adresde dosya yoksa
        Biz method isminden sonra "throws FileNotFountException"yazarak, Java'ya bu iki endise duydugun durum
        olursa "Exception At"dedik.


    2-  while ((k= fis.read())!=-1){} yazdigimizda "read()"method'u hata verir. Cunku biz Javaya dosyadaki
        karakterleri oku dedik. java bir endiseye kapildi 1. Ya okumasi gereken karakterler Java'nin bilmedigi
        karakterlerse Biz method isminden sonra "throws IOException" yazarak, Java'ya bu durumla karsilastiginda
         "Excepiton at" dedik.

     3- Method isminden sonra "throws IOException" yazarsanız Java "throws FileNotFoundException" ı siler.
        Çünkü; "IOException", "FileNotFoundException" ı kapsar. "IOException", "FileNotFoundException" ın parent'ıdır,
        onun yaptığı her şeyi yapabilir, o yüzden "IOException" varken "FileNotFoundException" a gerek yoktur.

        "IOException" ;  Ïnput  Output Exception" demektir.

     4- "IOException", "FileNotFoundException" biz kod yazarken ortaya cikti daha run butonuna basmadan ortaya cikti
        bu tarz exception lara "compile time Exception" denir, diger adlari "Checked Exception" denir..

        "compile time Exception" lar kesinlikle halledilmelidir (Exception Handling). halledilmeden kod yazmaya devam etmeyin.
     */



    public static void main(String[] args) throws IOException {

        readTheTextFromTheFile();
        System.out.println("\n------------------");
        readTheText();
    }

    // Bir text file'daki text'i okuyan kodu yaziniz....

    // 1.YOL
    public static void readTheTextFromTheFile() throws IOException {
        FileInputStream fis = new FileInputStream("src\\main\\java\\day27exceptions\\File1.txt");
        int k = 0;
        while ((k= fis.read())!=-1){  // read() methodu okunacak karakter kalmadiginda "-1" verir.
            System.out.print((char)k);
        }
    }

    // 2. YOL
    public static void readTheText(){

        try {
            FileInputStream fis = new FileInputStream("src\\main\\java\\day27exceptions\\File1.txt");
            int k = 0;
            while ((k= fis.read())!=-1){  // read() methodu okunacak karakter kalmadiginda "-1" verir.
                System.out.print((char)k);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosyanin adresi veya varligi ile ilgili bir problem var.");
        } catch (IOException e) {
            System.out.println("Dosyada okunamayan karakter var.");
        }


    }











}
