package Jungol8;

import java.util.Scanner;

public class Test8_1Self {

    public static void main(String[] args) {


        //자연수 n을 입력받고
        // 1부터 홀수를 차례대로 더해나가면서 합이 n 이상이면 그 때까지 더해진 홀수의 개수와 그 합을 출력하는 프로그램을 작성하시오.

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0, count = 0;

        for (int i=0; sum < num; i++) {
            sum += (2*i)+1;
            count++;
        }

        System.out.println(count + " " + sum);
    }
}

