package Jungol5;

import java.util.Scanner;

public class Test_Main_5_1 {

    public static void main(String[] args) {
        //두 개의 정수를 입력받아 큰 수에서 작은 수를 뺀 차를 출력하는 프로그램을 작성하시오.
        // 두개 정수 큰수 - 작은수 (최대값 - 최소값) 차출력

        Scanner sc = new Scanner(System.in);

        int num [] = new int [2];

        for (int i = 0; i <num.length ; i++) {
             num[i] = sc.nextInt();
        }

        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            if (max< num[i]){
                max = num[i];
            }

        }
//        System.out.println(max);
        int min = num[0];
        for (int i = 0; i < num.length; i++) {
            if (min >num[i]){
                min = num[i];
            }

        }
//        System.out.println(min);

        System.out.println(max - min);



    }

}
