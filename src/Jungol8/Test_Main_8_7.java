package Jungol8;

import java.util.Scanner;

public class Test_Main_8_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();
        int count = 0;
        char ch = 'A';

        for (int i=0; i<line; i++) {
            for (int k=0; k<(line-i); k++)
                System.out.printf("%c ", ch++);

            for (int j=0; j<i; j++)
                System.out.print((count++) + " ");

            System.out.print('\n');
        }

    }
}
