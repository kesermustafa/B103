package day23inheritancepolymorphism;

public class Courses {

        public void liveSessions(){
            System.out.println("Courses are live");
        }

        public Courses(){
            System.out.println("constructor A");
        }

        public Courses(String s){
            System.out.println("constructor B");
        }

}
