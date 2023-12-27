package oop.day2.classEx.sec05.exam01;

import java.util.Scanner;

public class Calculator {
    boolean power = false;
    //리턴값이 없는 메소드 선언

    public Calculator() {
    }

    public Calculator(boolean power) {
        this.power = power;
        if (this.power == true) {
            PowerOn();
        }

    }

    public void PowerOn() {
        this.power = true;
        System.out.println("전원이 켭니다");
    }

    //리턴값이 없는 메소드 선언
    public void PowerOff() {
        this.power = false;
        System.out.println("전원이 끕니다");
    }

    //호출 시 두정수 값을 전달받고, plus 메소 생성합니다 두수를 + 연산하여
    //호출한 곳으로 결과값 int를 리턴하는 메소드 선언
    public int plus(int a, int b) {
        int sum = 0;
        sum = a + b;
        return sum;
    }


    //호출 시 두 정수 값을 전달받고, divide 메소 생성합니다 두수를 / 연산하여
    //호출한 곳으로 결과값 double을 리턴하는 메소드 선언

    public double divide(int a, int b) {
        double div = 0;
        div = (double) a / b;

        return div;

    }


}