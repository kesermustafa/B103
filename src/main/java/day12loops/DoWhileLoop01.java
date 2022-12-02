package day12loops;

public class DoWhileLoop01 {
    public static void main(String[] args) {

        //while loop bazi drumlar icin hic calismaya bilir..
        //Yani while loop icin "Zero execution" sifir uygulama mumkundur
        int i = 1;

        while (i<1){
            System.out.println("While Loop");
            i++;
        }


        //Do-while Loop kullandiginizda loop body si icindeki kod en az bir kere calisir...
        //Yani do-while loop icin Zero execution mumkun degilir...
        int k = 1;

        do {
            System.out.println("Do-While Loop");
            k++;
        }while(k<1);


        // Example 1: bir ondalik sayini ondalik kismindaki rakamlarinin toplamini bulunuz...
        // 24,5673 ==> 5+6+7+3 = 23

        double num = 24.5673;
        System.out.println("num = " + num);

        //Sting.valueOf() methodu parantez icine konulan data nin tipini String yapar.
        String str = String.valueOf(num);
        System.out.println("str = " + str);

        //Regex icin nokta kullandiginizda onune \\ koyunz... yani "\\." seklinde kullanilir.
        String decimalPart = str.split("\\.")[1];
        System.out.println("decimalPart = " + decimalPart);

        int decemalInt = Integer.valueOf(decimalPart);
        System.out.println("decemalInt = " + decemalInt);

        int sum = 0;
        do{

           sum =  sum+decemalInt%10;

           decemalInt = decemalInt/10;

        }while (decemalInt>0);
        System.out.println("sum = " + sum);








    }
}
