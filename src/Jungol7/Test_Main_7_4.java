package Jungol7;

import java.util.Scanner;

public class Test_Main_7_4 {

    public static void main(String[] args) {
        //
        //100 이하의 자연수 n을 입력받고 n개의 정수를 입력받아 평균을 출력하는 프로그램을 작성하시오. (평균은 반올림하여 소수 둘째자리까지 출력하도록 한다.)
        // 입력값 :3
        //99 65 30 = 64.67

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr [] = new int [num];
        double age =0.0 ;
        int count = 0;
        int sum =0;

        for (int i = 0; i < arr.length; i++) { // num: 20 40 60 80
            arr[i]= sc.nextInt();
            sum += arr[i];
            count++ ;
        }

        age = (double) sum/count;

//        System.out.println(count);
//        System.out.println(sum);
        System.out.printf("%.2f",age);

    }

}
