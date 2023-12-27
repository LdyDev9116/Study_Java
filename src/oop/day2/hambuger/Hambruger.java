package oop.day2.hambuger;

public class Hambruger { //hamburger3 R
     //점층적 생성자 패턴

    private int bun ; //필수

    private int patty ; //선택

    private int cheese;

    private int tomato;

    private int bacon;


    public Hambruger(){} // 리턴값없는 클래스 이름 동일 디폴트 값

    public Hambruger(int bun , int  patty, int cheese , int tomato , int bacon ){ //Heap 에 안전하게 옮겨둠
        this.bun = bun;
        this.patty = patty;
        this.cheese = cheese;
        this.tomato = tomato;
        this.bacon = bacon;
    }
    public Hambruger(int bun , int  patty, int cheese  , int tomato ){
        this.bun = bun;
        this.patty = patty;
        this.cheese = cheese;
        this.tomato = tomato;

    }
    public Hambruger(int bun , int  patty, int cheese  ){
        this.bun = bun;
        this.patty = patty;
        this.cheese = cheese;
    }



}
