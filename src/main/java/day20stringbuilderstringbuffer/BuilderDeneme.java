package day20stringbuilderstringbuffer;

public class BuilderDeneme {

    public static void main(String[] args) {


        StringBuilder strb3 = new StringBuilder();  //16 ==> bos iken memory de 16 capacity li kutu olusturur

        strb3.append("Catad");
//        strb3.append("xxxxxxxxxxxxxxx");

        int numOfChar = strb3.length();
        System.out.println(numOfChar);


        int capacity = strb3.capacity();
        System.out.println(capacity);




    }
}
