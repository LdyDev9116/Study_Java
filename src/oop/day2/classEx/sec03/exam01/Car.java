package oop.day2.classEx.sec03.exam01;

public class Car {
	//필드 선언
    //필드 멤버 선언 자동차는 모델과 엔진을 시작하고 중지할 수 있는 데이터, 속도를 가지고 있다.

    String model;
    boolean start;

    int speed;


    Car(){

    }
    Car(String model, boolean start, int speed){ // 애로 해줌으로써 데이터 출력
        this.model = model;
        this.start = start;
        this.speed = speed;

    }



}