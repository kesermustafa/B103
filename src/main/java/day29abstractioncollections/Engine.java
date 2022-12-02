package day29abstractioncollections;

public interface Engine extends Vehicle {

    //    child    -       parent
    // Class    --->    Interface   ===> implements
    // Class    --->    Class       ===> extends
    // interface --->   interface   ===> extends
    // interface --->   class       ===> mumkun degil


    // interface lerdeki tum variable lar otomatik(default) olarak public dir.
    // interface lerdeki tum variable lar otomatik(default) olarak final dirlar.
    // interface lerdeki tum variable lar otomatik(default) olarak static dir.




   int price = 2000;

   double weight = 23.5;

    void run();


}
