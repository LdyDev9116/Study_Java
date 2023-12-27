package Jungol8;

import java.util.Scanner;

public class Test_Main_8_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();
        int count = 1;

        for (int i=0; i<line; i++) {
            for (int k=0; k<i; k++)
                System.out.print("  ");

            for (int j=0; j<(line-i); j++)
                System.out.print((count++) + " ");

            System.out.print('\n');
        }

    }
}

