package Jungol10;

public class TestSelfDtl5 {

    public static void main(String[] args) {
        //반복제어문3_자가진단5
        //자연수 n을 입력받아서 다음과 같이 출력하는 프로그램을 작성하시오.


        for (int i = 0; i < 4; i++) { //4줄 출력
            for (int j = 1; j <= i; j++) { //삼각형 별을 출력하기 위해 공백 생성
                System.out.print(" ");
            }
            for (int j = 7; j >= i * 2 + 1; j--) { //각행의 홀수(삼각형줄) 만큼 별출력
                System.out.print("*");
            }
            System.out.println();
        }
    }
}