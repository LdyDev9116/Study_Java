package Jungol5;

import java.util.Scanner;

public class Test5_5Self {

    public static void main(String[] args) {

        //두 개의 실수를 입력받아 모두 4.0 이상이면 "A", 모두 3.0 이상이면 "B", 아니면 "C" 라고 출력하는 프로그램을 작성하시오.
        //..

        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        if (num1>=4 && num2>=4 ){
            System.out.println("A");
        }else if(num1>=3 && num2>=3){
            System.out.println("B");
        }else {
            System.out.println("C");
        }


    }
}
