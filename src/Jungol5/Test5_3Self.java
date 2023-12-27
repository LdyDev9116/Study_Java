package Jungol5;

import java.util.Scanner;

public class Test5_3Self {

    public static void main(String[] args) {


        //나이를 입력받아 20살 이상이면 "adult"라고 출력하고
        // 그렇지 않으면 몇 년후에 성인이 되는지를 "○ years later"라는 메시지를 출력하는 프로그램을 작성하시오

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age >20 ){
            System.out.printf("adult");
        }else{
            System.out.print(20 -age);
            System.out.printf(" years later" );
        }

    }
}
