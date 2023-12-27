package Jungol5;

import java.util.Scanner;

public class Test_Main_5_2 {

    public static void main(String[] args) {
        //정수를 입력받아 0 이면 "zero" 양수이면 "plus" 음수이면 "minus" 라고 출력하는 프로그램을 작성하시오.

        Scanner sc = new Scanner(System.in);

        int num [] = new int [1];

        for (int i = 0; i <num.length ; i++) {
             num[i] = sc.nextInt();
        }
        for (int i = 0; i <num.length ; i++) {
            if (num[i] == 0 ){
                System.out.println("zero");
            }
            if (num[i] > 0 ){
                System.out.println("plus");
            }
            if (num[i] < 0 ){
                System.out.println("minus");
            }
        }


    }

}
