package oop.day2;

public interface Item {
    //인터페이스라는 타입은 기능을 정의할때 (메소드 정의 ) body x 정의만 한다  ---> abstract 메소드 (추상메소드)
    public String name();
    public Packing packing();
    public float price();

}
