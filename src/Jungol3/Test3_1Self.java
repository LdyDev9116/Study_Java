package Jungol3;

import java.util.Scanner;

public class Test3_1Self {
    public static void main(String[] args) {
        //세 개의 정수를 입력 받아서 합계와 평균을 출력하시오. (단 평균은 소수 이하를 버리고 정수부분만 출력한다.)
        // 합계 및 평균 구하기

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;

            for (int i = 0; i <3 ; i++) {
                int input = sc.nextInt();
                if (input == 0){
                    break;
                }
                count++;
                sum += input;
            }
        System.out.println( "sum : "+ sum);
        System.out.println( "avg : "+ sum /count );


    }

}
