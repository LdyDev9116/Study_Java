package Jungol10;

public class TestSelfSub8 {

    public static void main(String[] args) {
//        반복제어문2_자가진단8
//        구구단의 일부를 다음과 같이 출력하는 프로그램을 작성하시오.
//        곱셈의 결과는 오른쪽으로 맞추어 출력을 하고 결과값 사이의 공백은 3칸으로 한다.
//        출력형식 예) 2_*_1_=__2___ (_는 공백을 나타내는 것임)

        for (int i = 2; i <= 4; i++) {
            for (int j = i; j <= 5; j++) {
              if (i*j >=10){
                  System.out.printf("%d * %d =  %d   ", i,j,i*j);
              }else{
                  System.out.printf("%d * %d =  %d   ", i,j,i*j);
              }
                System.out.println();
            }

        }


    }
}