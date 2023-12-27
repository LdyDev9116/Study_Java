package Jungol10;

import java.util.Scanner;

public class TestCase4 {

    public static void main(String[] args) {

        //반복제어문1_연습문제4
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        double avg = 0;

        while (true) {
            int num = sc.nextInt();
            if (num == 0 ){
                break;
            }else{
                count++;
                sum += num; //num 입력값 sum 변수에 합쳐줌
                avg= (double) sum/count;

            }

            System.out.println("입력된 자료의 개수 = " + count);
            System.out.println("입력된 자료의 합계 = " + sum);
            System.out.print("입력된 자료의 평균 = ");
            System.out.printf("%.2f",avg);
            System.out.println();
        }


    }
}


