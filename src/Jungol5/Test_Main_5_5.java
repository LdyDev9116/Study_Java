package Jungol5;

import java.util.Scanner;

public class Test_Main_5_5 {
    public static void main(String[] args) {
        //1~12사이의 정수를 입력받아 평년의 경우 입력받은 월의 날수를 출력하는 프로그램을 작성하시오.
        Scanner scanner = new Scanner(System.in);

        // 1에서 12 사이의 정수 입력받음
//        System.out.print("1에서 12 사이의 정수(월)를 입력하세요: ");
        int month = scanner.nextInt();

        // 입력받은 월의 날 수 출력
        int days = getDaysInMonth(month);

        if (days != -1) {
//            System.out.println(month + "월은 " + days + "일까지 있습니다.");
            System.out.println(days);
        } else {
            System.out.println("잘못된 월을 입력하셨습니다. 1에서 12 사이의 정수를 입력하세요.");
        }
    }

    // 월의 날 수를 반환하는 메서드
    private static int getDaysInMonth(int month) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return 28; // 2월은 평년 기준으로 28일
            default:
                return -1; // 잘못된 월이 입력된 경우
        }
    }
}
