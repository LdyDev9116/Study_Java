package Jungol7;

import java.util.Scanner;

public class Test_Main_7_7 {

    public static void main(String[] args) {
        //한 개의 자연수를 입력받아 그 수의 배수를 차례로 10개 출력하는 프로그램을 작성하시오.

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int mult= 0;

        for (int i = 1; i <= 10; i++) {
            mult = ( num * i);
            System.out.print(mult + " ");

        }


    }
}
