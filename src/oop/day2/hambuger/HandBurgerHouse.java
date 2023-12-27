package oop.day2.hambuger;

import oop2.Person2;

public class HandBurgerHouse {

    public static void main(String[] args) {

        //모든 재료가 있는 햄버거
        /*
        Hambruger hamburger1 = new Hambruger(2,2,2,2);

        // 빵과 패티와 치즈와 토마토 햄버거
        Hambruger hamburger2 = new Hambruger(1,1,1,1);

        //빵과 패티와 침즈 햄버거
        Hambruger hamburger3 = new Hambruger(1,1,1,1);
        */

        //2. 자바빈 패턴을 이용하여 햄버거 만들기

        HambrugerBean hambrugerBean1 = new HambrugerBean();

        // 빵과 패티 치즈만 있는 햄버거  ( 치즈가 두개 )

        hambrugerBean1.setBun(1);
        hambrugerBean1.setPatty(1);
        hambrugerBean1.setCheese(2);

        //빵과 패티 2 토마토 2 햄버거
        hambrugerBean1.setBun(1);
        hambrugerBean1.setPatty(2);
        hambrugerBean1.setCheese(2);

        //객체 생성 시점에서 일관성문제 ((객체 생성 부분과 값을 설정되는 부분이 물리적으로 분리되었기 때문에))
        //불변성문제 야기

        HambrugerBuilder  hambrugerBuilder = new HambrugerBuilder.Builder(2,2).cheese(2).build();

        String str = hambrugerBuilder.showBurgerTopping();

        System.out.println(str);

    }




}
