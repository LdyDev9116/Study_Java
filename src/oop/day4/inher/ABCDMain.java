package oop.day4.inher;
    class A{
        private  int numberA;
        A(){
            printNumberA();
        }

        public int getNumberA() {
            return numberA;
        }
        public  void printNumberA(){
            System.out.println(getNumberA());
        }
    }
// ----------------------------------------------------------------------
    class B extends  A{
        private  int numberB;
        B(){
//            super(); // 부모 클래스 A 가 먼저 객체 생성
            printNumberB();
        }

        public int getNumberB() {
            return numberB;
        }

        public  void printNumberB(){
            System.out.println(getNumberB());
        }


    }
    // ----------------------------------------------------------------------
    class C extends  B{
        private  int numberC;

        public int getNumberC() {
            return numberC;
        }
        public  void printNumberC(){
            System.out.println(getNumberC());
        }

    }

    class D extends  C{
        private  int numberD;

        public int getNumberD() {
            return numberD;
        }
        public  void getAllInfo(){
            super.printNumberA();
            super.printNumberB();
            super.printNumberC();
            System.out.println(getNumberD());
        }

    }


public class ABCDMain {
    public static void main(String[] args) {
//        B b = new B();
//        b.getNumberB();
//        b.getNumberA();
//        b.printNumberB();
//        b.printNumberA();
//
//        System.out.println("==========================================");
//
//        A a = new B();
////        a.getNumberA();
//        a.printNumberA();

        D d = new D();
        d.getAllInfo();

        C c = new C();



    }


}