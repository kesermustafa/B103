package day10stringmanipulations;

public class ForLoop01 {
    public static void main(String[] args) {

        //Example 1 : Ekrana 5 kere "Hi" yazdiriniz...

        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        //Tekrarli isler icin loop kullaniriz...
        //Dort cesit loop vardir.  i) for-loop 2) while-loop 3)do-while-loop 4)for-each loop

        //1.for-loop
        //Example 2 : Ekrana 5 kere "Hi" yazdiriniz...

        //Baslangic degeri  hangi sart altinda calisacak    Increment veya Decrement
        for(int i = 1 ;               i<=6 ;                     i++){
            System.out.print("Hi ");
        }

        System.out.println();

        //Example 3: 4 den 7 ye kadar tum tam sayilari ekrana yazdiran kodu yaziniz....
        for(int i = 4 ; i<8 ; i++){
            System.out.print(i + " ");
        }

        /*
         Increment :
         1.YOL:  int i =12;  i = i+3 yaparsin. yani i'ye 3 ekle i'nin icine koy atama yapar. ama bunda i tekrar ediyor java tekrar sevmez,
         2.YOL:              i+= 3 dersin  ayni sonucu verir ve i tekrar etmedigi icin kullanmak daha iyidir
         3.YOL:              i++  demek  ==>  sadece 1 artirmak demektir. sadece 1 artirirken bunu kullaniriz.

         increment diyince ssadec toplama akla gelmesin carpoma da olur.
         i = i*3
         i*= 3

         Decrement:
         int k = 15;
         1.YOL:  k = k-7
         2.YOL:  k-= 7
         3.YOL: k--   demek ==>  sadece 1 eksiltirken azaltirken bu kullanilir.

         bolmede de kullanilir
         k = k/3
         k/=3

         */
        System.out.println();

        //Example 4 : 14 den 5 e kadar tum tam sayilari yazdirin.
        for(int i = 14 ; i>4 ; i--){
            System.out.print(i + " ");
        }
        System.out.println();

        //Example 5 : 14 den 5 kadar tum cift sayilari ekrana yazdirin
        //14, 12, 10, 8, 6

        //1.YOL
        for(int i = 14 ; i>4 ; i-=2){
             System.out.print(i + " ");
            }

        System.out.println();
        //2.YOL
        for(int i = 14 ; i>4 ; i--){
            if(i%2==0){
                System.out.print(i + " ");
            }
        }
        System.out.println();

        //EXAMPLE 6 : 28 den  157 ye kadar tum tek sayilari yazdirin

        for(int i = 28 ; i<158 ; i++){
            if(i%2!=0){
                System.out.print(i + " ");
            }
        }
        System.out.println();

        //Example 7 ; Java Stringini J*a*v*a st
        String str = "Java";

        for(int i = 0 ; i<str.length() ; i++){
                System.out.print(str.charAt(i) + "*");
        }
        System.out.println();

        //Example 8 ; size verilen string de tekrarsiz karakterleri ekrana yazdirin...
        String str1 = "Hellooo Ali";

        for(int i = 0 ; i<str1.length() ; i++ ){
            char c = str1.charAt(i);
            if(str1.indexOf(c) == str1.lastIndexOf(c)){
                System.out.print(c); //He Ai
            }
        }
        System.out.println();

        //Example 9 ; size verilen string de tersten ekrana yazdirin...
        for(int i = str1.length()-1; i>=0 ; i--){
            System.out.print(str1.charAt(i));
        }
        System.out.println();


    }
}
