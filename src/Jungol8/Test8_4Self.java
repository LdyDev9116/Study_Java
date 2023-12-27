package Jungol8;

import java.util.Scanner;

public class Test8_4Self {

    public static void main(String[] args) {


        //자연수 n을 입력받아서 다음과 같이 출력하는 프로그램을 작성하시오.

        Scanner sc = new Scanner(System.in);
//        int line = sc.nextInt();

        for (int i=0; i<3; i++) {    // 몇 번째 줄에 해당
            for (int k=0; k<i; k++){
                System.out.print(" ");
            }
            for (int j=3; i<j; j--){
//                System.out.print("*");
                System.out.print(j);
            }

            System.out.print('\n');
        }

    }
}