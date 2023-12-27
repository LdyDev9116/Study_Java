package oop.day2.hambuger;

public class HambrugerBean { //hamburger3 R
    // 자바빈 패턴 :  setter 메소드를 사용한 패턴 (매개변수가 없는 생성자를 만든 후, Setter 메소드를 이용하여 클래스 필스를 초기화 )
    //점층적 생성자 패턴

    private int bun; //필수

    private int patty; //선택

    private int cheese;

    private int tomato;

    private int bacon;


    public void setBun(int bun) {
        this.bun = bun;
    }

    public void setPatty(int patty) {
        this.patty = patty;
    }

    public void setCheese(int cheese) {
        this.cheese = cheese;
    }

    public void setTomato(int tomato) {
        this.tomato = tomato;
    }

    public void setBacon(int bacon) {
        this.bacon = bacon;
    }

    public HambrugerBean() {

    }



}
