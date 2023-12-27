package Jungol10;

public class TestCaseSub8 {

    public static void main(String[] args) {

        //반복제어문2_연습문제8
        //아래와 같이 2단부터 4단까지의 구구단을 출력하는 프로그램을 작성하시오.

        for(int i=1; i<=9; i++){
            for(int j=2; j<=4; j++){
                System.out.print(j+" * "+i+" = "+j*i+"\t");
            }System.out.println();
        }

//        for (int i = 2; i <= 4; i++) {
//            for (int j = 1; j <= 9; j++) {
//                System.out.print(i + " * " + j + " = " + (i*j) +"\t");
////                System.out.printf("\n");
//
//            }
//            System.out.println();
//        }



    }
}