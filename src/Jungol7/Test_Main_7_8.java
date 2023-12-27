package Jungol7;

import java.util.Scanner;

public class Test_Main_7_8 {

    public static void main(String[] args) {
        //행과 열의 수를 입력받아 다음과 같이 출력하는 프로그램을 작성하시오.
        // 3행 row   4열 column

        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                System.out.print( i * j + " ");
            }
            System.out.println();
        }


    }
}