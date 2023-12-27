package Jungol10;

import java.util.Scanner;

public class TestSelfDtl4 {

    public static void main(String[] args) {
        //반복제어문3_자가진단4
        //자연수 n을 입력받아서 다음과 같이 출력하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for( int i = 0; i < n; i++ ) {
            for( int j = 0; j < n; j++) {
                if(i > j) {
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }System.out.println("");
        }


    }

}