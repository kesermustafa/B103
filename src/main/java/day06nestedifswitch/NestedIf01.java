package day06nestedifswitch;

public class NestedIf01 {
    public static void main(String[] args) {

        // Nested : ic ice gecmis demektir...


        /*
        Pasword'un ilk harfi buyuk harf ise
        A olursa gecerli pasword aksi halde gecersiz pasword..

        Paswordun lik harfi kucuk ise
        z olursa gecerli pasword aksi halde gecersiz pasword...

        Note: Java "nested" kodlari calistirirken cok zaman harcar, buna "Time Complexity" denir.
              Bu yuzden mumkunse "nested" kod yazmamaya calisiriz.
         */

        String psw = "Axy12!";

        char ilkHarf = psw.charAt(0);

        if(ilkHarf>='A' && ilkHarf<='Z'){

            if(ilkHarf=='A'){
                System.out.println("Gecerli Pasword...");
            }else {
                System.out.println("Gwcersiz Pasword...");
            }

        } else if (ilkHarf>='a' && ilkHarf<='z') {

            if(ilkHarf=='z'){
                System.out.println("Gecerli Pasword...");
            }else {
                System.out.println("Gecersiz Pasword...");
            }

        }else {
            System.out.println("Ilk karakter harf olmalidir...");
        }


    }
}
