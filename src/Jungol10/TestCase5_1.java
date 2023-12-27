package Jungol10;

import java.util.Scanner;

public class TestCase5_1 {

    public static void main(String[] args) {

        //반복제어문1_자가진단5_1
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        int cnt = 0;
        int avg = 0;

        while(true) {
            num = sc.nextInt();
            if(num%2 != 0){
                sum += num;
                cnt++;
            }

            if(num==0) {
                break;
            }
        }
        avg = sum/cnt;
        System.out.println("홀수의 합 = " + sum);
        System.out.println("홀수의 평균 = " +avg);

    }

}


