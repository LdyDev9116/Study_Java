package oop.day4.inher2;

public class Calculation   {

    private int  num1;
    private int  num2;

    Calculation(){
        num1 = 20;
        num2 = 10;
    }

    public void addition(){
        System.out.println( "두수의덧셈 : "+  (num1 + num2));
    }
    public void subtraction(){
        System.out.println( "두수의뺄셈 : " + (num1 - num2));
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }


}
