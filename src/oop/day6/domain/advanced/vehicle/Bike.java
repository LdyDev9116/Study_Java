package oop.day6.domain.advanced.vehicle;

public class Bike extends  TwoWheeler{


    @Override
    public void printType() {
        System.out.println("이것은 자전거입니다");
    }

    @Override
    public void printPrice() {
        System.out.println("가격 : 15만");
    }

    public void printBrand(){
        System.out.println("브랜드 : 삼천리 ");
    }


}
