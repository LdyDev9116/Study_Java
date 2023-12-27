package Jungol5;

import java.util.Scanner;

public class Test5_4Self {

    public static void main(String[] args) {


        //복싱체급은 몸무게가
        // 50.80kg 이하를 Flyweight,
        //61.23kg 이하를 Lightweight,
        //72.57kg 이하를 Middleweight,
        //88.45kg 이하를 Cruiserweight,
        //88.45kg 초과를 Heavyweight 라고 하자.
        //몸무게를 입력받아 체급을 출력하는 프로그램을 작성하시오
        //..

        Scanner sc = new Scanner(System.in);
        double weigth = sc.nextDouble();

        if (weigth < 50.80 ){
            System.out.printf("Flyweight");
        }else if(weigth < 61.23 ){
            System.out.printf("Lightweight");
        }else if(weigth < 72.57 ){
            System.out.printf("Middleweight");
        }else if(weigth < 88.45 ){
            System.out.printf("Cruiserweight");
        }else if(weigth > 88.45 ){
            System.out.printf("Heavyweight");
        }

    }
}
