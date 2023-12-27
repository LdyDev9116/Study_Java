package Jungol7;

import java.util.Scanner;

public class Test_Main_7_10 {

    public static void main(String[] args) {
        //2부터 9까지의 수 중 2개를 입력받아 ****
        // 입력받은 수 사이의 구구단을 출력하는 프로그램을 작성하시오.
        //단 반드시 먼저 입력된 수의 구구단부터 아래의 형식에 맞게 출력하여야 한다.
        // 구구단 사이의 공백은 3칸이다.
        // 입력값: 5 3
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1 > num2) {
            for(int i = 1; i < 10; i++) {
                for(int j = num1; j >= num2; j--) {
                    System.out.printf("%d * %d = %2d   ", j, i, j*i);
                }
                System.out.println();
            }
        } else {
            for(int i = 1; i < 10; i++) {
                for(int j = num1; j <= num2; j++) {
                    System.out.printf("%d * %d = %2d   ", j, i, j*i);
                }
                System.out.println();
            }
        }
        sc.close();
    }
}