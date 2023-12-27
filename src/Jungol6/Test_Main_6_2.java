package Jungol6;

import java.util.Scanner;

public class Test_Main_6_2 {

    public static void main(String[] args) {
        //0 이상의 정수들이 공백으로 구분되어 반복적으로 주어진다.
        //0이 입력되면 반복문을 멈추고 그 전까지 입력받은 수들에 대하여
        //홀수의 개수와 짝수의 개수를 출력하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);
        int even_count = 0; //짝수
        int odd_count = 0; //홀수

        while (true) {
            int num = sc.nextInt(); // 입력 받고자 하는 수의 갯수를 입력 받아 변수에 저장

            if (num == 0) {
                break;
            }
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
