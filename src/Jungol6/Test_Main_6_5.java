package Jungol6;

import java.util.Scanner;

public class Test_Main_6_5 {

    public static void main(String[] args) {
        //삼각형의 밑변의 길이와 높이를 입력받아 넓이를 출력하고,
        // "Continue? "에서 하나의 문자를 입력받아 그 문자가 'Y' 나 'y' 이면 작업을 반복하고 다른 문자이면 종료하는 프로그램을 작성하시오.
        //(넓이는 반올림하여 소수 첫째자리까지 출력한다.)

        Scanner sc = new Scanner(System.in);
        int Base = 0;
        int Height  = 0;
        double width;
//        String answer ;
        char answer  = 0 ;

        while (true){
            System.out.print("Base = ");
            Base = sc.nextInt();
            System.out.print("Height = ");
            Height = sc.nextInt();

            width = (double)(Base * Height) / 2;
            System.out.printf("Triangle width = %.1f\n", width);
            System.out.print("Continue? ");

            answer = sc.next().charAt(0);
//            answer = sc.nextLine();
//            if (answer.equals("Y") || answer.equals("y") ){
            if (answer == 'Y' || answer == 'y'   ){
                continue;
            }else{
                break;
            }


        }


    }
}
