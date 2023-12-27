package Jungol8;

import java.util.Scanner;

public class Test_Main_8_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();

        for (int i=0; i<line; i++) {
            for (int k=(2*i+1); k<(2*line-1); k++)
                System.out.print(" ");

            for (int j=0; j<(2*i+1); j++)
                System.out.print("*");

            System.out.print('\n');
        }

    }
}
