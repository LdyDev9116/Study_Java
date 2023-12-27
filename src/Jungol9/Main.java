package Jungol9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //100 개의 정수를 저장할 수 있는 배열을 선언하고 정수를 차례로 입력받다가 0 이 입력되면
        // 0 을 제외하고 그 때까지 입력된 정수를 가장 나중에 입력된 정수부터 차례대로 출력하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);
        int num = -1;
        List<Integer> list = new ArrayList<>();
        while (true) {
            num = sc.nextInt();

            if (num != 0) {
                list.add(num);
            } else break;
        }
        int len = list.size();

        while (len-- > 0) {
            System.out.print(list.get(len) + " ");


        }
    }
}
