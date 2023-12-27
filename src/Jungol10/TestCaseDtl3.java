package Jungol10;

public class TestCaseDtl3 {

    public static void main(String[] args) {
        //반복제어문3 연습문제3
        //아래 모양과 같이 출력하는 프로그램을 for문을 이용하여 작성하시오.
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();

        for(int i = 0; i <= 3; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }System.out.println("");
        }

        for(int i = 0; i <= 3; i++) {
            for(int j = 3; j > i; j--) {
                System.out.print("*");
            }System.out.println("");
        }


    }
}