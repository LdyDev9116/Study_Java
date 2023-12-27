package oop.day2.classEx.sec06;

//가변길이 매개변수
//메소드를 호춯할때, 매개변수의 개수에 맞게 제공해야한다
//만약, 메소드가 가변길이 매개변수를 가지고 있다면 , 매개변수의 개수와 상관없이 매개값을 제공해야 한다.
// int sum (int ... values);


public class Computer {
    boolean power = false;

    int sum(int... values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return  sum ;
        //System.out.println(sum); 에러
    }
///////////////////////////////////////////////////////////////////
    boolean isPower(){
        if (power == true ){
            System.out.println("컴퓨터 전원이 켜져 있습니다.");
            return  true;
        }
        System.out.println("전원이 꺼져 있습니다.");
        return  false;

    }


}
//return 문 : 메소드의 실행을 강제로 종료 , 호출한 곳으로 돌아간다.(제어권이 이동된다)