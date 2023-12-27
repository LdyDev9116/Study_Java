package Jungol7;

import java.util.Scanner;

public class Test_Main_7_1 {


    public static void main(String[] args) {
        //10 이하의 자연수 n을 입력받아
        // "JUNGOL "을 n번 출력하는 프로그램을 작성하시오.

        Scanner sc = new Scanner(System.in);
        int num  = sc.nextInt();
        int arr [] = new int [num];

        for (int i = 1; i <= arr.length; i++) {
            System.out.println("JUNGOL");
        }

    }

}
