package Jungol10;

import java.util.Scanner;

public class TestSelfSub1 {

    public static void main(String[] args) {
        //반복제어문2_자가진단1
        //문자를 입력받아서 입력받은 문자를 20번 반복하여 출력하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i =0 ;
        while (i<20){
            System.out.print(s);
            i++;
        }

    }
}