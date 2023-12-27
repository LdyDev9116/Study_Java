package Jungol10;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

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