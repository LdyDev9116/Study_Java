package Jungol10;

import java.util.Scanner;

public class TestSelfDtl1 {

    public static void main(String[] args) {
        //반복제어문3_자가진단2
        //자연수 n을 입력받아서 n줄만큼 다음과 같이 출력하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        int i;

        for(i = 1; sum < n; i += 2) {
            if( i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println(i/2 + " " + sum);
    }
}