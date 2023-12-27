package Jungol8;

import java.util.Scanner;

public class Test_Main_8_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();

        for (int i=0; i<line; i++) {
            for (int k=0; k<(line-i)-1; k++)
                System.out.print("  ");

            for (int j=0; j<=i; j++)
                System.out.print((j+1) + " ");

            System.out.print('\n');
        }

    }
}
