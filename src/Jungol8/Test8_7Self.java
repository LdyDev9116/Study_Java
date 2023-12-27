package Jungol8;

import java.util.Scanner;

public class Test8_7Self {

    public static void main(String[] args) {


        //자연수 n을 입력받아서 다음과 같이 출력하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();
        int count = 1;
        char ch = 'A';

        for (int i=0; i<line; i++) {
            for (int j=line; i<j; j--)
                System.out.printf("%d ", count++);

            for (int k=0; k<=i; k++)
                System.out.printf("%c ", ch++);
            System.out.print('\n');
        }
    }
}

