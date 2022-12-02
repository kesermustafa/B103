    package day24statickeywordencapsulation;

    // (Kapsullemek/Kapsule Koymak)
    // Encapsulation "Data Hiding(Gizlemek)" demek
    // Data yi nicin gizlersiniz ? Data yi dis etkenlerden korumak icin,
    // Data yi nasil gizlersiniz ? Access Modifier'inin "private" yaparak gizlerim.
    // Data'yi gizledikten sonra baska class lardan okumak istersen ne yaparsin...
    // "get" method'lar (getter) olusturarak gizlediginiz data'lari okunur hale getirebiliriz..
    // Data'yi gizledikten sonra baska class lardan degistirmek istersen ne yaparsin...
    // set method'lar (setter)  olusturarak gizledigimiz datalari degistirebiliriz.
    // Variable'in data type'i ile get method'un "return type'i ayni olmalidir.
    // get methodlari isimlendirilirken "get + <variablename>" ancak variable'in data tipi boolean ise "is + variable name


    public class Student {

        public String stdName = "Tom Hanks";
        private String stdId = "TH202201";
        private double gpa = 3.8;
        private boolean retied = false;



        public String getStdId() {
            return stdId;
        }

        public double getGpa() {
            return gpa;
        }

        public boolean isRetied() {
            return retied;
        }


        public void setStdId(String stdId) {
            this.stdId = stdId;
        }

        public void setGpa(double gpa) {
            this.gpa = gpa;
        }

        public void setRetied(boolean retied) {
            this.retied = retied;
        }







    }
