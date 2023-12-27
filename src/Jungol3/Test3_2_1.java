package Jungol3;

import java.util.Scanner;

public class Test3_2_1 {
    public static void main(String[] args) {
        //5개의 정수를 입력 받아 각각의 수에 + 3, - 3, × 3, / 3, % 3의 연산을 실행하여
        // 그 값을 저장한 후 차례대로 출력하는 프로그램을 작성하시오 
        // 더하기 / 나머지

        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();
        int input4 = sc.nextInt();
        int input5 = sc.nextInt();

        input1 += 3;
        input2 -= 3;
        input3 *= 3;
        input4 /= 3;
        input5 %= 3;

        System.out.print("5개의 수를 입력하시오. ");
        System.out.print(input1 + " ");
        System.out.print(input2 + " ");
        System.out.print(input3 + " ");
        System.out.print(input4 + " ");
        System.out.println(input5);

    }

}
