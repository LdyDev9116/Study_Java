package Jungol10;

import java.util.Scanner;

public class TestSelf4 {

    public static void main(String[] args) {
        //반복제어문1_자가진단4
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        int count = 0;
        double avg = 0;

        while(true) {
            num = sc.nextInt();
            count++;
            sum += num;
            if(num >= 100) {
                break;
            }
        }
        avg = (double)sum/count;
        System.out.printf("%d\n", sum);
        System.out.printf("%.1f\n", avg);

    }

}
