package Jungol5;

import java.util.Scanner;

public class Test5_9Self {

    public static void main(String[] args) {
//      3개의 정수를 입력받아 조건연산자를 이용하여 입력받은 수들 중 최소값을 출력하는 프로그램을 작성하시오.
//      18 -5 10  최대값 / 최소값 구하기  [ 입력한 배열수만큼 ]

        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt(); // 입력 받고자 하는 수의 갯수를 입력 받아 변수에 저장
        int num [] = new int  [count];// 입력 받은 정수를 저장할 배열 생성

        //입력
        for (int i = 0; i < num.length; i++) { // num 배열의 길이만큼 반복
            System.out.print("num[" + i + "] = ");
            num[i] =sc.nextInt();  // 입력 받은 정수를 배열에 저장
        }
        sc.close();


        // 최댓값 구하기
        int max = num[0];
        for (int i = 0; i <num.length; i++) { // 두 번째부터 마지막 배열의 값까지 반복
            if (max < num[i] ){ //조건문 if (18 < -5)의 경우, 조건이 거짓이므로 해당 블록 안의 코드는 실행되지 않음
                max = num[i]; // 각 배열의 값을 차례대로 max의 값과 비교하여 더 큰 값을 max에 대입
            }
        }

        System.out.println("최댓값 : " + max);

        // 최솟값 구하기
        int min = num[0]; // 첫 번째 배열의 값을 변수에 대입
        for(int i=1; i<num.length; i++) { // 두 번째부터 마지막 배열의 값까지 반복
            if(min > num[i]){//18 >10
                min = num[i]; // 각 배열의 값을 차례대로 min의 값과 비교하여 더 작은 값을 min에 대입
            }
        }
        System.out.println("최솟값 : " + min);

    }
}
