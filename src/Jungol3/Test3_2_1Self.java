package Jungol3;

import java.util.Scanner;

public class Test3_2_1Self {
    public static void main(String[] args) {
        //정수 2개를 입력받아서 첫 번째 수에는 100을 증가시켜 저장하고
        // 두 번째 수는 10으로 나눈 나머지를 저장한 후 두 수를 차례로 출력하는 프로그램을 작성하시오.
        // 더하기 / 나머지

        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();

        input1 += 100;
        input2 %= 10;

        System.out.print(input1 + " ");
        System.out.println(input2);





    }

}
