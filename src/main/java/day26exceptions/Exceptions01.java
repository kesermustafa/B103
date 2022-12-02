package day26exceptions;

public class Exceptions01 {
    public static void main(String[] args) {

        String str = "123";

        int result = convertStringToInteger(str);

        System.out.println(result+5);

        String st = "1a2b";
        int r = convertStringToInteger(st); // NumberFormatException (sayi formati hatali)
                                    //  Eger icinde rakamdan farkli karakter barindiran bir stringin
                                    // valueOf methodu kullanarak Integer'a cevirmek isterseniz NumberFormatException alirsiniz

        System.out.println(r+10);

    }

    public static int convertStringToInteger(String str){

        int i = 0;
        try {
            //Herhangi bir satirda exeption atilirsa java direkt catch bolumune gecer try icindeki sonraki kodlar calismaz.
            i = Integer.valueOf(str);
            System.out.println("Burasi try bolumu");
        }catch (NumberFormatException e){
            System.out.println("Rakam olmayan karakter iceren stringler Integer'a cevrilemez");
        }

        return i;
    }




}
