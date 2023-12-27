package Jungol7;

import java.util.Scanner;

public class Test_Main_7_5 {

    public static void main(String[] args) {
        //10개의 정수를 입력받아
        // 입력받은 수들 중 짝수의 개수와 홀수의 개수를 각각 구하여 출력하는 프로그램을 작성하시오.

        Scanner sc = new Scanner(System.in);
        int even_count = 0; //짝수
        int odd_count = 0; //홀수

        for (int i = 0; i < 10; i++) {

            int num = sc.nextInt(); // 입력 받고자 하는 수의 갯수를 입력 받아 변수에 저장

            if (num % 2 == 0) { // 짝수 개수
                even_count++;
            }
            if (num % 2 != 0){ // 홀수 개수
                odd_count++;
            }
        }

        System.out.println("even : " + even_count);
        System.out.println("odd : " + odd_count);


    }
}
