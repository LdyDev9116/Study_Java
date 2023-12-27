package Jungol10;

import java.util.Scanner;

public class TestCase3 {

    public static void main(String[] args) {

        //반복제어문1_연습문제3
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("점수를 입력하세요. ");
            int grade = sc.nextInt();

            if (0 > grade || grade > 100 ) { // grade:101 > 100 || 0 > grade:-1
                System.exit(0);
            } else if (grade >= 80) {
                System.out.println("축하합니다. 합격입니다.");
            }
            else{
                System.out.println("죄송합니다. 불합격입니다.");
            }
        }


    }
}


