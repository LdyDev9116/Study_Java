package Jungol6;

import java.util.Scanner;

public class Test_Main_6_4 {

    public static void main(String[] args) {
        //0 이 입력될 때까지 정수를 계속 입력받아 3의 배수와 5의 배수를 제외한 수들의 개수를 출력하는 프로그램을 작성하시오
        //틀림

        Scanner sc = new Scanner(System.in);
        int threeCount =0; //3의배수
        int fiveCount =0; //5의 배수
        int numCount =0; // 3의배와 5의배수를 제외할 변수명
        int totalCount = 0; // 총개수

        //36 41 80 130 42 148 18 42 99 147 139 3 150 41 15 0
        while (true){
            int num = sc.nextInt();
            if (num == 0){
                break;
            }
            if (num % 3 == 0){ //9
                threeCount++;
            }
            if (num % 5 == 0){ //4
                fiveCount++;
            }
            totalCount++; //15

        }
        numCount = totalCount - (threeCount +fiveCount );
        System.out.println(totalCount);
        System.out.println(threeCount);
        System.out.println(fiveCount);
        System.out.println(numCount);




        }
}
