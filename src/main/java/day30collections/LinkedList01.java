package day30collections;

import java.util.Collection;
import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {

        LinkedList<String>names = new LinkedList<>();

        names.add("Chris");
        names.add("Alexandre");
        names.add("Mark");
        names.add("Tom");
        names.add("Jeremy");
        names.add("Hans");
        System.out.println(names);

        // peek() ilk karakteri verir ve silmez..
        String firstEl=names.peek();
        System.out.println(firstEl);
        System.out.println(names);

        // peek() ilk karakteri verir ve silmez...----  bos ise null verir....
        LinkedList<String> myList = new LinkedList<>();
        String first = myList.peek();
        System.out.println(first); // null

        // names.poll() ilk karakteri verir ve siler ----  bos ise excaption atmaz...
        String firstElement = names.poll();
        System.out.println(firstElement); // Chris
        System.out.println(names); // [Alexandre, Mark, Tom, Jeremy, Hans]

        // element() ilk elemani verir silmez .... list bos ise excaption atar...
        String f = names.element();
        System.out.println(f); // Alexandre
        System.out.println(names); // [Alexandre, Mark, Tom, Jeremy, Hans]

        // Excample 1 : "A" ile baslayan tum isimleri ***** e ceviriniz...

        LinkedList<String>students = new LinkedList<>();
        students.add("Chris");
        students.add("Alexandre");
        students.add("Mark");
        students.add("Tom");
        students.add("Jeremy");
        students.add("Hans");
        System.out.println(students);

        for(String w : students){
            if(w.startsWith("A")){
                students.set(students.indexOf(w), "*****");
            }
        }
        System.out.println(students);


        // Example 2: Listdeki 4 harften cok harf iceren isimleri siliniz....

        //Eleman sayısını azaltacağımız için i'ye ihtiyacımız var, o yüzden for-each loop değil for loop kullanırız.

        for(int i = 0; i<students.size(); i++){
                if(students.get(i).length()>4){
                    students.remove(students.get(i));
                    i--;
            }
        }
        System.out.println(students);



    }
}
