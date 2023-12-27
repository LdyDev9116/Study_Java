package JungolTest;

import java.util.Scanner;

public class Temp_triangle {

    public static void main(String[] args) {

        //자연수 n을 입력받아서 다음과 같이 출력하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();

        for (int i = 0; i < line; i++) {
            for (int k = 0; k < i; k++)
                System.out.print(" ");

            for (int j = 0; j < (2 * (line - i) - 1); j++)
                System.out.print("*");

            System.out.print('\n');
        }

    }

}

//*********
// *******
// *****
//  ***
//   *