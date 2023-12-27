package Jungol3;

import java.util.Scanner;

public class Test3_6Self {
    public static void main(String[] args) {
        //두 개의 정수를 입력받아서 다음과 같이 4가지 관계연산자의 결과를 출력하시오.
        //이때 입력받은 두 정수를 이용하여 출력하시오.
        //(JAVA는 1이면 true, 0이면 false를 출력한다.)

        //출력에 삼항연산자 비교로 출력

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.printf("%d > %d --- %b\n" ,num1,num2, num1 > num2 ? true: false); // 4 > 5  참이면 true 거짓이면 false
        System.out.printf("%d < %d --- %b\n" ,num1,num2, num1 < num2 ? true: false);

        System.out.printf("%d >= %d --- %b\n" ,num1,num2, num1 >= num2 ? true: false);
        System.out.printf("%d <= %d --- %b\n" ,num1,num2, num1 <= num2 ? true: false);




    }

}
