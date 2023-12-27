package Jungol7;

import java.util.Scanner;

public class Test_Main_7_9 {

    public static void main(String[] args) {
        //정수를 입력받아 다음과 같이 순서쌍을 출력하는 프로그램을 작성하시오.
        //입력 : 4
//        (1, 1) (1, 2) (1, 3) (1, 4)
//        (2, 1) (2, 2) (2, 3) (2, 4)
//        (3, 1) (3, 2) (3, 3) (3, 4)
//        (4, 1) (4, 2) (4, 3) (4, 4)

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        for (int i=1; i<=size; i++){
            for (int j=1; j<=size; j++)
                System.out.printf("(%d, %d) ", i, j);
            System.out.println();
        }
    }
}

