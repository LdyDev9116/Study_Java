package Jungol10;

import java.util.Scanner;

public class TestSelfSub4 {

    public static void main(String[] args) {
        //반복제어문2_자가진단4
        //100 이하의 정수를 입력받아서 입력받은 정수부터 100까지의 합을 출력하는 프로그램을 작성하시오.

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int sum = 0;

        if (count <= 100 ){
            for (int i = count; i <= 100; i++) {
                sum = sum +i;
            }
            System.out.print(sum );
        }


    }
}