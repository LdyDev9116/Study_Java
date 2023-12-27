package Jungol3;

import java.util.Scanner;

public class Test3_5 {
    public static void main(String[] args) {
        //3개의 정수 a, b, c를 입력받아서 a와 b, b와 c를 각각 비교하여 같으면 1, 같지 않으면 0을 출력하고, 다음에는 같지 않으면 1, 같으면 0을 출력하는 프로그램을 작성하시오 
        Scanner scanner = new Scanner(System.in);

        // 정수 a, b, c 입력받음
        System.out.print("정수 a를 입력하세요: ");
        int a = scanner.nextInt();

        System.out.print("정수 b를 입력하세요: ");
        int b = scanner.nextInt();

        System.out.print("정수 c를 입력하세요: ");
        int c = scanner.nextInt();

        // a와 b를 비교하여 같으면 1, 같지 않으면 0 출력
        if (a == b) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

        // b와 c를 비교하여 같지 않으면 1, 같으면 0 출력
        if (b != c) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}