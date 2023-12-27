package Jungol7;

import java.util.Scanner;

public class Test_Main_7_3 {

    public static void main(String[] args) {
        //정수를 입력받아서 1부터 입력받은 정수까지의 5의 배수의 합을 구하여 출력하는 프로그램을 작성하시오.
        // 입력값 :20
        // 5배수 합계
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) { // num: 20 40 60 80
            if (i % 5 == 0){
                sum += i; // i 일경우 5 15 30 50
            }
        }
        System.out.println(sum);

    }

}
