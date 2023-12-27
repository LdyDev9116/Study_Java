package Jungol10;

public class TestSelfSub7 {

    public static void main(String[] args) {
        //반복제어문2_자가진단7

        for (int i = 1; i <= 5; i++) {
            for (int j = i + 1; j < i + 6; j++) {
                System.out.printf("%d ", j);
            }
            System.out.println(" ");
        }


        //아래와 같이 출력되는 프로그램을 작성하시오.
        //        2 3 4 5 6
        //        3 4 5 6 7
        //        4 5 6 7 8
        //        5 6 7 8 9
        //        6 7 8 9 10
    }
}