package Jungol8;

import java.util.Scanner;

public class Test_Main_8_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();

        // 위 삼각형
        for (int i=0; i<line; i++) {
            for (int k=0; k<i; k++)
                System.out.print(" ");

            for (int j=0; j<((2*(line-i))-1); j++)
                System.out.print("*");

            System.out.print('\n');
        }


        // 아래 삼각형
        for (int i=1; i<line; i++) {
            for (int k=0; k<(line-i-1); k++)
                System.out.print(" ");

            for (int j=0; j<((2*i)+1); j++)
                System.out.print("*");

            System.out.print('\n');
        }
    }
}
