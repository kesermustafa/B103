package day25exception;

public class E02 {
    public static void main(String[] args) {

        String arr[] = {"Ali", "Can", "Veli", "Han"};

        getElementFromArray(arr, 2); // Veli
        getElementFromArray(arr, 0); // Ali
        getElementFromArray(arr, 4);

    }

    //Bir String Arrayden index girerek eleman elde edebilmek icin bir method olusturun.


    public static void getElementFromArray(String arr[], int idx){

        try {
            System.out.println(arr[idx]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("tuh olmadii yaaa" + e.getMessage());
            //Exception ile ilgili detayli teknik mesaj verir..
            e.printStackTrace();

            //Hata mesajni diger mesajlardan  ayirmak icin kullanilir...
            System.err.println("Insallah baska zaman olur");
        }




    }




}
