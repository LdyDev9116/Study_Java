package Jungol6;

import java.util.Scanner;

public class Test_Main_6_3 {

    public static void main(String[] args) {
        //0 부터 100 까지의 정수를 계속 입력받다가 범위를 벗어나는 수가 입력되면
        //그 이전까지 입력된 자료의 합계와 평균을 출력하는 프로그램을 작성하시오.
        //(평균은 반올림하여 소수 첫째자리까지 출력한다.)
        // 합계 및 평균

        Scanner sc = new Scanner(System.in);
        int num = 0;
        int sum =0 ;
        int count =0;
        double avg = 0;

        while (true){
             num = sc.nextInt();
            if (0 <= num  &&  num <= 100 ) { //0이상 100이하만 합계 및 개수 카운트
                sum += num ;
                count ++;
            }else{
                break;
            }

            avg = (double)sum/count;

        }

        System.out.printf("sum : %d ",sum);
        System.out.println();
        System.out.printf("avg : %.1f",avg);

        }
}
