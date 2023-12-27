package Jungol3;

import java.util.Scanner;

public class Test3_4 {
    public static void main(String[] args) {
        //정수 변수 a와 b를 입력받아서 a는 전치 증가 연산자를 사용하고, b는 후치 감소 연산자를 사용하여 두 수의 합을 c에 저장한 후 각각을 출력하는 프로그램을 작성하시오
        //출력 ..

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = (++num1 + num2--);

        System.out.printf("a = %d, b = %d, c = %d ", num1,num2, num3 );


    }

}
