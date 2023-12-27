package oop.day4.inher3;

public class FamilyMain {

    public static void main(String[] args) {

        SubSon s = new SubSon();
//        s.printSon();
//        s.printFather();
//        s.printGrandFather();
        s.setSon("나는 아들입니다.");
        System.out.println(s.getSon());

        s.setFamilyName("이");
        s.setHouseAddress("서울시 강남");


        System.out.println("================");
        s.printFather();
        s.printSon();


    }
}
