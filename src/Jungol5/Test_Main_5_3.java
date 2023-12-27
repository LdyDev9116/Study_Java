package Jungol5;

import java.util.Scanner;

public class Test_Main_5_3 {
    public static void main(String[] args) {

        //년도를 입력받아 윤년(leap year)인지 평년(common year)인지 판단하는 프로그램을 작성하시오.
        // 4로 나누어 떨어지는 해는 윤년
        // 100으로 나누어 떨어지는 해는 평년
        // 400으로 나누어 떨어지는 해는 윤년

        Scanner sc = new Scanner(System.in);

        int num [] = new int [1];

        for (int i = 0; i <num.length ; i++) {
            num[i] = sc.nextInt();
        }
        for (int i = 0; i <num.length ; i++) {
           if (num[i] % 4 == 0 && num[i]% 100 != 0  || num[i] % 400 == 0)  {
               System.out.println("leap year");
           }
            else{
                System.out.println("common year");
            }


        }
    }

}
