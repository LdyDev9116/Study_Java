package Jungol10;

import java.util.Scanner;

public class TestCaseSub4 {

    public static void main(String[] args) {

        //반복제어문2_연습문제4
        //자연수를 입력받아서 1부터 입력받은 수까지의 합을 출력하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int sum = 0;


            for (int i = 1; i <= count; i++) {
                sum = sum +i;
            }
            System.out.print(sum );



    }
}