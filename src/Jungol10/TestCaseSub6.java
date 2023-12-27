package Jungol10;

import java.util.Scanner;

public class TestCaseSub6 {

    public static void main(String[] args) {

        //반복제어문2_연습문제6
        //5명의 성적을 입력받아서 총점과 평균을 출력하는 프로그램을 작성하시오. (평균은 반올림하여 소수 첫째자리까지 출력한다.)
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        double avg = 0;

            for (int i = 1; i <= 5; i++) {
                int n = sc.nextInt();
                sum += n;

                 avg = (double) sum / 5;

            }//합계
            System.out.println("총점 : " + sum);
            System.out.println("평균 : " + avg);


    }
}