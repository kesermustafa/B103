package day28abstraction;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine {

    /*
     "throw" ile "throws" arasindaki farklar nelerdir?
    1) "throw" method'un body'si icinde kullanilir. "throws" ise method'un isminden sonra kullanilir.
    2) "throw" dan sonra obje olusturulur. "throws"dan sonra ise sadece Exception Class'in ismi yazilir.
    3) "throw" method'un icinde istedigimiz yerde Exception uretmek icin kullanilir.
        "throws" ise var olan checked Exception'i atmak icin kullanilir.
        Yani "throw" Exception üretir. "throws" var olan Exception'i atar.
    4) "throw" dan sonra sadece bir tane Exception olabilir.
       "throws" dan sonra 1 den fazla Exception olobilir.
        Herhangi bir limit yok virgul koy digerini yaz virgul koy digerini yaz gibi.. Istedigimiz kadar yazabiliriz yani

     */


    public static void main(String[] args) {


        readFileLineByLine();



    }

    /*
    Bir dosyayı satır satır okumak için "readLine() " kullanılır. readLine() methodu nu
    kullanabilmek için BufferedReader objesine ihtiyaç duyarız.
     */
    public static void readFileLineByLine(){

        try {
            BufferedReader br = new BufferedReader(new FileReader("src\\main\\java\\day27exceptions\\File1.txt"));

           String line = br.readLine(); // readLine() dosyaya gider ilk satiri alir stringin icine koyar.

            while (line!=null){
                System.out.println(line);
                line = br.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("Ya path yanlis ya da dosya silinmis - " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Okunamayacak karakter veya karakterler var. " + e.getMessage());
        }


    }


}
