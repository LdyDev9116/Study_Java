package Jungol10;

import java.util.Scanner;

public class Test3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 최대 100개의 정수를 저장할 배열 선언
        int[] numbers = new int[100];
        int input;
        int count = 0;

        // 정수를 차례로 입력받음
        System.out.println("최대 100개의 정수를 입력하세요. 0을 입력하면 입력이 중단됩니다.");

        while (true) {
            System.out.print("정수를 입력하세요: ");
            input = scanner.nextInt();

            if (input == 0) {
                break; // 0이 입력되면 입력 중단
            }

            numbers[count] = input;
            count++;

            if (count >= 100) {
                System.out.println("입력이 최대 개수에 도달하였습니다. 입력을 중단합니다.");
                break;
            }
        }

        // 짝수 번째에 입력된 정수 출력
        System.out.println("짝수 번째에 입력된 정수들:");

        for (int i = 1; i < count; i += 2) {
            System.out.print(numbers[i] + " ");
        }
    }
}