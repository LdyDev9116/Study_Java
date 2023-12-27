package Jungol10;

import java.util.Scanner;

public class TestCaseDtl1 {

    public static void main(String[] args) {
        ////반복제어문3 연습문제1
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자를 입력하세요: ");
        int inputNumber = scanner.nextInt();

        int sum = 0;
        int lastAddedValue = 0;

        // 1부터 차례로 누적하여 합을 구함
        for (int i = 0; ; i++) {
            if (sum  >= inputNumber) {
                break; // 입력값을 넘으면 종료
            }

            sum += i;
            lastAddedValue = i;
        }

        // 결과 출력
        System.out.print(lastAddedValue + " ");
        System.out.println(sum);
    }
}