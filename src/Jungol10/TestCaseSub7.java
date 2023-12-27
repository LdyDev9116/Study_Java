package Jungol10;

public class TestCaseSub7 {

    public static void main(String[] args) {

        //반복제어문2_연습문제7
        //아래 출력예와 같이 출력하는 프로그램을 작성하시오.



        for (int i = 1; i <= 5; i++) {
            for (int j = i + 1; j < i + 6; j++) {
                System.out.printf("%d ", i);
            }
            System.out.println(" ");
        }

        System.out.println();


        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <  6; j++) {
                System.out.printf("%d ", j);
            }
            System.out.println(" ");
        }

        //        2 3 4 5
        //        3 4 5
        //        4 5
        //        5
//        for (int i = 1; i <= 5; i++) {
//            for (int j = i + 1; j <  6; j++) {
//                System.out.printf("%d ", j);
//            }
//            System.out.println(" ");
//        }


    }
}