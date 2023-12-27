package Jungol7;

import java.util.Scanner;

public class Test_Main_7_6 {

    public static void main(String[] args) {
        //두 개의 정수를 입력받아
        // 두 정수 사이(두 정수를 포함)에 3의 배수이거나
        // 5의 배수인 수들의 합과 평균을 출력하는 프로그램을 작성하시오.
        //(평균은 반올림하여 소수 첫째자리까지 출력한다.)

        Scanner sc = new Scanner(System.in);
        int num1 =sc.nextInt();
        int num2 =sc.nextInt();

        int minNum = Math.min(num1, num2);
        int maxNum = Math.max(num1, num2);

        int sum = 0;
        int count = 0;
        double avg =0.0;

        for (int i = minNum; i <= maxNum; i++) {
            if (i % 3 == 0 || i % 5 == 0 ) {

                sum += i ;
                count++;
            }
        }

        avg = (double) sum /count;
        System.out.println("sum : "+sum);
        System.out.printf("avg : %.1f",avg);


    }
}