package Jungol6;

import java.util.Scanner;

public class Test_Main_6_1 {

    public static void main(String[] args) {
        //정수를 입력받아 1부터 입력받은 정수까지를 차례대로 출력하는 프로그램을 작성하시오.
        // 96 입력  : 1~ 96
        Scanner sc = new Scanner(System.in);
        int num  =sc.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.print(i + " ");
        }



    }

}
