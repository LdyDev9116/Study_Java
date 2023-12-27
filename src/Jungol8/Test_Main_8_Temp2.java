package Jungol8;

import java.util.Scanner;

public class Test_Main_8_Temp2 {

    public static void main(String[] args) {
        //정수 20 개를 입력받아서 그 합과 평균을 출력하되 0 이 입력되면 20개 입력이 끝나지 않았더라도 그 때까지 입력된 합과 평균을 출력하는 프로그램을 작성하시오.
        //
        //평균은 소수부분은 버리고 정수만 출력한다.(0이 입력된 경우 0을 제외한 합과 평균을 구한다.)

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int mul = 1;;

        while (true) {
            if (((num*mul)%10) == 0) {
                System.out.print(num*mul + " ");
                break;
            }
            else if (100 <= (num*mul)) {
                break;
            }

            System.out.print(num*mul + " ");
            mul++;
        }
    }
}

