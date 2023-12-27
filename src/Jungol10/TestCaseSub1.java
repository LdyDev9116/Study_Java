package Jungol10;

import java.util.Scanner;

public class TestCaseSub1 {

    public static void main(String[] args) {

        //반복제어문2_연습문제1
        //10 이하의 정수를 입력받아 입력받은 정수만큼 "C언어 프로그래밍"이라고 출력하는 프로그램을 작성하시오.

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int i  = 0;

        while (i < count){
            System.out.print("C언어 프로그래밍\n");
            i++;
        }

    }
}
