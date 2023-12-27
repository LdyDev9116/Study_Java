package oop.day4.inher;

public class CatMain {

    public static void main(String[] args) {
        BabyCat babyCat = new BabyCat("brown");
        System.out.println();
        babyCat.eat();
        babyCat.meow();
        babyCat.printInfo();
        ///////////////////
        Object obj1 = babyCat; // babyCat -> obj1 캐스팅

        BabyCat baby = (BabyCat) obj1;
        baby.printInfo();




    }

}
