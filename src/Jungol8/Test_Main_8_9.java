package Jungol8;

import java.util.Scanner;

public class Test_Main_8_9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();

        for (int i=0; i<line; i++) {
            for (int j=0; j<=i; j++)
                System.out.print("# ");

            System.out.print('\n');
        }

        for (int i=1; i<line; i++) {
            for (int k=0; k<i; k++)
                System.out.print("  ");

            for (int j=0; j<(line-i); j++)
                System.out.print("# ");

            System.out.print('\n');
        }

    }
}

