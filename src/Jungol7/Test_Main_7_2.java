package Jungol7;

import java.util.Scanner;

public class Test_Main_7_2 {

    public static void main(String[] args) {
        //100 이하의 두 개의 정수를 입력받아
        // 작은 수부터 큰 수까지 차례대로 출력하는 프로그램을 작성하시오.

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 < num2) {//5<10
            for (int i=num1; i<=num2; i++) // 5 10 || 5 6 7 8 9 10
                System.out.print(i + " ");
        }
        else {
            for (int i=num2; i<=num1; i++) // 10 5  || 5 6 7 8 9 10
                System.out.print(i + " ");
        }
    }
}
/*

package Jungol7;

import java.util.Scanner;

public class Test_Main_7_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// 두 개의 정수 입력받음
        System.out.print("첫 번째 정수를 입력하세요 (100 이하): ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 정수를 입력하세요 (100 이하): ");
        int num2 = scanner.nextInt();

        // 입력받은 두 수의 범위 확인
        if (num1 <= 100 && num2 <= 100) {
            // 작은 수부터 큰 수까지 출력
            int start = Math.min(num1, num2);
            int end = Math.max(num1, num2);

            for (int i = start; i <= end; i++) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("입력한 수 중 하나 이상이 100을 초과하였습니다. 100 이하의 정수를 입력하세요.");
        }
    }
}
*/



