package Jungol10;

public class TestCaseDtl4 {

    public static void main(String[] args) {
        //반복제어문3 연습문제4
        //아래 모양과 같이 출력하는 프로그램을 for문을 이용하여 작성하시오.

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();

        for (int i = 0; i < 5; i++) { //4줄 생성
            for (int j = 4; j >= 0; j--) { //j가 0보다 크나거나 같다면
                if (i < j) { //참이면 빈칸에 공백 출력
                    System.out.print(" ");
                } else {    //거짓이면 별 출력
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}