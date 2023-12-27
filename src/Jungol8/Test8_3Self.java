package Jungol8;

import java.util.Scanner;

public class Test8_3Self {

    public static void main(String[] args) {
    //자연수 n을 입력받아서 다음과 같이 출력하는 프로그램을 작성하시오

        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();


        for (int i=4; 0<i; i--) {// 4 || 3 || 2 || 1
            for (int j=0; j<i; j++) { //0< 4 || 3 || 2 ||1
                System.out.print("*");
            }
            System.out.print('\n');
        }


        for (int i=0; i<4; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.print('\n');
        }
    }
}
