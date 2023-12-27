package JungolTest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //10개의 정수를 입력받아 배열에 저장한 후 내림차순으로 정렬하여 출력하시오.
        int [] arr  = new int [10];
        Scanner sc = new Scanner(System.in);
        int num =0 ;

        for (int i = 0; i < 10; i++) {
            num = sc.nextInt();
            if (num == 0){
                break;
            }

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }



    }

}
