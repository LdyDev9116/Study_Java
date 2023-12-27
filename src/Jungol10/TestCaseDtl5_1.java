package Jungol10;

public class TestCaseDtl5_1 {

    public static void main(String[] args) {
        //반복제어문3 연습문제5_!
        //아래와 같이 출력하는 프로그램을 작성하시오.

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();

        for (int i = 0; i < 5; i++) { //4줄 생성
            for (int j = 0; j < 3 - i; j++) { //삼각형 별을 출력하기 위해 공백 생성
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) { //각행의 홀수(삼각형줄) 만큼 별출력
                System.out.print("*");
            }
            System.out.println();
        }
    }
}