package Jungol10;

import java.util.Scanner;

public class TestCase2 {

    public static void main(String[] args) {

        //반복제어문1_연습문제2

        Scanner sc = new Scanner(System.in);
        int num = 1 ;
        int sum = 0 ;

        while (num <= 10 ){
            sum = sum + num ;
            num++;
        }
        System.out.println(sum); // 1~10 합계
        System.out.println(num); // num의값


    }
}


