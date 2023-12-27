package oop.day6.domain.advanced.vehicle;

public class Car extends FourWheeler {
    @Override
    public void printPrice() {
        System.out.println("이것은 자동차입니다");
    }

    public void printType(){
        System.out.println("브랜드: BMW ");
    }
    public void printBrand(){
        System.out.println("가격 : 5000천만");
    }




}
