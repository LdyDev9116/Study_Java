package Jungol9;

import java.util.Scanner;

public class Test9_4Self {
    static final int LIMIT = 100;

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int[] num = new int[LIMIT];
        int start_num = 0;

        for (int i = 0; i < LIMIT; i++) {
            num[i] = sc.nextInt();

            if (num[i] == 0) {
                start_num = i - 1;
                break;
            }
        }

        for (int i = start_num; 0 <= i; i--)
            System.out.print(num[i] + " ");
    }
}