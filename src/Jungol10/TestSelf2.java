package Jungol10;

import java.util.Scanner;

public class TestSelf2 {

    public static void main(String[] args) {
    //반복제어문1_자가진단2
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 0 ;
        int sum = 0 ;

        if (0 <= num && num <= 100){
            while (i <= num){
                sum = sum + i;
                i++;
            }
            System.out.println("1-10의 합계: " +sum);
        }

    }

}
