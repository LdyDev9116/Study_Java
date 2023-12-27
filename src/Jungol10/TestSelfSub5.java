package Jungol10;

import java.util.Scanner;

public class TestSelfSub5 {

    public static void main(String[] args) {
        //반복제어문2_자가진단5
        //10개의 정수를 입력받아 3의 배수의 개수와 5의 배수의 개수를 각각 출력하는 프로그램을 작성하시오.

        Scanner sc = new Scanner(System.in);

        int multipleThree = 0;
        int multipleFive  = 0;


        for (int i = 1; i <= 10; i++) {
            int count = sc.nextInt();

            if (count % 3 == 0){
                multipleThree += 1;
            }
            if (count % 5 == 0){
                multipleFive += 1;
            }

        }
        System.out.println("Multiples of 3 : " + multipleThree);
        System.out.println("Multiples of 5 : " + multipleFive);

    }
}