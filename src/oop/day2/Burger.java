package oop.day2;

//추상클래스임
public abstract class Burger implements Item {
    public Packing  packing(){
        return  new Wrapper();
    }

    public  abstract  float price();



}
