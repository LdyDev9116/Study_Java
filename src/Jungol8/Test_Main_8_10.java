package Jungol8;

import java.util.Scanner;

public class Test_Main_8_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();
        int num = 1;

        for (int i=0; i<line; i++) {
            for (int j=0; j<line; j++){
                System.out.print(num + " ");
                num += 2;

                if (10 <= num)
                    num = 1;
            }
            System.out.print('\n');
        }

    }
}
