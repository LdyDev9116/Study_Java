package Jungol10;

import java.util.Scanner;

public class TestCaseSub5 {

    public static void main(String[] args) {

        //반복제어문2_연습문제5
        //10개의 정수를 입력받아 그 수들 중 짝수의 개수가 몇 개인지 출력하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);

        int multipleTwo = 0;

        for (int i = 1; i <= 10; i++) {
            int count = sc.nextInt();

            if (count % 2 == 0){
                multipleTwo += 1;
            }

        }
        System.out.println("입력받은 짝수는 " + multipleTwo + "개입니다.");


    }
}