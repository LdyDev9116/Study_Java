package Jungol3;

import java.util.Scanner;

public class Test3_1 {
    public static void main(String[] args) {
        //두 개의 정수를 입력받아 다음과 같이 출력하는 프로그램을 작성하시오. 
        //사칙연산

        Scanner sc = new Scanner(System.in);

        int a = 7 ;
        int b = 5 ;

        int add = a+b;
        int sub = a-b;
        int mult = a*b;
        int div = a/b;
        int mod = a%b;
        System.out.print("두 개의 수를 입력하시오.");
        System.out.printf(" %d + %d = %d \n" ,a,b, add);
        System.out.printf("%d - %d = %d\n" ,a,b, sub);
        System.out.printf("%d * %d = %d\n" ,a,b, mult);
        System.out.printf("%d / %d = %d\n" ,a,b, div);
        System.out.println( "7 % 5 = " + mod);
    }

}
